package mann_frau;

public class Mann extends Person {
	
	public Mann (String name) {
		super(name);
	}
	
	
	@Override
	public String getGeschlecht() {
		return "ein Mann";
	}
}
