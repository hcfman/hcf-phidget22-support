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

public class DistanceSensorBase extends Phidget {

	DistanceSensorBase(long handle) {
		super(handle);
	}

	public DistanceSensorBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableDistanceChangeEvents(enable && distanceChangeListeners.size() > 0);
		enableSonarReflectionsUpdateEvents(enable && sonarReflectionsUpdateListeners.size() > 0);
	}

	public final void addDistanceChangeListener(DistanceSensorDistanceChangeListener l) {
		synchronized(distanceChangeListeners) {
			distanceChangeListeners.add(l);
			enableDistanceChangeEvents(true);
		}
	}
	private List<DistanceSensorDistanceChangeListener> distanceChangeListeners = new ArrayList<DistanceSensorDistanceChangeListener>();
	private long nativeDistanceChangeHandler = 0;
	public final void removeDistanceChangeListener(DistanceSensorDistanceChangeListener l) {
		synchronized(distanceChangeListeners) {
			distanceChangeListeners.remove(l);
			enableDistanceChangeEvents(distanceChangeListeners.size() > 0);
		}
	}
	private void fireDistanceChange(DistanceSensorDistanceChangeEvent e) {
		synchronized(distanceChangeListeners) {
			for (Iterator it = distanceChangeListeners.iterator (); it.hasNext();)
			((DistanceSensorDistanceChangeListener) it.next ()).onDistanceChange (e);
		}
	}
	private native void enableDistanceChangeEvents(boolean b);

	public final void addSonarReflectionsUpdateListener(DistanceSensorSonarReflectionsUpdateListener l) {
		synchronized(sonarReflectionsUpdateListeners) {
			sonarReflectionsUpdateListeners.add(l);
			enableSonarReflectionsUpdateEvents(true);
		}
	}
	private List<DistanceSensorSonarReflectionsUpdateListener> sonarReflectionsUpdateListeners = new ArrayList<DistanceSensorSonarReflectionsUpdateListener>();
	private long nativeSonarReflectionsUpdateHandler = 0;
	public final void removeSonarReflectionsUpdateListener(DistanceSensorSonarReflectionsUpdateListener l) {
		synchronized(sonarReflectionsUpdateListeners) {
			sonarReflectionsUpdateListeners.remove(l);
			enableSonarReflectionsUpdateEvents(sonarReflectionsUpdateListeners.size() > 0);
		}
	}
	private void fireSonarReflectionsUpdate(DistanceSensorSonarReflectionsUpdateEvent e) {
		synchronized(sonarReflectionsUpdateListeners) {
			for (Iterator it = sonarReflectionsUpdateListeners.iterator (); it.hasNext();)
			((DistanceSensorSonarReflectionsUpdateListener) it.next ()).onSonarReflectionsUpdate (e);
		}
	}
	private native void enableSonarReflectionsUpdateEvents(boolean b);


	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native int getDistance() throws PhidgetException;
	public native int getMinDistance() throws PhidgetException;
	public native int getMaxDistance() throws PhidgetException;
	public native int getDistanceChangeTrigger() throws PhidgetException;
	public native void setDistanceChangeTrigger(int DistanceChangeTrigger) throws PhidgetException;
	public native int getMinDistanceChangeTrigger() throws PhidgetException;
	public native int getMaxDistanceChangeTrigger() throws PhidgetException;
	public native boolean getSonarQuietMode() throws PhidgetException;
	public native void setSonarQuietMode(boolean SonarQuietMode) throws PhidgetException;
	public native DistanceSensorSonarReflections getSonarReflections() throws PhidgetException;
}
