package rollenspiel_interfaces.spielfiguren;

public class Ork extends Spielfigur {
	private static final int IQBASIS=30;
	
	public Ork(String name, double lebenspunkte, int tragkraft, boolean kannZaubern) {
		super(name, lebenspunkte, tragkraft, kannZaubern);
				
	}
	
	protected int getIQ() {
		return IQBASIS + (int)super.getKampfwert();
	}

}
