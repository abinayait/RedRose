package com.feb;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		ClassB.add(3,6);
		List<Double> totalPrice=new ArrayList<>();
		
		Table_ex obj=new Table_ex();
		obj.openWindow();
	for(int i=1; i<=31; i++) {
		try {
	String price=obj.tablegold(i+"/");
	
	Double d=Double.parseDouble(price);
	totalPrice.add(d);
		}
		catch(java.lang.NumberFormatException e) {
			
		}
	}
	System.out.println(totalPrice);
	
	for (WebElement s : obj.tablesilver()) {
		String s1=s.getText();
		
		
	}
	for(int i=1; i<=10;i++) {
	System.out.println(obj.tablesilverValue());
	}
	obj.textbox();
}
}