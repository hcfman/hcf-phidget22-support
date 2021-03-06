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

public enum LogLevel {
	CRITICAL(1) {
		public String getMessage() {
			return ("Critical");
		}
	},
	ERROR(2) {
		public String getMessage() {
			return ("Error");
		}
	},
	WARNING(3) {
		public String getMessage() {
			return ("Warning");
		}
	},
	INFO(4) {
		public String getMessage() {
			return ("Info");
		}
	},
	DEBUG(5) {
		public String getMessage() {
			return ("Debug");
		}
	},
	VERBOSE(6) {
		public String getMessage() {
			return ("Verbose");
		}
	};

	public static LogLevel getEnum(int code) {
		switch(code) {
		case 1:
			return CRITICAL;
		case 2:
			return ERROR;
		case 3:
			return WARNING;
		case 4:
			return INFO;
		case 5:
			return DEBUG;
		case 6:
			return VERBOSE;
		}
		return null;
	}

	private final int code;
	private LogLevel(int code) {
		this.code = code;
	}

	public int getCode() {
		return (code);
	}

	public abstract String getMessage();
}
