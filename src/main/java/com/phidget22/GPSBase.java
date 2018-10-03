/* DO NOT EDIT THIS FILE - it is machine generated */

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
import java.util.*;

public class GPSBase extends Phidget {

	GPSBase(long handle) {
		super(handle);
	}

	public GPSBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableHeadingChangeEvents(enable && headingChangeListeners.size() > 0);
		enablePositionChangeEvents(enable && positionChangeListeners.size() > 0);
		enablePositionFixStateChangeEvents(enable && positionFixStateChangeListeners.size() > 0);
	}

	public final void addHeadingChangeListener(GPSHeadingChangeListener l) {
		synchronized(headingChangeListeners) {
			headingChangeListeners.add(l);
			enableHeadingChangeEvents(true);
		}
	}
	private List<GPSHeadingChangeListener> headingChangeListeners = new ArrayList<GPSHeadingChangeListener>();
	private long nativeHeadingChangeHandler = 0;
	public final void removeHeadingChangeListener(GPSHeadingChangeListener l) {
		synchronized(headingChangeListeners) {
			headingChangeListeners.remove(l);
			enableHeadingChangeEvents(headingChangeListeners.size() > 0);
		}
	}
	private void fireHeadingChange(GPSHeadingChangeEvent e) {
		synchronized(headingChangeListeners) {
			for (Iterator it = headingChangeListeners.iterator (); it.hasNext();)
			((GPSHeadingChangeListener) it.next ()).onHeadingChange (e);
		}
	}
	private native void enableHeadingChangeEvents(boolean b);

	public final void addPositionChangeListener(GPSPositionChangeListener l) {
		synchronized(positionChangeListeners) {
			positionChangeListeners.add(l);
			enablePositionChangeEvents(true);
		}
	}
	private List<GPSPositionChangeListener> positionChangeListeners = new ArrayList<GPSPositionChangeListener>();
	private long nativePositionChangeHandler = 0;
	public final void removePositionChangeListener(GPSPositionChangeListener l) {
		synchronized(positionChangeListeners) {
			positionChangeListeners.remove(l);
			enablePositionChangeEvents(positionChangeListeners.size() > 0);
		}
	}
	private void firePositionChange(GPSPositionChangeEvent e) {
		synchronized(positionChangeListeners) {
			for (Iterator it = positionChangeListeners.iterator (); it.hasNext();)
			((GPSPositionChangeListener) it.next ()).onPositionChange (e);
		}
	}
	private native void enablePositionChangeEvents(boolean b);

	public final void addPositionFixStateChangeListener(GPSPositionFixStateChangeListener l) {
		synchronized(positionFixStateChangeListeners) {
			positionFixStateChangeListeners.add(l);
			enablePositionFixStateChangeEvents(true);
		}
	}
	private List<GPSPositionFixStateChangeListener> positionFixStateChangeListeners = new ArrayList<GPSPositionFixStateChangeListener>();
	private long nativePositionFixStateChangeHandler = 0;
	public final void removePositionFixStateChangeListener(GPSPositionFixStateChangeListener l) {
		synchronized(positionFixStateChangeListeners) {
			positionFixStateChangeListeners.remove(l);
			enablePositionFixStateChangeEvents(positionFixStateChangeListeners.size() > 0);
		}
	}
	private void firePositionFixStateChange(GPSPositionFixStateChangeEvent e) {
		synchronized(positionFixStateChangeListeners) {
			for (Iterator it = positionFixStateChangeListeners.iterator (); it.hasNext();)
			((GPSPositionFixStateChangeListener) it.next ()).onPositionFixStateChange (e);
		}
	}
	private native void enablePositionFixStateChangeEvents(boolean b);


	public native double getAltitude() throws PhidgetException;
	public native GPSDate getDate() throws PhidgetException;
	public native java.util.Calendar getDateAndTime() throws PhidgetException;
	public native double getHeading() throws PhidgetException;
	public native double getLatitude() throws PhidgetException;
	public native double getLongitude() throws PhidgetException;
	public native NMEAData getNMEAData() throws PhidgetException;
	public native boolean getPositionFixState() throws PhidgetException;
	public native GPSTime getTime() throws PhidgetException;
	public native double getVelocity() throws PhidgetException;
}