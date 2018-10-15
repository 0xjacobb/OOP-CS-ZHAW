package rollenspiel.waffen;

public class Waffe {
	
	private int angriffswert;
	
	public Waffe(int angriffswert) {
		this.angriffswert = angriffswert;
	}

	/**
	 * Gibt den Kampfwert der aktuellen Waffe zurueck.
	 * @return der Kampfwert "angriffswert"
	 */
	public int getKampfwert() {
		return angriffswert;
	}

}
