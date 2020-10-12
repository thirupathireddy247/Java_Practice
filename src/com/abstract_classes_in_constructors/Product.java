package com.abstract_classes_in_constructors;

public abstract class Product {
	int multiplyBy;
	public Product(int multiplyBy) {
		this.multiplyBy=multiplyBy;
	}
	public int multiply(int val)
	{
		return multiplyBy*val;
	}

}
