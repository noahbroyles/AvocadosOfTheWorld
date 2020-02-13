package bin;

import fruit.Avocado;

/***
 * The thing at Meijer that holds produce for sale
 * @author broylend
 *
 */
public class Bin {
	
	private Avocado avocado;
	
	public Bin() {}
	
	public Bin(Avocado a) {
		setAvocado(a);
	}
	
	
	public String toString() {
		return "This bin contains: " + avocado;
	}


	// Getters and setters
	/**
	 * @return the avocado
	 */
	public Avocado getAvocado() {
		return avocado;
	}

	/**
	 * @param avocado the avocado to set
	 */
	public void setAvocado(Avocado avocado) {
		this.avocado = avocado;
	}
	

}
