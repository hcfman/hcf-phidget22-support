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

public class AsyncResult {

	Phidget Source;
	ErrorCode ReturnCode;
	public AsyncResult(Phidget Source, ErrorCode ReturnCode) {
		this.Source = Source;
		this.ReturnCode = ReturnCode;
	}
	public Phidget getSource() {
		return Source;
	}
	public ErrorCode getReturnCode() {
		return ReturnCode;
	}
	public String toString() {
		return "[AsyncResult](" +
			"Source: " + Source + ", " +
			"ReturnCode: " + ReturnCode +
			")";
	}
}
