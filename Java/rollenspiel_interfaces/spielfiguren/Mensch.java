package rollenspiel_interfaces.spielfiguren;

public class Mensch extends Spielfigur {
	private static final int IQBASIS=98;
	
	public Mensch(String name, double lebenspunkte, int tragkraft, boolean kannZaubern) {
		super(name, lebenspunkte, tragkraft, kannZaubern);
		
	}
	
	protected int getIQ() {
		return IQBASIS; //TODO + Anzahl Gegenstände;
	}

}
