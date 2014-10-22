package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/*
	 * Use a HashMap to store the relationship
	 * between rating and pastry
	 */

	// **** Please check my comments too ****

	// Declare instance variable 'favPastry' of type HashMap ??
	// With Key type "Pastry", and value type "Integer" ??

	private HashMap<Pastry, Integer> favPastry;

	public FavoritePastries() {
		// WORK HERE

		//Here in this constructor, I create a new HashMap to 'initialize' our new variable 'favPastry'

		favPastry = new HashMap<Pastry, Integer>(); // New pastry object
	}

	/* 
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
		// WORK HERE

		// From HashMap class, call the put() method to add and associate rating to pastry in FavoritePastries
		favPastry.put(pastry, rating);
	}

	/*
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		// WORK HERE

		// call containsKey() method to check if our key of type Pastry exist/found from our new HashMap collection
		// call remove() method to remove pastry
		if(favPastry.containsKey(pastry)) {
			favPastry.remove(pastry);
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		// WORK HERE

		// call get() to get the rating ?? -- Returns the value to which the specified key is mapped
		if(favPastry.containsKey(pastry)) {
			return favPastry.get(pastry);
		} else {
			return -1;
		}
	}

	/*
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		// WORK HERE

		/*
		public void markAllTasks(boolean completed) {
	    for(Task task : mTodaysTasks) {
	        task.markCompleted(completed);
	    }
		}
		for(declaration : expression) {
			//Statements
		}
		The declaration = type of variable accessed in the arrays. 
		which is used throughout the “for” block of code, 
		and will be replaced each time with the array value that is being processed. 
		The expression = evaluation of the array that we need to loop through. 
		This expression is either an array variable or a method to return an array.

		for(Pastry pastry : rating) {// statement};

		* keySet() method is used to get a Set view of the keys contained in the map

		* Need to store pastries in an array/Collection/Set?

		* A Set interface is a Collection that cannot contain duplicate elements

		* Java platform contains 3 general-purpose Set implementations: HashSet, TreeSet, and LinkedHashSet.

		* HashSet stores its elements in a random ordered list -- is the best-performing, most popular implementation.

		* (from Oracle) Preferred style is to choose an implementation when a Collection is created 
			and to immediately assign the new collection to a variable of the corresponding interface type 
			(or to pass the collection to a method expecting an argument of the interface type).

		* Set<String> s = new HashSet<String>();

		*/
		
		Set<Pastry> allRatedPastry = new HashSet<Pastry>();

		for(Pastry pastry : favPastry.keySet()) {	// for each pastry, if we have a rating then add that pastry
													// to the new HashSet list/collection.
			if(favPastry.get(pastry) == rating){
				allRatedPastry.add(pastry);
			}
		}

		// Why is the code below wrong??

		// HashSet<Pastry> allPastryRated = new HashSet<Pastry>();
		// Iterator<Pastry> iterator = allPastryRated.iterator();
  		//    while(iterator.hasNext()){
  		//    	if(favPastry.get(iterator) == rating){
		// 		allPastryRated.add(iterator);
  //    		}
  //    	}
		return allRatedPastry;

		// return null;
	}
}

