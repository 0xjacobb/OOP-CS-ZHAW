package rollenspiel_interfaces.waffen;

public class Handwaffe extends Waffe {
	
	private int verteidigungswert;
	
	public Handwaffe(int angriffswert, int verteidigungswert) {
		super(angriffswert);
		this.verteidigungswert = verteidigungswert;
	}
	
	/**
	 * Berechnet den Kampfwert speziell für Handwaffen.
	 * @return den neuen Kampfwert
	 */
	public int getKampfwert() {
		return (int) (super.getKampfwert() + (0.5* verteidigungswert));
	}
	
	public int getVerteidigungswert() {
		return verteidigungswert;
	}
	
}
