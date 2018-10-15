package mann_frau;

public abstract class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.print("Diese Person ist ein " + getGeschlecht());
		System.out.println(" und heisst " + name);
	}

	abstract String getGeschlecht();
}
