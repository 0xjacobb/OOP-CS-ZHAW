package mann_frau;

public class Frau extends Person {
	
	public Frau (String name) {
		super(name);
	}
	
	@Override
	public String getGeschlecht() {
		return "eine Frau";
	}

}
