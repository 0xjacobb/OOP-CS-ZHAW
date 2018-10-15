package rollenspiel.spielfiguren;

public class Elf extends Spielfigur {
	
	private int zauberwert;
	
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

}
