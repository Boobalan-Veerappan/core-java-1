package com.heraizen.cj.day5.game;

import java.util.concurrent.ThreadLocalRandom;

public class Driver {

	public static void main(String[] args) {
		Game arr[] = new Game[10];

		for (int i = 0; i < 10; i++) {
			int random = ThreadLocalRandom.current().nextInt(1, 4);
			if (random == 1) {
				arr[i] = new Car();
			}
			if (random == 2) {
				arr[i] = new Bike();
			}
			if (random == 3) {
				arr[i] = new Bicycle();
			}
		}
		for (Game game : arr) {
			game.start();
			game.play();
			game.stop();
		}
	}

}
