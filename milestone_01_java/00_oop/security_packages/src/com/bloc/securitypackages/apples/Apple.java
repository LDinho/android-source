package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color;

public abstract class Apple extends Fruit {

	public Apple(String name, int calories, Color color, double weight) {

		// super(); // why super not needed here??
	}

	abstract void bite();
}