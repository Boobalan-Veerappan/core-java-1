package com.heraizen.cj.day5.game;

public class Bicycle implements Game {
	public void stop() {
		System.out.println("bicycle is stop");
	}

	public void start() {
		System.out.println("bicycle is start");
	}

	public void play() {
		System.out.println("bicycle is play");
	}
}