package serialisierung;

import java.io.Serializable;

public class Auto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6944254490606655720L;
	public String farbe;
	public Motor motor;

	public Auto (String farbe, Motor motor) {
		super();
		this.farbe = farbe;
		this.motor = motor;
	}
	
	public String getFarbe() {
		return farbe;
	}


	public Motor getMotor() {
		return motor;
	}

}
