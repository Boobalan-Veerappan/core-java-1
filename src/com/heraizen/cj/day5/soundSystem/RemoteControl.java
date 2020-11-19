package com.heraizen.cj.day5.soundSystem;

public interface RemoteControl {

	boolean powerOnOff(); // Returns new state, on = true
	int volumeUp(int increment); // Returns new volume level
	int volumeDown(int decrement); // Returns new volume level
	boolean mute(); // Mutes sound output

}
