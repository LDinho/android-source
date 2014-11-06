package com.bloc.singletons;

import java.util.*;

/*
 * This is a singleton class which maintains communication
 * between classes and Listeners
 */
public class Speakerphone extends Object {

	// The singleton's static instance
	private static Speakerphone sSpeakerphone; // Singleton's purpose is to control object creation, limiting it to one object only
	/*
	 * get
	 * @return the singleton instance of Speakerphone
	 */

	public static Speakerphone get() {

		if (sSpeakerphone == null){
			sSpeakerphone = new Speakerphone();
		}
		return sSpeakerphone;
	}

	/*
	 * addListener
	 * Add a listener to Speakerphone's list
	 * @param listener an instance of the Listener interface
	 */
	private HashSet<Listener> listenersList; // declare set/list of listeners

	private Speakerphone() {

		listenersList = new HashSet<Listener>();
	}

	public void addListener(Listener listener) {

		listenersList.add(listener);
	}

	/*
	 * removeListener
	 * Remove a Listener from the Speakerphone's list
	 * @param listener the Listener to remove
	 */

	public void removeListener(Listener listener) {

		listenersList.remove(listener);
	}

	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 * @param talker a Talker whose message will be sent
	 */

	public void shoutMessage(Talker talker) {

		// iterator to cycle through the collection/list, obtaining or removing elements.
		Iterator<Listener> iterateListeners = listenersList.iterator();

		while (iterateListeners.hasNext()) {
			iterateListeners.next().onMessageReceived(talker.getMessage());

		}
	}

	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners which are instances of
	 * the class parameter
	 * @param talker a Talker whose message will be sent
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
		=============
	  -java.lang.Class.isAssignableFrom() determines if the class or interface represented by this Class object 
	  	is either the same as, or is a superclass or superinterface of, the class or interface represented by 
	  	the specified Class parameter.
		=============
	 */

	public void shoutMessage(Talker talker, Class<?> cls) {

		Iterator<Listener> iterateListeners = listenersList.iterator();

		while (iterateListeners.hasNext()) {

			// getClass() returns the runtime class of this Object -- 
			// The returned Class object is the object that is locked by static synchronized methods of the represented class.
			Listener listen = iterateListeners.next();
			if (cls.isAssignableFrom(listen.getClass())) {

				listen.onMessageReceived(talker.getMessage());

			}
		}
	}

	/*
	 * removeAll
	 * Removes all Listeners from Speakerphone
	 */

	public void removeAll() {

		listenersList.clear();
	}
}

