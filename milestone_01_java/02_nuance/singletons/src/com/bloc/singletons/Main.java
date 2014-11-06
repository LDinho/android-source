package com.bloc.singletons;

import com.bloc.singletons.listeners.*;
import com.bloc.singletons.talkers.*;

public class Main extends Object {

	public static void main(String [] args) {
		// Instantiate some talkers and some listeners
		Talker sinatra = new Singer();
		Talker parent = new Parent();

		Listener audience = new AudienceMember();
		Listener dennis = new Child();

		// Register listeners
		Speakerphone speakerphone = Speakerphone.get();

		speakerphone.addListener(audience);
		speakerphone.addListener(dennis);

		// Send messages!
		// from the shoutMessage() method with @param Talker and the Class <?> (a listener object class)

		speakerphone.shoutMessage(sinatra, AudienceMember.class);
		speakerphone.shoutMessage(parent, Child.class);
	}
}
