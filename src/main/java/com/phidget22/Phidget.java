/*
 * This file is part of Phidget22.jar
 *
 * Copyright 2017 Phidgets Inc <patrick@phidgets.com>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see
 * <http://www.gnu.org/licenses/>
 */

package com.phidget22;

public class Phidget extends PhidgetBase implements java.util.Comparator<Phidget> {
	private String _phidgetidstr;

	Phidget(long handle) {
		super(handle);
	}

	/**
	 * Return a Sring describing this Phidget.
	 */
	public String toString() {
		try {
			return (getDescription());
		}
		catch (PhidgetException ex) {
			return ("["+getClass().getName()+"]");
		}
	}

	public String getPhidgetIDString() {
		StringBuffer key;

		if (_phidgetidstr != null)
			return (_phidgetidstr);

		try {
			key = new StringBuffer();
			if (getIsLocal())
				key.append('L');
			else
				key.append('N');

			if (getIsChannel()) {
				key.append('_').append('C').append(getChannel());
				key.append('_').append(getChannelClass());
			} else {
				key.append('_').append('D').append('_').append(getDeviceClass());
				key.append('_').append(getDeviceID());
				if (getIsHubPortDevice())
					key.append('_').append('H');
			}

			key.append('_').append(getHubPort());
			key.append('_').append(getDeviceSerialNumber());

			_phidgetidstr = key.toString();
			return (_phidgetidstr);
		} catch (PhidgetException ex) {
			return ("_invalid_a_phidget_");
		}
	}

	public boolean equals(Object o) {

		if (o == null)
			return (false);

		if (!(o instanceof Phidget))
			return (false);

		return (hashCode() == o.hashCode());
	}

	public int hashCode() {

		return (getPhidgetIDString().hashCode());
	}

	public int compare(Phidget a, Phidget b) {

		try {
			/*
			 * Local is greater than remote.
			 */
			if (a.getIsLocal()) {
				if (b.getIsLocal() == false)
					return (1);
			} else {
				if (b.getIsLocal())
					return (-1);
			}

			int sndiff = a.getDeviceSerialNumber() - b.getDeviceSerialNumber();
			if (sndiff != 0)
				return (sndiff);

			int hpdiff = a.getHubPort() - b.getHubPort();
			if (hpdiff != 0)
				return (hpdiff);

			/*
			 * Channels are less than devices.
			 */
			if (a.getIsChannel()) {
				if (b.getIsChannel() == false)
					return (-1);

				int chdiff = a.getChannel() - b.getChannel();
				if (chdiff != 0)
					return (chdiff);

				int chcldiff = a.getChannelClassName().compareTo(b.getChannelClassName());
				if (chcldiff != 0)
					return (chcldiff);
			} else {
				if (b.getIsChannel())
					return (1);

				int dcldiff = a.getDeviceClassName().compareTo(b.getDeviceClassName());
				if (dcldiff != 0)
					return (dcldiff);

				int diddiff = a.getDeviceID().ordinal() - b.getDeviceID().ordinal();
				if (diddiff != 0)
					return (diddiff);

				/* Hub port devicse are less than */
				if (a.getIsHubPortDevice()) {
					if (!b.getIsHubPortDevice())
						return (-1);
				} else {
					if (b.getIsHubPortDevice())
						return (1);
				}
			}
		} catch (PhidgetException pe) {
			return (-1);
		}

		return (0);
	}

	protected void finalize() throws Throwable {

		try {
			deleteHandle();
			super.handle = 0;
		} finally {
			super.finalize();
		}
	}

	private native java.lang.String getDescription() throws PhidgetException;
	private native void deleteHandle() throws PhidgetException;
}
