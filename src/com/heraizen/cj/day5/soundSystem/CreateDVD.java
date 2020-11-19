package com.heraizen.cj.day5.soundSystem;

class CreateDVD implements RemoteControl{
	 boolean poweron = false;
		boolean mute = false;
		@Override
		public boolean powerOnOff() {
		
			
			poweron=!poweron;
					return poweron;
			
		}

		@Override
		public int volumeUp(int increment) {
		int count =0;
		if(increment>=50)
		{
			count =50;
		}
		else
		{
			count = increment+1;
		}
			return count;
		}

		@Override
		public int volumeDown(int decrement) {
			
			int count =0;
			if(decrement-1<=0)
			{
				count =0;
			}
			else
			{
				count = decrement-1;
			}
				return count;
		}

		@Override
		public boolean mute() {
			
			mute=!mute;
			return mute;
			
		}
		
	}
