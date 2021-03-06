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

public class ManagerBase {
	static {
		try {
			System.loadLibrary("phidget22java");
		} catch (UnsatisfiedLinkError ex) {
			String os = System.getProperty("os.name");
			if (os.startsWith("Linux")) {
				throw new ExceptionInInitializerError(ex.getMessage()
				+ "\nCould not locate the Phidget C library (libphidget22java.so)."
				+ "\nMake sure it is installed, and add it' s path to LD_LIBRARY_PATH.");
			}
			else if (os.startsWith("Windows")) {
				throw new ExceptionInInitializerError(ex.getMessage()
				+ "\nCould not locate the Phidget C library."
				+ "\nThe Windows Phidget22 MSI must be installed.");
			}
			else if (os.startsWith("Mac")) {
				throw new ExceptionInInitializerError(ex.getMessage()
				+ "\nCould not locate the Phidget C library."
				+ "\nThe Mac Phidget22 DMG must be installed.");
			}
			else {
				throw new ExceptionInInitializerError(ex.getMessage()
				+ "\nCould not locate the Phidget C library.");
			}
		}
	}

	long handle = 0;


	public ManagerBase() throws PhidgetException {
		this.handle = create();
	}

	private native static long create() throws PhidgetException;

	private final void setEvents(boolean enable) {
		enableAttachEvents(enable && attachListeners.size() > 0);
		enableDetachEvents(enable && detachListeners.size() > 0);
	}

	public final void addAttachListener(ManagerAttachListener l) {
		synchronized(attachListeners) {
			attachListeners.add(l);
			enableAttachEvents(true);
		}
	}
	private List<ManagerAttachListener> attachListeners = new ArrayList<ManagerAttachListener>();
	private long nativeAttachHandler = 0;
	public final void removeAttachListener(ManagerAttachListener l) {
		synchronized(attachListeners) {
			attachListeners.remove(l);
			enableAttachEvents(attachListeners.size() > 0);
		}
	}
	private void fireAttach(ManagerAttachEvent e) {
		synchronized(attachListeners) {
			for (Iterator it = attachListeners.iterator (); it.hasNext();)
			((ManagerAttachListener) it.next ()).onAttach (e);
		}
	}
	private native void enableAttachEvents(boolean b);

	public final void addDetachListener(ManagerDetachListener l) {
		synchronized(detachListeners) {
			detachListeners.add(l);
			enableDetachEvents(true);
		}
	}
	private List<ManagerDetachListener> detachListeners = new ArrayList<ManagerDetachListener>();
	private long nativeDetachHandler = 0;
	public final void removeDetachListener(ManagerDetachListener l) {
		synchronized(detachListeners) {
			detachListeners.remove(l);
			enableDetachEvents(detachListeners.size() > 0);
		}
	}
	private void fireDetach(ManagerDetachEvent e) {
		synchronized(detachListeners) {
			for (Iterator it = detachListeners.iterator (); it.hasNext();)
			((ManagerDetachListener) it.next ()).onDetach (e);
		}
	}
	private native void enableDetachEvents(boolean b);


	public native void close() throws PhidgetException;
	public native void open() throws PhidgetException;
}
