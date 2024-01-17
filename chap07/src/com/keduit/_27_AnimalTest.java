package com.keduit;

public class _27_AnimalTest {

	public static void main(String[] args) {
		
		_25_Dog d = new _25_Dog();
		_26_Cuckoo k = new _26_Cuckoo();
		
		makeSound(d);
		makeSound(k);

		_24_Animal[] a = {new _25_Dog(), new _26_Cuckoo()};
		
		for(_24_Animal animal : a) {
		makeSound(animal);
		}
	}
	
	static void makeSound(_24_Animal a) {
		a.sound();
	}

}
