package bauernhof_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class Bauernhof {
	private HashSet<Tier> set = new HashSet<Tier>();
	private List<Kuh> kuhstall = new ArrayList<Kuh>();
	
	public void addTier(Tier obj) {
		set.add(obj);
		if(obj instanceof Kuh) {
			Kuh kuh = (Kuh)obj;
			kuhstall.add(kuh);
		}
	}
	
	/*public void printKuehe() {
		//Collections.sort(kuhstall, new KuhNameComparator());
		Collections.sort(kuhstall, new KuhGewichtComparator());
		
		for (Kuh kuh : kuhstall) {
			System.out.println("Name: " + kuh.getName() +" Gewicht: " + kuh.getGewicht());
		}
	}*/
	
	public void printKuehe() {
		Collections.sort(kuhstall, new KuhComparator("gewicht"));
		
		for (Kuh kuh : kuhstall) {
			System.out.println("Name: " + kuh.getName() +" Gewicht: " + kuh.getGewicht());
		}
	}
	
	public void lautgeben() {
		for (Tier tier : set) {
			tier.gibLaut();
		}
	}
}
