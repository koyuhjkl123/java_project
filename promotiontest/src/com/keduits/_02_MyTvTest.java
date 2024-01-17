package com.keduits;

public class _02_MyTvTest {

	public static void main(String[] args) {
		
		_01_MyTV t1 = new _01_MyTV();
		
		t1.channel = 100;
		t1.volume = 0;
		System.out.println("CH: " + t1.channel + ", VOL: " + t1.volume);
		
		t1.channelDown();
		t1.volumeDown();
		System.out.println("CH: " + t1.channel + ", VOL: " + t1.volume);

		
		t1.volume = 100;
		t1.channelUp();
		t1.volumeUp();
		System.out.println("CH: " + t1.channel + ", VOL: " + t1.volume);
	}

}
