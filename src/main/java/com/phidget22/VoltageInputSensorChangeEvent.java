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

import java.util.Arrays;

public class VoltageInputSensorChangeEvent {

	VoltageInput Source;
	double SensorValue;
	UnitInfo SensorUnit;
	public VoltageInputSensorChangeEvent(VoltageInput Source, double sensorValue, UnitInfo sensorUnit) {
		this.Source = Source;
		this.SensorValue = sensorValue;
		this.SensorUnit = sensorUnit;
	}
	public VoltageInput getSource() {
		return Source;
	}
	public double getSensorValue() {
		return SensorValue;
	}
	public UnitInfo getSensorUnit() {
		return SensorUnit;
	}
	public String toString() {
		return "[VoltageInputSensorChangeEvent](" +
			"Source: " + Source + ", " +
			"SensorValue: " + SensorValue + ", " +
			"SensorUnit: " + SensorUnit +
			")";
	}
}
