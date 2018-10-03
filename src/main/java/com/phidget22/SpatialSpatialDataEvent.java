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

public class SpatialSpatialDataEvent {

	Spatial Source;
	double[] Acceleration;
	double[] AngularRate;
	double[] MagneticField;
	double Timestamp;
	public SpatialSpatialDataEvent(Spatial Source, double[] acceleration, double[] angularRate, double[] magneticField, double timestamp) {
		this.Source = Source;
		this.Acceleration = acceleration;
		this.AngularRate = angularRate;
		this.MagneticField = magneticField;
		this.Timestamp = timestamp;
	}
	public Spatial getSource() {
		return Source;
	}
	public double[] getAcceleration() {
		return Acceleration;
	}
	public double[] getAngularRate() {
		return AngularRate;
	}
	public double[] getMagneticField() {
		return MagneticField;
	}
	public double getTimestamp() {
		return Timestamp;
	}
	public String toString() {
		return "[SpatialSpatialDataEvent](" +
			"Source: " + Source + ", " +
			"Acceleration: " + Arrays.toString(Acceleration) + ", " +
			"AngularRate: " + Arrays.toString(AngularRate) + ", " +
			"MagneticField: " + Arrays.toString(MagneticField) + ", " +
			"Timestamp: " + Timestamp +
			")";
	}
}