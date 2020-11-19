package com.heraizen.cj.day5.game;

public class Bike implements Game {
	public void stop() {
		System.out.println("bike is stop");
	}

	public void start() {
		System.out.println("bike is start");
	}

	public void play() {
		System.out.println("bike is play");
	}
}