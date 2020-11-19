package com.heraizen.cj.day5.instrument;

public class InstrumentMain {

	public static void main(String[] args) {
		Instrument i[] = { new Piano(), new Guitar(), new Flute(), new Guitar(), new Flute(), new Piano(), new Guitar(),
				new Piano(), new Flute(), new Piano() };

		for (Instrument arr : i) {
			arr.play();
		}

	}

}
