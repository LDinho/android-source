package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		// IMPLEMENT ME

		/** if number is < then next index, then return next index 
		* We are dealing with a generic 'List' type consisting of a list of Integer elements
		* Implement List method : .size() -- returns the number of elements in this list.
			Use that for base case
		* get(int index) -- returns the element at the specified position in this list.
		* subList(int fromIndex, int toIndex) -- Returns a view of the portion of this list 
			between the specified fromIndex, inclusive, and toIndex, exclusive.

		* could use Math.max(int a, int b) -- returns larger of a and b : This does comparison work for you
		**/

		if (numbers.size() == 1) {	// base case?

			return numbers.get(0); // returns the one last element at index zero from the numbers List
		}
		/* Math.max(int a, int b) gives you the largest number between a and b
		 * Here 'a' is the element Integer (at position numbers.get(0))
		 * And 'b' is the recursive method of Integer type which implements in its parameters the
			subList(int fromIndex, int toIndex) method from List<E>.
		 * 'numbers' from findMaxRecursively(List<Int> numbers) calls subList(int, int)
		 * Then from index '1' to total size() of the List, all elements are compared 
			against the element at index zero (numbers.get(0)) to return largest number.
		*/
		return Math.max(numbers.get(0), findMaxRecursively(numbers.subList(1, numbers.size())));
	}
}




