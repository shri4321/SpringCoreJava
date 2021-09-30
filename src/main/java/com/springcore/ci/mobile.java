package com.springcore.ci;

import java.util.List;

public class mobile {
	private String name;
	private int num;
	private certi cer;
	private List<String> rew;
	public mobile(String name, int num, certi cer, List<String> rew) {
		super();
		this.name = name;
		this.num = num;
		this.cer = cer;
		this.rew = rew;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+ ":" +num+  "\n" +cer+ "\n"+rew;
	}
	
	
	
	

}
