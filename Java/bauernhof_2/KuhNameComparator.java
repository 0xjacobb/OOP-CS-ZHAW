package bauernhof_2;
import java.util.Comparator;

public class KuhNameComparator implements Comparator<Kuh> {

	@Override
	public int compare(Kuh o1, Kuh o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
