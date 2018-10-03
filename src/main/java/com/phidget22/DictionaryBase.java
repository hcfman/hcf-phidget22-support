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

public class DictionaryBase extends Phidget {

	DictionaryBase(long handle) {
		super(handle);
	}

	public DictionaryBase() throws PhidgetException {
		super(create());
	}

	private native static long create() throws PhidgetException;

	private final void setDeviceEvents(boolean enable) {
		enableAddEvents(enable && addListeners.size() > 0);
		enableRemoveEvents(enable && removeListeners.size() > 0);
		enableUpdateEvents(enable && updateListeners.size() > 0);
	}

	public final void addAddListener(DictionaryAddListener l) {
		synchronized(addListeners) {
			addListeners.add(l);
			enableAddEvents(true);
		}
	}
	private List<DictionaryAddListener> addListeners = new ArrayList<DictionaryAddListener>();
	private long nativeAddHandler = 0;
	public final void removeAddListener(DictionaryAddListener l) {
		synchronized(addListeners) {
			addListeners.remove(l);
			enableAddEvents(addListeners.size() > 0);
		}
	}
	private void fireAdd(DictionaryAddEvent e) {
		synchronized(addListeners) {
			for (Iterator it = addListeners.iterator (); it.hasNext();)
			((DictionaryAddListener) it.next ()).onAdd (e);
		}
	}
	private native void enableAddEvents(boolean b);

	public final void addRemoveListener(DictionaryRemoveListener l) {
		synchronized(removeListeners) {
			removeListeners.add(l);
			enableRemoveEvents(true);
		}
	}
	private List<DictionaryRemoveListener> removeListeners = new ArrayList<DictionaryRemoveListener>();
	private long nativeRemoveHandler = 0;
	public final void removeRemoveListener(DictionaryRemoveListener l) {
		synchronized(removeListeners) {
			removeListeners.remove(l);
			enableRemoveEvents(removeListeners.size() > 0);
		}
	}
	private void fireRemove(DictionaryRemoveEvent e) {
		synchronized(removeListeners) {
			for (Iterator it = removeListeners.iterator (); it.hasNext();)
			((DictionaryRemoveListener) it.next ()).onRemove (e);
		}
	}
	private native void enableRemoveEvents(boolean b);

	public final void addUpdateListener(DictionaryUpdateListener l) {
		synchronized(updateListeners) {
			updateListeners.add(l);
			enableUpdateEvents(true);
		}
	}
	private List<DictionaryUpdateListener> updateListeners = new ArrayList<DictionaryUpdateListener>();
	private long nativeUpdateHandler = 0;
	public final void removeUpdateListener(DictionaryUpdateListener l) {
		synchronized(updateListeners) {
			updateListeners.remove(l);
			enableUpdateEvents(updateListeners.size() > 0);
		}
	}
	private void fireUpdate(DictionaryUpdateEvent e) {
		synchronized(updateListeners) {
			for (Iterator it = updateListeners.iterator (); it.hasNext();)
			((DictionaryUpdateListener) it.next ()).onUpdate (e);
		}
	}
	private native void enableUpdateEvents(boolean b);


	public native void add(java.lang.String key, java.lang.String value) throws PhidgetException;
	public native void removeAll() throws PhidgetException;
	public native java.lang.String get(java.lang.String key) throws PhidgetException;
	public native void remove(java.lang.String key) throws PhidgetException;
	public native void set(java.lang.String key, java.lang.String value) throws PhidgetException;
	public native java.lang.String sscan(java.lang.String start) throws PhidgetException;
	public native void update(java.lang.String key, java.lang.String value) throws PhidgetException;
}