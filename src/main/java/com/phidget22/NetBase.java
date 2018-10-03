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

public class NetBase {
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

	public NetBase() throws PhidgetException { }


	private final void setEvents(boolean enable) {
		enableServerAddedEvents(enable && serverAddedListeners.size() > 0);
		enableServerRemovedEvents(enable && serverRemovedListeners.size() > 0);
	}

	public final void addServerAddedListener(NetServerAddedListener l) {
		synchronized(serverAddedListeners) {
			serverAddedListeners.add(l);
			enableServerAddedEvents(true);
		}
	}
	private List<NetServerAddedListener> serverAddedListeners = new ArrayList<NetServerAddedListener>();
	private long nativeServerAddedHandler = 0;
	public final void removeServerAddedListener(NetServerAddedListener l) {
		synchronized(serverAddedListeners) {
			serverAddedListeners.remove(l);
			enableServerAddedEvents(serverAddedListeners.size() > 0);
		}
	}
	private void fireServerAdded(NetServerAddedEvent e) {
		synchronized(serverAddedListeners) {
			for (Iterator it = serverAddedListeners.iterator (); it.hasNext();)
			((NetServerAddedListener) it.next ()).onServerAdded (e);
		}
	}
	private native void enableServerAddedEvents(boolean b);

	public final void addServerRemovedListener(NetServerRemovedListener l) {
		synchronized(serverRemovedListeners) {
			serverRemovedListeners.add(l);
			enableServerRemovedEvents(true);
		}
	}
	private List<NetServerRemovedListener> serverRemovedListeners = new ArrayList<NetServerRemovedListener>();
	private long nativeServerRemovedHandler = 0;
	public final void removeServerRemovedListener(NetServerRemovedListener l) {
		synchronized(serverRemovedListeners) {
			serverRemovedListeners.remove(l);
			enableServerRemovedEvents(serverRemovedListeners.size() > 0);
		}
	}
	private void fireServerRemoved(NetServerRemovedEvent e) {
		synchronized(serverRemovedListeners) {
			for (Iterator it = serverRemovedListeners.iterator (); it.hasNext();)
			((NetServerRemovedListener) it.next ()).onServerRemoved (e);
		}
	}
	private native void enableServerRemovedEvents(boolean b);


	public static native void addServer(java.lang.String serverName, java.lang.String address, int port, java.lang.String password, int flags) throws PhidgetException;
	public static native void removeServer(java.lang.String serverName) throws PhidgetException;
	public static native void enableServer(java.lang.String serverName) throws PhidgetException;
	public static native void disableServer(java.lang.String serverName, int flags) throws PhidgetException;
	public static native void enableServerDiscovery(ServerType serverType) throws PhidgetException;
	public static native void disableServerDiscovery(ServerType serverType) throws PhidgetException;
	public static native void setServerPassword(java.lang.String serverName, java.lang.String password) throws PhidgetException;

	public static final int AUTHREQUIRED = 1;
}
