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

public class AccelerometerBase extends Phidget {

	AccelerometerBase(long handle) {
		super(handle);
	}

	public AccelerometerBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableAccelerationChangeEvents(enable && accelerationChangeListeners.size() > 0);
	}

	public final void addAccelerationChangeListener(AccelerometerAccelerationChangeListener l) {
		synchronized(accelerationChangeListeners) {
			accelerationChangeListeners.add(l);
			enableAccelerationChangeEvents(true);
		}
	}
	private List<AccelerometerAccelerationChangeListener> accelerationChangeListeners = new ArrayList<AccelerometerAccelerationChangeListener>();
	private long nativeAccelerationChangeHandler = 0;
	public final void removeAccelerationChangeListener(AccelerometerAccelerationChangeListener l) {
		synchronized(accelerationChangeListeners) {
			accelerationChangeListeners.remove(l);
			enableAccelerationChangeEvents(accelerationChangeListeners.size() > 0);
		}
	}
	private void fireAccelerationChange(AccelerometerAccelerationChangeEvent e) {
		synchronized(accelerationChangeListeners) {
			for (Iterator it = accelerationChangeListeners.iterator (); it.hasNext();)
			((AccelerometerAccelerationChangeListener) it.next ()).onAccelerationChange (e);
		}
	}
	private native void enableAccelerationChangeEvents(boolean b);


	public native double[] getAcceleration() throws PhidgetException;
	public native double[] getMinAcceleration() throws PhidgetException;
	public native double[] getMaxAcceleration() throws PhidgetException;
	public native double getAccelerationChangeTrigger() throws PhidgetException;
	public native void setAccelerationChangeTrigger(double AccelerationChangeTrigger) throws PhidgetException;
	public native double getMinAccelerationChangeTrigger() throws PhidgetException;
	public native double getMaxAccelerationChangeTrigger() throws PhidgetException;
	public native int getAxisCount() throws PhidgetException;
	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native double getTimestamp() throws PhidgetException;
}
