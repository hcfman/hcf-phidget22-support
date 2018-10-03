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

public class HumiditySensorBase extends Phidget {

	HumiditySensorBase(long handle) {
		super(handle);
	}

	public HumiditySensorBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableHumidityChangeEvents(enable && humidityChangeListeners.size() > 0);
	}

	public final void addHumidityChangeListener(HumiditySensorHumidityChangeListener l) {
		synchronized(humidityChangeListeners) {
			humidityChangeListeners.add(l);
			enableHumidityChangeEvents(true);
		}
	}
	private List<HumiditySensorHumidityChangeListener> humidityChangeListeners = new ArrayList<HumiditySensorHumidityChangeListener>();
	private long nativeHumidityChangeHandler = 0;
	public final void removeHumidityChangeListener(HumiditySensorHumidityChangeListener l) {
		synchronized(humidityChangeListeners) {
			humidityChangeListeners.remove(l);
			enableHumidityChangeEvents(humidityChangeListeners.size() > 0);
		}
	}
	private void fireHumidityChange(HumiditySensorHumidityChangeEvent e) {
		synchronized(humidityChangeListeners) {
			for (Iterator it = humidityChangeListeners.iterator (); it.hasNext();)
			((HumiditySensorHumidityChangeListener) it.next ()).onHumidityChange (e);
		}
	}
	private native void enableHumidityChangeEvents(boolean b);


	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native double getHumidity() throws PhidgetException;
	public native double getMinHumidity() throws PhidgetException;
	public native double getMaxHumidity() throws PhidgetException;
	public native double getHumidityChangeTrigger() throws PhidgetException;
	public native void setHumidityChangeTrigger(double HumidityChangeTrigger) throws PhidgetException;
	public native double getMinHumidityChangeTrigger() throws PhidgetException;
	public native double getMaxHumidityChangeTrigger() throws PhidgetException;
}
