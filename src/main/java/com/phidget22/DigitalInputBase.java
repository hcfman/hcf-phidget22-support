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

public class DigitalInputBase extends Phidget {

	DigitalInputBase(long handle) {
		super(handle);
	}

	public DigitalInputBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableStateChangeEvents(enable && stateChangeListeners.size() > 0);
	}

	public final void addStateChangeListener(DigitalInputStateChangeListener l) {
		synchronized(stateChangeListeners) {
			stateChangeListeners.add(l);
			enableStateChangeEvents(true);
		}
	}
	private List<DigitalInputStateChangeListener> stateChangeListeners = new ArrayList<DigitalInputStateChangeListener>();
	private long nativeStateChangeHandler = 0;
	public final void removeStateChangeListener(DigitalInputStateChangeListener l) {
		synchronized(stateChangeListeners) {
			stateChangeListeners.remove(l);
			enableStateChangeEvents(stateChangeListeners.size() > 0);
		}
	}
	private void fireStateChange(DigitalInputStateChangeEvent e) {
		synchronized(stateChangeListeners) {
			for (Iterator it = stateChangeListeners.iterator (); it.hasNext();)
			((DigitalInputStateChangeListener) it.next ()).onStateChange (e);
		}
	}
	private native void enableStateChangeEvents(boolean b);


	public native InputMode getInputMode() throws PhidgetException;
	public native void setInputMode(InputMode InputMode) throws PhidgetException;
	public native PowerSupply getPowerSupply() throws PhidgetException;
	public native void setPowerSupply(PowerSupply PowerSupply) throws PhidgetException;
	public native boolean getState() throws PhidgetException;
}
