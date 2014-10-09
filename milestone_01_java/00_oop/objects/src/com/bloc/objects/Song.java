package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;            // String? What's Ensemble's data type here??
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	// CONSTRUCTOR CODE GOES HERE

	public Song() {
		//create new Ensemble
		// Create array of artists for the ensemble
		//create one artist for the array of artist -- Artist testArtist

		Artist[] testArtist = new Artist[0]; // create one new artist

		Ensemble testEnsemble = new Ensemble("The Fugees", testArtist);

		this.mEnsemble = testEnsemble; //change?

		this.mTitle = "Killing Me Softly";
		this.mYearReleased = 1996;
	}

	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE

	public Song(Ensemble ensemble, String title) {
		
		this.mYearReleased = 0;

		this.mEnsemble = ensemble;
		this.mTitle = title;

	}

	/*
	 * Full Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE

	public Song(Ensemble ensemble, String title, int yearReleased) {

		this.mEnsemble = ensemble;
		this.mTitle = title;
		this.mYearReleased = yearReleased;
	}
}