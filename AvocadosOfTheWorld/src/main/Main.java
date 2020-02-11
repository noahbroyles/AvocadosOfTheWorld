/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package main;

import fruit.Fruit;

public class Main {

	public static void main(String[] args) {
		 
		Fruit avocajo = new Fruit();
		avocajo.setCost((float) 0.65);
		avocajo.setWeight(1);
		
		System.out.println(avocajo);
	}
}
