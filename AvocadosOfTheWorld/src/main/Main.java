/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package main;

import bin.*;
import fruit.*;

public class Main {

	public static void main(String[] args) {
		 
		
		Avocado avocajoe = new Avocado();
		avocajoe.setCost((float)0.6);
		avocajoe.setWeight(4);
		System.out.println(avocajoe);
		
		Bin bin = new Bin(avocajoe);
		System.out.println(bin);
	}
}
