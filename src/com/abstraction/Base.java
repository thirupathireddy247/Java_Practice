package com.abstraction;

public class Base extends Abstract_Method {

	

	@Override
	void loan() {
		// TODO Auto-generated method stub
		System.out.println("agriculture loan");
	}

	@Override
	void mobile() {
		// TODO Auto-generated method stub
		System.out.println("mi mobile");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b=new Base();
		/*
		 * b.hello(); b.hai();
		 */
		b.mobile();
		b.loan();
	}
	
	
	
}
