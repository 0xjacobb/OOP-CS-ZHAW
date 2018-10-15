package rollenspiel_interfaces.spielfiguren;

public class Elf extends Spielfigur {
	
	private int zauberwert;
	private static final int IQBASIS=130;
	
	public Elf(String name, double lebenspunkte, int tragkraft, boolean kannZaubern, int zauberwert) {
		super(name, lebenspunkte, tragkraft, kannZaubern);
		this.zauberwert=zauberwert;
		
	}
	
	public int getZauberwert() {
		return zauberwert;
	}
	
	public double getKampfwert() {
		return super.getKampfwert() + 0.5*zauberwert;
	}
	
	protected int getIQ() {
		return IQBASIS+super.getName().length();
	}

}
