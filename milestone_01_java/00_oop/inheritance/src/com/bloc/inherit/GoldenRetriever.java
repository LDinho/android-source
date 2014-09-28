package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
public class GoldenRetriever extends Dog {

	//shrinks one size after 3 plays

	@Override
	public void play() {
		// super.play();  // is this needed?

		setWeight(getWeight() - WEIGHT_LOST_FROM_FEEDING);
		if (getWeight() < MINIMUM_WEIGHT) {
			setWeight(MINIMUM_WEIGHT);
		}
		if (++mPlayCounter == 3) {
			changeSize(false);
			mPlayCounter = 0;
		}
	}
}



