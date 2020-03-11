package com.capg.demo.spring;

public class Mobile {
	
	Sim s;
	
	public Sim getS() {
		return s;
	}

	public void setS(Sim s) {
		this.s = s;
	}

	void makeACall() {
		s.call();
	}
	
	void browseInternet() {
		s.browse();
	}

}
