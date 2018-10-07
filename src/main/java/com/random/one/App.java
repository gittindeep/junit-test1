package com.random.one;

import java.time.LocalTime;

public class App {

	public static void main(String[] args) {

		//Randomtime rt = new Randomtime();
		//LocalTime lt = LocalTime.of(0,0);
		LocalTime lt = LocalTime.now();
		Randomtime.printrandomtime(lt);
	}
}
