/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit;
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */
public abstract class Fruit {

	private int weight;
	private float cost;
	
	
	
	public Fruit () {}
	
	public Fruit(int weight, float cost) {
		setWeight(weight);
		setCost(cost);
	}
	
	
	
	
	// Getters and setters
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
