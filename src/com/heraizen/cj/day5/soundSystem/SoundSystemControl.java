package com.heraizen.cj.day5.soundSystem;

import java.util.Scanner;

public class SoundSystemControl {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		RemoteControl dvd = new CreateDVD();
		RemoteControl tvr = new TVRemote();
		int dvdvol = 49;
		int tvrvol = 1;
		boolean dvdmute = false;
		boolean dvdpower = true;
		boolean tvmute = false;
		boolean tvpower = true;
		dvdpower = dvd.powerOnOff();
	tvpower = tvr.powerOnOff();
	if(dvdpower)
	{
	while(dvdpower)
	{
		System.out.println("1.poweroff 2.increase 3.decrease 4.mute");
		int i = sc.nextInt();
		if(i==2)
		{
			if(!dvdmute)
			{
			dvdvol = dvd.volumeUp(dvdvol);
			System.out.println("your DVD Volume is "+dvdvol);
		}
			else {
				System.out.println("your DVD Volume is mute");
			}
		}
		else if(i == 3)
		{
			if(!dvdmute)
			{
			dvdvol = dvd.volumeDown(dvdvol);
			System.out.println("your DVD Volume is "+dvdvol);
		}
			else {
				System.out.println("your DVD Volume is mute");
			}
		}
		else if(i==4) {
			dvdmute = dvd.mute();
			System.out.println("your DVD Volume is mute");
		}
		else if(i == 1)
		{
			dvdpower = dvd.powerOnOff();
			System.out.println("You stop the DVD Player");
		}
	}
	}
	
	if(tvpower)
	{
	while(tvpower)
	{
		System.out.println("1.poweroff 2.increase 3.decrease 4.mute");
		int i = sc.nextInt();
		if(i==2)
		{
			if(!tvmute)
			{
				tvrvol = tvr.volumeUp(dvdvol);
			System.out.println("your TV Volume is "+tvrvol);
		}
			else {
				System.out.println("your TV Volume is mute");
			}
		}
		else if(i == 3)
		{
			if(!tvmute)
			{
				tvrvol = tvr.volumeDown(tvrvol);
			System.out.println("your TV Volume is "+dvdvol);
		}
			else {
				System.out.println("your TV Volume is mute");
			}
		}
		else if(i==4) {
			tvmute = tvr.mute();
			System.out.println("your TV Volume is mute");
		}
		else if(i == 1)
		{
			tvpower = tvr.powerOnOff();
			System.out.println("You stop the TV Player");
		}else {
			System.out.println("Enter the correct one");
		}
	}
	}
	}

}
