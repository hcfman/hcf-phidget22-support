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

public class IRCodeEvent {

	IR Source;
	java.lang.String Code;
	int BitCount;
	boolean IsRepeat;
	public IRCodeEvent(IR Source, java.lang.String code, int bitCount, boolean isRepeat) {
		this.Source = Source;
		this.Code = code;
		this.BitCount = bitCount;
		this.IsRepeat = isRepeat;
	}
	public IR getSource() {
		return Source;
	}
	public java.lang.String getCode() {
		return Code;
	}
	public int getBitCount() {
		return BitCount;
	}
	public boolean getIsRepeat() {
		return IsRepeat;
	}
	public String toString() {
		return "[IRCodeEvent](" +
			"Source: " + Source + ", " +
			"Code: " + Code + ", " +
			"BitCount: " + BitCount + ", " +
			"IsRepeat: " + IsRepeat +
			")";
	}
}