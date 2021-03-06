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

public class CurrentInputBase extends Phidget {

	CurrentInputBase(long handle) {
		super(handle);
	}

	public CurrentInputBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableCurrentChangeEvents(enable && currentChangeListeners.size() > 0);
	}

	public final void addCurrentChangeListener(CurrentInputCurrentChangeListener l) {
		synchronized(currentChangeListeners) {
			currentChangeListeners.add(l);
			enableCurrentChangeEvents(true);
		}
	}
	private List<CurrentInputCurrentChangeListener> currentChangeListeners = new ArrayList<CurrentInputCurrentChangeListener>();
	private long nativeCurrentChangeHandler = 0;
	public final void removeCurrentChangeListener(CurrentInputCurrentChangeListener l) {
		synchronized(currentChangeListeners) {
			currentChangeListeners.remove(l);
			enableCurrentChangeEvents(currentChangeListeners.size() > 0);
		}
	}
	private void fireCurrentChange(CurrentInputCurrentChangeEvent e) {
		synchronized(currentChangeListeners) {
			for (Iterator it = currentChangeListeners.iterator (); it.hasNext();)
			((CurrentInputCurrentChangeListener) it.next ()).onCurrentChange (e);
		}
	}
	private native void enableCurrentChangeEvents(boolean b);


	public native double getCurrent() throws PhidgetException;
	public native double getMinCurrent() throws PhidgetException;
	public native double getMaxCurrent() throws PhidgetException;
	public native double getCurrentChangeTrigger() throws PhidgetException;
	public native void setCurrentChangeTrigger(double CurrentChangeTrigger) throws PhidgetException;
	public native double getMinCurrentChangeTrigger() throws PhidgetException;
	public native double getMaxCurrentChangeTrigger() throws PhidgetException;
	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native PowerSupply getPowerSupply() throws PhidgetException;
	public native void setPowerSupply(PowerSupply PowerSupply) throws PhidgetException;
}
