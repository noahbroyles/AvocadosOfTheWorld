/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package fruit;
/***
 * Model an Avocado at Meijer in the Produce Department
 * @author nicomp
 *
 */
public class Avocado extends Fruit {

	public Avocado(Avocado a) {
		super(a.getWeight(), a.getCost());
	}

	public Avocado() {}
	
}
