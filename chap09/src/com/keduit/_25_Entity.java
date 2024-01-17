package com.keduit;

public class _25_Entity<k, v> {

	private k key;
	private v value;

	public _25_Entity(k key, v value) {
		this.key = key;
		this.value = value;
	}

	k getKey() {
		return key;
	}

	public void setKey(k key) {
		this.key = key;
	}

	v getValue() {
		return value;
	}

	public void setValue(v value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "key: " + this.key + ", value: " + this.value;
	}

}
