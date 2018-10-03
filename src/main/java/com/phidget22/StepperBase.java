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

public class StepperBase extends Phidget {

	StepperBase(long handle) {
		super(handle);
	}

	public StepperBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enablePositionChangeEvents(enable && positionChangeListeners.size() > 0);
		enableStoppedEvents(enable && stoppedListeners.size() > 0);
		enableVelocityChangeEvents(enable && velocityChangeListeners.size() > 0);
	}

	public final void addPositionChangeListener(StepperPositionChangeListener l) {
		synchronized(positionChangeListeners) {
			positionChangeListeners.add(l);
			enablePositionChangeEvents(true);
		}
	}
	private List<StepperPositionChangeListener> positionChangeListeners = new ArrayList<StepperPositionChangeListener>();
	private long nativePositionChangeHandler = 0;
	public final void removePositionChangeListener(StepperPositionChangeListener l) {
		synchronized(positionChangeListeners) {
			positionChangeListeners.remove(l);
			enablePositionChangeEvents(positionChangeListeners.size() > 0);
		}
	}
	private void firePositionChange(StepperPositionChangeEvent e) {
		synchronized(positionChangeListeners) {
			for (Iterator it = positionChangeListeners.iterator (); it.hasNext();)
			((StepperPositionChangeListener) it.next ()).onPositionChange (e);
		}
	}
	private native void enablePositionChangeEvents(boolean b);

	public final void addStoppedListener(StepperStoppedListener l) {
		synchronized(stoppedListeners) {
			stoppedListeners.add(l);
			enableStoppedEvents(true);
		}
	}
	private List<StepperStoppedListener> stoppedListeners = new ArrayList<StepperStoppedListener>();
	private long nativeStoppedHandler = 0;
	public final void removeStoppedListener(StepperStoppedListener l) {
		synchronized(stoppedListeners) {
			stoppedListeners.remove(l);
			enableStoppedEvents(stoppedListeners.size() > 0);
		}
	}
	private void fireStopped(StepperStoppedEvent e) {
		synchronized(stoppedListeners) {
			for (Iterator it = stoppedListeners.iterator (); it.hasNext();)
			((StepperStoppedListener) it.next ()).onStopped (e);
		}
	}
	private native void enableStoppedEvents(boolean b);

	public final void addVelocityChangeListener(StepperVelocityChangeListener l) {
		synchronized(velocityChangeListeners) {
			velocityChangeListeners.add(l);
			enableVelocityChangeEvents(true);
		}
	}
	private List<StepperVelocityChangeListener> velocityChangeListeners = new ArrayList<StepperVelocityChangeListener>();
	private long nativeVelocityChangeHandler = 0;
	public final void removeVelocityChangeListener(StepperVelocityChangeListener l) {
		synchronized(velocityChangeListeners) {
			velocityChangeListeners.remove(l);
			enableVelocityChangeEvents(velocityChangeListeners.size() > 0);
		}
	}
	private void fireVelocityChange(StepperVelocityChangeEvent e) {
		synchronized(velocityChangeListeners) {
			for (Iterator it = velocityChangeListeners.iterator (); it.hasNext();)
			((StepperVelocityChangeListener) it.next ()).onVelocityChange (e);
		}
	}
	private native void enableVelocityChangeEvents(boolean b);


	public native double getAcceleration() throws PhidgetException;
	public native void setAcceleration(double Acceleration) throws PhidgetException;
	public native double getMinAcceleration() throws PhidgetException;
	public native double getMaxAcceleration() throws PhidgetException;
	public native StepperControlMode getControlMode() throws PhidgetException;
	public native void setControlMode(StepperControlMode ControlMode) throws PhidgetException;
	public native double getCurrentLimit() throws PhidgetException;
	public native void setCurrentLimit(double CurrentLimit) throws PhidgetException;
	public native double getMinCurrentLimit() throws PhidgetException;
	public native double getMaxCurrentLimit() throws PhidgetException;
	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native boolean getEngaged() throws PhidgetException;
	public native void setEngaged(boolean Engaged) throws PhidgetException;
	public native double getHoldingCurrentLimit() throws PhidgetException;
	public native void setHoldingCurrentLimit(double HoldingCurrentLimit) throws PhidgetException;
	public native boolean getIsMoving() throws PhidgetException;
	public native double getPosition() throws PhidgetException;
	public native double getMinPosition() throws PhidgetException;
	public native double getMaxPosition() throws PhidgetException;
	public native void addPositionOffset(double positionOffset) throws PhidgetException;
	public native double getRescaleFactor() throws PhidgetException;
	public native void setRescaleFactor(double RescaleFactor) throws PhidgetException;
	public native double getTargetPosition() throws PhidgetException;
	public native void setTargetPosition(double TargetPosition, AsyncListener asyncHandler);
	public native void setTargetPosition(double TargetPosition) throws PhidgetException;
	public native double getVelocity() throws PhidgetException;
	public native double getVelocityLimit() throws PhidgetException;
	public native void setVelocityLimit(double VelocityLimit) throws PhidgetException;
	public native double getMinVelocityLimit() throws PhidgetException;
	public native double getMaxVelocityLimit() throws PhidgetException;
}