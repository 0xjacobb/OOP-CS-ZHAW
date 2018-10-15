package bauernhof_2;
import java.util.Comparator;

public class KuhComparator implements Comparator<Kuh> {
	public String sort;

	public KuhComparator(String sort) {
		this.sort=sort;
	}
	
	@Override
	public int compare(Kuh o1, Kuh o2) {
		switch(sort) {
			case "name": 	return o1.getName().compareTo(o2.getName());
			case "gewicht":	return o1.getGewicht() - o2.getGewicht();
			default: 		return o1.getGewicht() - o2.getGewicht();
		}
	}
}
