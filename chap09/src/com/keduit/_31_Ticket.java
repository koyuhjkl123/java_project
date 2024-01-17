package com.keduit;

public class _31_Ticket implements Comparable {

	int no;

	public _31_Ticket(int no) {
		this.no = no;

	}

	@Override
	public int compareTo(Object o) {
		_31_Ticket t = (_31_Ticket) o;
		return no < t.no ? -1 : (no > t.no ? 1 : 0);
	}

}
