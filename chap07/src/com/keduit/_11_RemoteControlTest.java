package com.keduit;

public class _11_RemoteControlTest {

	public static void main(String[] args) {

		_08_RemoteControl rc;
		rc = new _09_Television();

		rc.turnOn();
		rc.setvolumn(15);
		rc.turnOff();

		rc = new _10_Audio();
		rc.turnOn();
		rc.setvolumn(-10);
		rc.turnOff();

	}

}
