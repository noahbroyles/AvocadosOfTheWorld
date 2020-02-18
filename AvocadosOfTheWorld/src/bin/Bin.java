package bin;

import java.util.ArrayList;

import fruit.Avocado;

/***
 * The thing at Meijer that holds produce for sale
 * @author broylend
 *
 */
public class Bin {
	
	private Avocado avocado;
	private ArrayList<Avocado> avocados;
	
	public Bin() {}
	
	

	public Bin(Avocado a) {
		this.avocado = a;
		this.avocado = new Avocado(a);
		
		avocados = new ArrayList<Avocado>();
	}
	

	
	
	public void addAvocado(Avocado a) {
		avocados.add(new Avocado(a));
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
