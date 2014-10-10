package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and weeks on billboard
	 */
	// CONSTRUCTOR CODE GOES HERE

	PopSong() {

		super();

		// Artist[] testArtist = new Artist[1]; // create one new artist

		// Ensemble testEnsemble = new Ensemble("The Fugees", testArtist);

		// this.mEnsemble = testEnsemble;

		// this.mTitle = "Killing Me Softly";
		// this.mYearReleased = 1996;

		this.mWeeksOnBillboard = 5;
	}

	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE

	PopSong(Ensemble ensemble, String title) {
		
		super(ensemble, title);

		// this.mYearReleased = 0;
		// this.mEnsemble = ensemble;
		// this.mTitle = title;

		this.mWeeksOnBillboard = 0;
	}	

	/*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE

	PopSong(Ensemble ensemble, String title, int yearReleased) {

		super(ensemble, title, yearReleased);

		this.mWeeksOnBillboard = 0;
		// // this.mEnsemble = ensemble;
		// // this.mTitle = title;
		// this.mYearReleased = yearReleased;


	}

	/*
	 * Full PopSong Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100
	 */
	// CONSTRUCTOR CODE GOES HERE

	PopSong(Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) {

		super(ensemble, title, yearReleased);

		// this.mEnsemble = ensemble;
		// this.mTitle = title;
		// this.mYearReleased = yearReleased;
		
		this.mWeeksOnBillboard = weeksOnBillboard;

	}
}



