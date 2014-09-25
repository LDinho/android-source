package com.bloc.classes;

class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;

	// ADD MEMBER VARIABLES HERE IF NECESSARY

	int mMeal = 0;
	int mPlay = 0;

	/*
	 * getHairLength
	 * @return this Dog's hair length
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public float getHairLength() {

		return mHairLength;

	}

	/*
	 * setHairLength
	 * Sets the length of the Dog's hair
	 * @param hairLength the new length of the hair, a float
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setHairLength(float newHairLength) {

		 //logic - cannot be < 0f 

		 if (newHairLength < 0) {

		 	newHairLength = 0f;
		 }

		 mHairLength = newHairLength;
	}

	/*
	 * getGender
	 * @return this Dog's gender
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public String getGender() {

		return mGender;
	}

	/*
	 * setGender
	 * Sets this Dog's gender
	 * @param gender the new gender of the Dog, a String
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setGender(String newGender) {

		mGender = newGender;

	}

	/*
	 * getSize
	 * @return the size of the dog
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public String getSize() {

		return mSize;
	}

	/*
	 * setSize
	 * Sets the size of the Dog
	 * @param size the new size of the Dog, a String
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setSize(String newSize) {

		mSize = newSize;
	}

	/*
	 * getAge
	 * @return this Dog's age
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public int getAge() {

		return mAge;
	}

	/*
	 * setAge
	 * Sets the age of the Dog
	 * @param age the new age of the Dog, an int
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setAge(int newAge) {

		mAge = newAge;
	}

	/*
	 * getWeight
	 * @return this Dog's weight
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public float getWeight() {

		return mWeight;
	}

	/*
	 * setWeight
	 * Sets the weight of the Dog
	 * @param weight the new weight of the Dog, a float
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setWeight(float newWeight) {

		if (newWeight < MIN_WEIGHT) {

			newWeight = MIN_WEIGHT;	// cannot be < 1.25f 
		} 

		mWeight = newWeight;  
	}

	/*
	 * getColor
	 * @return this Dog's color
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public String getColor() {

		return mColor;
	}

	/*
	 * setColor
	 * Sets the color of the Dog
	 * @param color the new color of the Dog's coat, a String
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setColor(String newColor) {

		mColor = newColor;
	}

	/*
	 * feed
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if *                 possible
	 *              i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                   "average" (3 meals later ->) "large"
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void feed() {

		mWeight += WEIGHT_GAIN;
		mMeal++;

		if (mMeal % 3 == 0) {

			if (mSize.equals("tiny")) {

				mSize = "small";

			} else if (mSize.equals("small")) {

				mSize = "average";

			} else if (mSize.equals("average")) {

				mSize = "large";
			}

		}
		
	}

	/*
	 * play
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller *                 size, if possible
	 *				i.e. "large" (6 plays later->) "average" (6 plays later->) *                   "small" -> "tiny"
     *              3. The Dog cannot shrink to a weight smaller than *                 MIN_WEIGHT
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void play() {

		// setWeight(mWeight - WEIGHT_LOSS); -- Alternative? Then don't have to add that last 'if' statement as in line 256

		mWeight -= WEIGHT_LOSS;
		mPlay++;

		if (mPlay % 6 == 0) {

			if (mSize.equals("large")) {

				mSize = "average";

			} else if (mSize.equals("average")) {

				mSize = "small";

			} else if (mSize.equals("small")) {

				mSize = "tiny";

			}
		}

		if (mWeight < MIN_WEIGHT) {
			mWeight = MIN_WEIGHT;
		}	
	}

	/*
	 * cutHair
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
     * The Dog's hair cannot be shorter than 0f
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void cutHair() {

		mHairLength -= HAIR_CUT_LENGTH;

		if (mHairLength < 0) {
			mHairLength = 0;
		}

		// OR ??

		// setHairLength(mHairLength - HAIR_CUT_LENGTH);  Is this correct??

		//
	}
}



