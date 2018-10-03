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

public class MotorPositionControllerBase extends Phidget {

	MotorPositionControllerBase(long handle) {
		super(handle);
	}

	public MotorPositionControllerBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableDutyCycleUpdateEvents(enable && dutyCycleUpdateListeners.size() > 0);
		enablePositionChangeEvents(enable && positionChangeListeners.size() > 0);
	}

	public final void addDutyCycleUpdateListener(MotorPositionControllerDutyCycleUpdateListener l) {
		synchronized(dutyCycleUpdateListeners) {
			dutyCycleUpdateListeners.add(l);
			enableDutyCycleUpdateEvents(true);
		}
	}
	private List<MotorPositionControllerDutyCycleUpdateListener> dutyCycleUpdateListeners = new ArrayList<MotorPositionControllerDutyCycleUpdateListener>();
	private long nativeDutyCycleUpdateHandler = 0;
	public final void removeDutyCycleUpdateListener(MotorPositionControllerDutyCycleUpdateListener l) {
		synchronized(dutyCycleUpdateListeners) {
			dutyCycleUpdateListeners.remove(l);
			enableDutyCycleUpdateEvents(dutyCycleUpdateListeners.size() > 0);
		}
	}
	private void fireDutyCycleUpdate(MotorPositionControllerDutyCycleUpdateEvent e) {
		synchronized(dutyCycleUpdateListeners) {
			for (Iterator it = dutyCycleUpdateListeners.iterator (); it.hasNext();)
			((MotorPositionControllerDutyCycleUpdateListener) it.next ()).onDutyCycleUpdate (e);
		}
	}
	private native void enableDutyCycleUpdateEvents(boolean b);

	public final void addPositionChangeListener(MotorPositionControllerPositionChangeListener l) {
		synchronized(positionChangeListeners) {
			positionChangeListeners.add(l);
			enablePositionChangeEvents(true);
		}
	}
	private List<MotorPositionControllerPositionChangeListener> positionChangeListeners = new ArrayList<MotorPositionControllerPositionChangeListener>();
	private long nativePositionChangeHandler = 0;
	public final void removePositionChangeListener(MotorPositionControllerPositionChangeListener l) {
		synchronized(positionChangeListeners) {
			positionChangeListeners.remove(l);
			enablePositionChangeEvents(positionChangeListeners.size() > 0);
		}
	}
	private void firePositionChange(MotorPositionControllerPositionChangeEvent e) {
		synchronized(positionChangeListeners) {
			for (Iterator it = positionChangeListeners.iterator (); it.hasNext();)
			((MotorPositionControllerPositionChangeListener) it.next ()).onPositionChange (e);
		}
	}
	private native void enablePositionChangeEvents(boolean b);


	public native double getAcceleration() throws PhidgetException;
	public native void setAcceleration(double Acceleration) throws PhidgetException;
	public native double getMinAcceleration() throws PhidgetException;
	public native double getMaxAcceleration() throws PhidgetException;
	public native double getCurrentLimit() throws PhidgetException;
	public native void setCurrentLimit(double CurrentLimit) throws PhidgetException;
	public native double getMinCurrentLimit() throws PhidgetException;
	public native double getMaxCurrentLimit() throws PhidgetException;
	public native double getCurrentRegulatorGain() throws PhidgetException;
	public native void setCurrentRegulatorGain(double CurrentRegulatorGain) throws PhidgetException;
	public native double getMinCurrentRegulatorGain() throws PhidgetException;
	public native double getMaxCurrentRegulatorGain() throws PhidgetException;
	public native int getDataInterval() throws PhidgetException;
	public native void setDataInterval(int DataInterval) throws PhidgetException;
	public native int getMinDataInterval() throws PhidgetException;
	public native int getMaxDataInterval() throws PhidgetException;
	public native double getDeadBand() throws PhidgetException;
	public native void setDeadBand(double DeadBand) throws PhidgetException;
	public native double getDutyCycle() throws PhidgetException;
	public native boolean getEngaged() throws PhidgetException;
	public native void setEngaged(boolean Engaged) throws PhidgetException;
	public native FanMode getFanMode() throws PhidgetException;
	public native void setFanMode(FanMode FanMode) throws PhidgetException;
	public native EncoderIOMode getIOMode() throws PhidgetException;
	public native void setIOMode(EncoderIOMode IOMode) throws PhidgetException;
	public native double getKd() throws PhidgetException;
	public native void setKd(double Kd) throws PhidgetException;
	public native double getKi() throws PhidgetException;
	public native void setKi(double Ki) throws PhidgetException;
	public native double getKp() throws PhidgetException;
	public native void setKp(double Kp) throws PhidgetException;
	public native double getPosition() throws PhidgetException;
	public native double getMinPosition() throws PhidgetException;
	public native double getMaxPosition() throws PhidgetException;
	public native void addPositionOffset(double positionOffset) throws PhidgetException;
	public native double getRescaleFactor() throws PhidgetException;
	public native void setRescaleFactor(double RescaleFactor) throws PhidgetException;
	public native double getStallVelocity() throws PhidgetException;
	public native void setStallVelocity(double StallVelocity) throws PhidgetException;
	public native double getMinStallVelocity() throws PhidgetException;
	public native double getMaxStallVelocity() throws PhidgetException;
	public native double getTargetPosition() throws PhidgetException;
	public native void setTargetPosition(double TargetPosition, AsyncListener asyncHandler);
	public native void setTargetPosition(double TargetPosition) throws PhidgetException;
	public native double getVelocityLimit() throws PhidgetException;
	public native void setVelocityLimit(double VelocityLimit) throws PhidgetException;
	public native double getMinVelocityLimit() throws PhidgetException;
	public native double getMaxVelocityLimit() throws PhidgetException;
}
