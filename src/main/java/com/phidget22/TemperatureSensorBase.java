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

public class TemperatureSensorBase extends Phidget {

	TemperatureSensorBase(long handle) {
		super(handle);
	}

	public TemperatureSensorBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableTemperatureChangeEvents(enable && temperatureChangeListeners.size() > 0);
	}

	public final void addTemperatureChangeListener(TemperatureSensorTemperatureChangeListener l) {
		synchronized(temperatureChangeListeners) {
			temperatureChangeListeners.add(l);
			enableTemperatureChangeEvents(true);
		}
	}
	private List<TemperatureSensorTemperatureChangeListener> temperatureChangeListeners = new ArrayList<TemperatureSensorTemperatureChangeListener>();
	private long nativeTemperatureChangeHandler = 0;
	public final void removeTemperatureChangeListener(TemperatureSensorTemperatureChangeListener l) {
		synchronized(temperatureChangeListeners) {
			temperatureChangeListeners.remove(l);
			enableTemperatureChangeEvents(temperatureChangeListeners.size() > 0);
		}
	}
	private void fireTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
		synchronized(temperatureChangeListeners) {
			for (Iterator it = temperatureChangeListeners.iterator (); it.hasNext();)
			((TemperatureSensorTemperatureChangeListener) it.next ()).onTemperatureChange (e);
		}
	}
	private native void enableTemperatureChangeEvents(boolean b);


	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native RTDType getRTDType() throws PhidgetException;
	public native void setRTDType(RTDType RTDType) throws PhidgetException;
	public native RTDWireSetup getRTDWireSetup() throws PhidgetException;
	public native void setRTDWireSetup(RTDWireSetup RTDWireSetup) throws PhidgetException;
	public native double getTemperature() throws PhidgetException;
	public native double getMinTemperature() throws PhidgetException;
	public native double getMaxTemperature() throws PhidgetException;
	public native double getTemperatureChangeTrigger() throws PhidgetException;
	public native void setTemperatureChangeTrigger(double TemperatureChangeTrigger) throws PhidgetException;
	public native double getMinTemperatureChangeTrigger() throws PhidgetException;
	public native double getMaxTemperatureChangeTrigger() throws PhidgetException;
	public native ThermocoupleType getThermocoupleType() throws PhidgetException;
	public native void setThermocoupleType(ThermocoupleType ThermocoupleType) throws PhidgetException;
}
