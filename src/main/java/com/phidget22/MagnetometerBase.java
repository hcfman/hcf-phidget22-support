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

public class MagnetometerBase extends Phidget {

	MagnetometerBase(long handle) {
		super(handle);
	}

	public MagnetometerBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableMagneticFieldChangeEvents(enable && magneticFieldChangeListeners.size() > 0);
	}

	public final void addMagneticFieldChangeListener(MagnetometerMagneticFieldChangeListener l) {
		synchronized(magneticFieldChangeListeners) {
			magneticFieldChangeListeners.add(l);
			enableMagneticFieldChangeEvents(true);
		}
	}
	private List<MagnetometerMagneticFieldChangeListener> magneticFieldChangeListeners = new ArrayList<MagnetometerMagneticFieldChangeListener>();
	private long nativeMagneticFieldChangeHandler = 0;
	public final void removeMagneticFieldChangeListener(MagnetometerMagneticFieldChangeListener l) {
		synchronized(magneticFieldChangeListeners) {
			magneticFieldChangeListeners.remove(l);
			enableMagneticFieldChangeEvents(magneticFieldChangeListeners.size() > 0);
		}
	}
	private void fireMagneticFieldChange(MagnetometerMagneticFieldChangeEvent e) {
		synchronized(magneticFieldChangeListeners) {
			for (Iterator it = magneticFieldChangeListeners.iterator (); it.hasNext();)
			((MagnetometerMagneticFieldChangeListener) it.next ()).onMagneticFieldChange (e);
		}
	}
	private native void enableMagneticFieldChangeEvents(boolean b);


	public native int getAxisCount() throws PhidgetException;
	public native void setCorrectionParameters(double magneticField, double offset0, double offset1, double offset2, double gain0, double gain1, double gain2, double T0, double T1, double T2, double T3, double T4, double T5) throws PhidgetException;
	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native double[] getMagneticField() throws PhidgetException;
	public native double[] getMinMagneticField() throws PhidgetException;
	public native double[] getMaxMagneticField() throws PhidgetException;
	public native double getMagneticFieldChangeTrigger() throws PhidgetException;
	public native void setMagneticFieldChangeTrigger(double MagneticFieldChangeTrigger) throws PhidgetException;
	public native double getMinMagneticFieldChangeTrigger() throws PhidgetException;
	public native double getMaxMagneticFieldChangeTrigger() throws PhidgetException;
	public native void resetCorrectionParameters() throws PhidgetException;
	public native void saveCorrectionParameters() throws PhidgetException;
	public native double getTimestamp() throws PhidgetException;
}
