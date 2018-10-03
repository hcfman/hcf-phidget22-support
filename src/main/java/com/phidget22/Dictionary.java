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

public class Dictionary extends DictionaryBase {
	public Dictionary() throws PhidgetException { super(); }
	Dictionary(long handle) throws PhidgetException { super(handle); }
	
	public java.lang.String get(java.lang.String key, java.lang.String def) throws PhidgetException {
		java.lang.String value = get(key);
		if (value == null)
			return def;
		return (value);
	}

	public java.lang.String[] scan(java.lang.String start) throws PhidgetException {

		if (start == null)
			start = "";

		String[] res = this.sscan(start).split("\\n");
		if (res.length == 1 && res[0].length() == 0)
			return (new String[0]);
		return (res);
	}
}

