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

public enum LCDFont {
	USER1(1) {
		public String getMessage() {
			return ("User 1");
		}
	},
	USER2(2) {
		public String getMessage() {
			return ("User 2");
		}
	},
	DIMENSIONS_6X10(3) {
		public String getMessage() {
			return ("6x10");
		}
	},
	DIMENSIONS_5X8(4) {
		public String getMessage() {
			return ("5x8");
		}
	},
	DIMENSIONS_6X12(5) {
		public String getMessage() {
			return ("6x12");
		}
	};

	public static LCDFont getEnum(int code) {
		switch(code) {
		case 1:
			return USER1;
		case 2:
			return USER2;
		case 3:
			return DIMENSIONS_6X10;
		case 4:
			return DIMENSIONS_5X8;
		case 5:
			return DIMENSIONS_6X12;
		}
		return null;
	}

	private final int code;
	private LCDFont(int code) {
		this.code = code;
	}

	public int getCode() {
		return (code);
	}

	public abstract String getMessage();
}
