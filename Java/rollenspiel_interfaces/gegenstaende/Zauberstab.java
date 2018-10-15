package rollenspiel_interfaces.gegenstaende;

import rollenspiel_interfaces.spielfiguren.Spielfigur;

public class Zauberstab extends Gegenstand implements Magisch{
	
	private final double zauberkraft;
	private static final String NAME = "Zauberstab";
	private static final int GEWICHT = 1;
	
	public Zauberstab(double zauberkraft) {
		super(NAME, GEWICHT);
		this.zauberkraft=zauberkraft;
	}
	
	/*
	 * "Zauberkraft-Prozent" der Lebenspunkte der Zielspielfigur 
	 * werden den aktuellen Lebenspunkte aufgeschlagen.
	 */
	@Override
	public void zauberAnwenden(Spielfigur ziel) {
		ziel.setLebenspunkte(ziel.getLebenskraft()+zauberkraft*100);
			
	}
	
	@Override
	public double getZauberkraft() {
		return zauberkraft;
	}

}
