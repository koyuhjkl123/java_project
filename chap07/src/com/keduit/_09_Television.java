package com.keduit;

public class _09_Television implements _08_RemoteControl {

	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setvolumn(int volumn) {

		// 1. volumn MAX_VOLUMN보다 크면 MAX_VOLUMN을 this.volumn으로
		// 2. volumn MIN_VOLUMN보다 작으면 MIN_VOLUMN을 this.volumn으로
		// 3. 그렇지 않으면 volumn this.volumn으로

		if (volumn > MAX_VOLUMN) {
			this.volumn = MAX_VOLUMN;
		} else if (volumn < MIN_VOLUMN) {
			this.volumn = MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}

		System.out.println("현재 TV 볼륨 : " + this.volumn);
	}

}
