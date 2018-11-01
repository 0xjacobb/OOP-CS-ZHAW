// Marc Steiner
// Date of birth: 1.11.2018
// Übung 2, Exception Handling CAS OOP

package telefonbuch;

import java.util.Map;
import java.util.TreeMap;

public class Telefonbuch {
	
	public Map<String, String> telBuch;
	public String name;
	public String nummer;
	
	public Telefonbuch() {
		telBuch = new TreeMap<>();
	}
	
	public void addEntry(String name, String nummer) throws NotValidEntryException {
		name = this.name;
		nummer = this.nummer;
		
		if (name == null || nummer == null) {
			throw new NotValidEntryException ("NULL Werte vorhanden in addEntry Methode");
		}
		
		else {
			telBuch.put(name, nummer);
		}
	}
	
	public void printTelBuch() {
		for(Map.Entry<String, String> e : telBuch.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("Der Name ist: " + key + "Die Nummer ist: " + value);
		}
	}
	
	public static void main(String[] args) {
		Telefonbuch test = new Telefonbuch();
		try {
			test.addEntry("Marc", "1");
			test.addEntry("Stefan", "2");
			test.printTelBuch();
		}
		
		catch (NotValidEntryException e) {
			System.out.println(e.toString());
		}
		
	}
}
