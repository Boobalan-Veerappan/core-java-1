package com.heraizen.cj.day5.game;

public class Car implements Game {
	public void stop() {
		System.out.println("car is stop");
	}

	public void start() {
		System.out.println("car is start");
	}

	public void play() {
		System.out.println("car is play");
	}
}