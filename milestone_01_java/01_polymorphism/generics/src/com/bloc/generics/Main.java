package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		/*
		 * Put a bunch of Toys in toyBox!
		 */
		// Example from generics lesson:
		// FancyArray<Movie> movieArray = new FancyArray<Movie>();
		// movieArray.add(new HorrorMovie("Troll 2"));
		// movieArray.add(new SciFiMovie("Plan 9 From Outer Space")); // why is this correct in lesson??
		// movieArray.add(new RomanticMovie("You've Got Mail"));

		Toy<ActionFigure> superHeroe = new Toy<ActionFigure>(new ActionFigure());
		Toy<Book> fantasyBook = new Toy<Book>(new Book());
		Toy<Spoon> redSpoon = new Toy<Spoon>(new Spoon());
		Toy<Thing> someThing = new Toy<Thing>(new Thing("SoccerBall"));
		Toy<ActionFigure> spiderman = new Toy<ActionFigure>(new ActionFigure());

		// toyBox.addToy(new ActionFigure()); // why is this wrong?

		toyBox.addToy(superHeroe);
		toyBox.addToy(fantasyBook);
		toyBox.addToy(redSpoon);
		toyBox.addToy(someThing);
		toyBox.addToy(spiderman);


		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
