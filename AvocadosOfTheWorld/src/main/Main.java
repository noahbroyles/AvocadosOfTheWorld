/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package main;

import fruit.Fruit;

public class Main {

	public static void main(String[] args) {
		 
		Fruit kiwi = new Fruit();
		kiwi.setCost((float) 0.65);
		kiwi.setWeight(1);
		
		System.out.println(kiwi);
	}
}
