

import java.io.Serializable;

public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private House preferredHouse;
	
	public Animal(String nm, House h) {
		name = nm;
		preferredHouse = h;
	}
	
	@Override
	public String toString() {
		return "Animal [ref="+super.toString()+", name=" + this.name + ", prefH=" + this.preferredHouse
				+ "]";
	}	
}