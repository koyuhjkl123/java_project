package com.keduit;

public class _10_Audio implements _08_RemoteControl{

	private int volumn;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setvolumn(int volumn) {
		if(volumn > MAX_VOLUMN) {
			this.volumn = MAX_VOLUMN;
		}else if(volumn < MIN_VOLUMN) {
			this.volumn = MIN_VOLUMN;
		}else {
			this.volumn = volumn;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volumn);
	}
	
	

}
