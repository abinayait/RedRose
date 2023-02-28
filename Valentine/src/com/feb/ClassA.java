package com.feb;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		ClassB.add(3,6);
		
		Table_ex obj=new Table_ex();
		obj.openWindow();
	for(int i=1; i<=31; i++) {
		
		obj.table(i+"");
		
	}
}
}