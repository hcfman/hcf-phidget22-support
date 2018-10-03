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

public enum FrequencyFilterType {
	ZERO_CROSSING(1) {
		public String getMessage() {
			return ("Zero Crossing");
		}
	},
	LOGIC_LEVEL(2) {
		public String getMessage() {
			return ("Logic Level");
		}
	};

	public static FrequencyFilterType getEnum(int code) {
		switch(code) {
		case 1:
			return ZERO_CROSSING;
		case 2:
			return LOGIC_LEVEL;
		}
		return null;
	}

	private final int code;
	private FrequencyFilterType(int code) {
		this.code = code;
	}

	public int getCode() {
		return (code);
	}

	public abstract String getMessage();
}