package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

// EDIT BELOW

	public static void main(String [] args) {

		int magicNumber = WorstPractices.magicalOperation(false);

		magicNumber *= 5;

		if (magicNumber > 18) {

			while(magicNumber > 0) {

				magicNumber--;
			}
		}
	}

	/* 	animals
		this method takes in a single parameter, yesWellHeresTheThing. 
		Using a very elaborate and complex algorithm, it calculates a magic number
		yesWellHeresTheThing: a seed which helps generate the magic number
		returns: a magical number */

	private static int magicalOperation(boolean seed) {
		
			//Start off with one of these

		int aInt = seed ? 34 : 21;
		float sparklesFairy = 0.5f;

		for (int i = 0; i < aInt; i++) { 

			sparklesFairy *= aInt;
		} 
		return (int) sparklesFairy * aInt;
	}

// STOP EDITING
}
