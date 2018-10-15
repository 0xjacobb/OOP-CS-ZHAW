package bauernhof;
import java.util.HashSet;

public class Bauernhof {
	private HashSet<Tier> set = new HashSet<Tier>();
	
	public void addTier(Tier obj) {
		set.add(obj);
	}
	
	public void lautgeben() {
		for (Tier tier : set) {
			tier.gibLaut();
		}
	}
}
