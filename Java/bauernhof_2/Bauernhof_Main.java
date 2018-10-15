package bauernhof_2;

public class Bauernhof_Main {

	public static void main(String[] args) {
		Bauernhof bauernhof = new Bauernhof();
		/*bauernhof.addTier(new Hund()); 
		bauernhof.addTier(new Katze()); 
		bauernhof.addTier(new Kuh());
		bauernhof.lautgeben();*/
		
		bauernhof.addTier(new Kuh("Lise", 100));
		bauernhof.addTier(new Kuh("Muni", 1000));
		bauernhof.addTier(new Kuh("Anna", 500));
		bauernhof.printKuehe();
	}

}
