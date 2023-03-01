package com.feb;

import java.util.ArrayList;
import java.util.List;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		ClassB.add(3,6);
		List<Double> totalPrice=new ArrayList<>();
		
		Table_ex obj=new Table_ex();
		obj.openWindow();
	for(int i=1; i<=31; i++) {
		try {
	String price=obj.table(i+"/");
	
	Double d=Double.parseDouble(price);
	totalPrice.add(d);
		}
		catch(java.lang.NumberFormatException e) {
			
		}
	}
	System.out.println(totalPrice);
	obj.textbox();
}
}