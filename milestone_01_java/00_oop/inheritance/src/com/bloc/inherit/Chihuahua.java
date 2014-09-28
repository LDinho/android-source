package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
public class Chihuahua extends Dog {

	@Override
	public void feed() {
		//grows to new size after 5 meals
		// super.feed(); // super not needed in this case?

		if (++mFeedCounter == 5) {
			changeSize(true);
			mFeedCounter = 0;
		}
	}
}