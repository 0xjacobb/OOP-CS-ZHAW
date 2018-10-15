package mann_frau;
import java.util.ArrayList;
import java.util.List;

public class Register {
	List<Person> personen = new ArrayList<Person>();
	
	public void ausgeben() {
		for (Person p : personen){
			p.printInfo();
		}
	}
	
	public void addPerson(Person obj) {
		personen.add(obj);
	}

	public static void main(String[] args) {
		Register register = new Register();
		register.addPerson(new Mann("Marc"));
		register.addPerson(new Frau("Angie"));
		register.ausgeben();
	}
}
