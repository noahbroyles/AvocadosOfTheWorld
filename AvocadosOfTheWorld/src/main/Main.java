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
		 
		
		Avocado avocajoe = new Avocado(6, (float).50);
		System.out.println(avocajoe);
		
		Bin bin = new Bin(avocajoe);
		System.out.println(bin);
	}
}
