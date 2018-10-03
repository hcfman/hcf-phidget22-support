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

public enum ErrorCode {
	SUCCESS(0) {
		public String getMessage() {
			return ("Success");
		}
	},
	NOT_PERMITTED(1) {
		public String getMessage() {
			return ("Not Permitted");
		}
	},
	NO_SUCH_ENTITY(2) {
		public String getMessage() {
			return ("No Such Entity");
		}
	},
	TIMEOUT(3) {
		public String getMessage() {
			return ("Timed Out");
		}
	},
	KEEP_ALIVE(58) {
		public String getMessage() {
			return ("Keep Alive Failure");
		}
	},
	INTERRUPTED(4) {
		public String getMessage() {
			return ("Op Interrupted");
		}
	},
	IO(5) {
		public String getMessage() {
			return ("IO Issue");
		}
	},
	NO_MEMORY(6) {
		public String getMessage() {
			return ("Memory Issue");
		}
	},
	ACCESS(7) {
		public String getMessage() {
			return ("Access (Permission) Issue");
		}
	},
	FAULT(8) {
		public String getMessage() {
			return ("Address Issue");
		}
	},
	BUSY(9) {
		public String getMessage() {
			return ("Resource Busy");
		}
	},
	EXISTS(10) {
		public String getMessage() {
			return ("Object Exists");
		}
	},
	IS_NOT_DIRECTORY(11) {
		public String getMessage() {
			return ("Object is not a directory");
		}
	},
	IS_DIRECTORY(12) {
		public String getMessage() {
			return ("Object is a directory");
		}
	},
	INVALID(13) {
		public String getMessage() {
			return ("Invalid");
		}
	},
	TOO_MANY_FILES_SYSTEM(14) {
		public String getMessage() {
			return ("Too many open files in system");
		}
	},
	TOO_MANY_FILES(15) {
		public String getMessage() {
			return ("Too many open files");
		}
	},
	NO_SPACE(16) {
		public String getMessage() {
			return ("Not enough space");
		}
	},
	FILE_TOO_BIG(17) {
		public String getMessage() {
			return ("File too Big");
		}
	},
	READ_ONLY_FILESYSTEM(18) {
		public String getMessage() {
			return ("Read Only Filesystem");
		}
	},
	READ_ONLY(19) {
		public String getMessage() {
			return ("Read Only Object");
		}
	},
	UNSUPPORTED(20) {
		public String getMessage() {
			return ("Operation Not Supported");
		}
	},
	INVALID_ARGUMENT(21) {
		public String getMessage() {
			return ("Invalid Argument");
		}
	},
	TRY_AGAIN(22) {
		public String getMessage() {
			return ("Try again");
		}
	},
	NOT_EMPTY(26) {
		public String getMessage() {
			return ("No Empty");
		}
	},
	UNEXPECTED(28) {
		public String getMessage() {
			return ("Unexpected Error");
		}
	},
	DUPLICATE(27) {
		public String getMessage() {
			return ("Duplicate");
		}
	},
	BAD_PASSWORD(37) {
		public String getMessage() {
			return ("Bad Credential");
		}
	},
	NETWORK_UNAVAILABLE(45) {
		public String getMessage() {
			return ("Network Unavailable");
		}
	},
	CONNECTION_REFUSED(35) {
		public String getMessage() {
			return ("Connection Refused");
		}
	},
	CONNECTION_RESET(46) {
		public String getMessage() {
			return ("Connection Reset");
		}
	},
	HOST_UNREACHABLE(48) {
		public String getMessage() {
			return ("No route to host");
		}
	},
	NO_SUCH_DEVICE(40) {
		public String getMessage() {
			return ("No Such Device");
		}
	},
	WRONG_DEVICE(50) {
		public String getMessage() {
			return ("Wrong Device");
		}
	},
	BROKEN_PIPE(41) {
		public String getMessage() {
			return ("Broken Pipe");
		}
	},
	NAME_RESOLUTION_FAILURE(44) {
		public String getMessage() {
			return ("Name Resolution Failure");
		}
	},
	UNKNOWN_VALUE(51) {
		public String getMessage() {
			return ("Unknown or Invalid Value");
		}
	},
	NOT_ATTACHED(52) {
		public String getMessage() {
			return ("Device not Attached");
		}
	},
	INVALID_PACKET(53) {
		public String getMessage() {
			return ("Invalid or Unexpected Packet");
		}
	},
	TOO_BIG(54) {
		public String getMessage() {
			return ("Argument List Too Long");
		}
	},
	BAD_VERSION(55) {
		public String getMessage() {
			return ("Bad Version");
		}
	},
	CLOSED(56) {
		public String getMessage() {
			return ("Closed");
		}
	},
	NOT_CONFIGURED(57) {
		public String getMessage() {
			return ("Not Configured");
		}
	},
	END_OF_FILE(31) {
		public String getMessage() {
			return ("End of File");
		}
	};

	public static ErrorCode getEnum(int code) {
		switch(code) {
		case 0:
			return SUCCESS;
		case 1:
			return NOT_PERMITTED;
		case 2:
			return NO_SUCH_ENTITY;
		case 3:
			return TIMEOUT;
		case 58:
			return KEEP_ALIVE;
		case 4:
			return INTERRUPTED;
		case 5:
			return IO;
		case 6:
			return NO_MEMORY;
		case 7:
			return ACCESS;
		case 8:
			return FAULT;
		case 9:
			return BUSY;
		case 10:
			return EXISTS;
		case 11:
			return IS_NOT_DIRECTORY;
		case 12:
			return IS_DIRECTORY;
		case 13:
			return INVALID;
		case 14:
			return TOO_MANY_FILES_SYSTEM;
		case 15:
			return TOO_MANY_FILES;
		case 16:
			return NO_SPACE;
		case 17:
			return FILE_TOO_BIG;
		case 18:
			return READ_ONLY_FILESYSTEM;
		case 19:
			return READ_ONLY;
		case 20:
			return UNSUPPORTED;
		case 21:
			return INVALID_ARGUMENT;
		case 22:
			return TRY_AGAIN;
		case 26:
			return NOT_EMPTY;
		case 28:
			return UNEXPECTED;
		case 27:
			return DUPLICATE;
		case 37:
			return BAD_PASSWORD;
		case 45:
			return NETWORK_UNAVAILABLE;
		case 35:
			return CONNECTION_REFUSED;
		case 46:
			return CONNECTION_RESET;
		case 48:
			return HOST_UNREACHABLE;
		case 40:
			return NO_SUCH_DEVICE;
		case 50:
			return WRONG_DEVICE;
		case 41:
			return BROKEN_PIPE;
		case 44:
			return NAME_RESOLUTION_FAILURE;
		case 51:
			return UNKNOWN_VALUE;
		case 52:
			return NOT_ATTACHED;
		case 53:
			return INVALID_PACKET;
		case 54:
			return TOO_BIG;
		case 55:
			return BAD_VERSION;
		case 56:
			return CLOSED;
		case 57:
			return NOT_CONFIGURED;
		case 31:
			return END_OF_FILE;
		}
		return null;
	}

	private final int code;
	private ErrorCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return (code);
	}

	public abstract String getMessage();
}