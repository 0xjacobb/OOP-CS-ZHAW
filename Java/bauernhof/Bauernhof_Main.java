package bauernhof;

public class Bauernhof_Main {

	public static void main(String[] args) {
		Bauernhof bauernhof = new Bauernhof();
		bauernhof.addTier(new Hund()); 
		bauernhof.addTier(new Katze()); 
		bauernhof.addTier(new Kuh());
		bauernhof.lautgeben();

	}

}
