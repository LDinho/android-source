package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
public class GreatDane extends Dog {

	//Add "huge" size

	@Override
	public int getSizeIndex(String size) {
		
		if ("tiny".equals(size)) {

			return 0;

		} else if ("small".equals(size)) {

			return 1;

		} else if ("large".equals(size)) {

			return 3;

		} else if ("huge".equals(size)) {

			return 4;

		} else if ("average".equals(size)) {
			return 2;
		} else

		return 2; // average is default
	}

	@Override
	public String fromSizeIndex(int index) {
		// super.fromSizeIndex(index); // got error here when left @param blank -- so added "index"

		switch(index) {
			case 0: return "tiny";		
			case 1: return "small";
			case 2: return "average";
			case 3: return "large";
			case 4: 
			default: return "huge";    
		}
	}

	@Override
	public void changeSize(boolean grow) {
		// super.changeSize(grow);  // got error here too when @param left blank

		int sizeIndex = getSizeIndex();
		sizeIndex = sizeIndex + (grow ? 1 : -1);

		if (sizeIndex > 4) {
			sizeIndex = 4;
		} else if (sizeIndex < 0) {
			sizeIndex = 0;
		}
		setSize(fromSizeIndex(sizeIndex));
	}
}




