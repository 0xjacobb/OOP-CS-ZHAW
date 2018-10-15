package bauernhof_2;
import java.util.Comparator;

public class KuhGewichtComparator implements Comparator<Kuh>  {

	@Override
	public int compare(Kuh o1, Kuh o2) {
		return o1.getGewicht() - o2.getGewicht();
	}



}
