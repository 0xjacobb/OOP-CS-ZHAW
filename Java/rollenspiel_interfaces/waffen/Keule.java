package rollenspiel_interfaces.waffen;

public class Keule extends Handwaffe {
	
	private static final int ANGRIFFSWERT = 5; 
	private static final int VERTEIDIGUNGSWERT = 5; 

	public Keule() {
		super(ANGRIFFSWERT, VERTEIDIGUNGSWERT);
	}

}
