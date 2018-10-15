package rollenspiel_interfaces.spielfiguren;

import java.util.ArrayList;
import java.util.List;

import rollenspiel_interfaces.gegenstaende.Gegenstand;
import rollenspiel_interfaces.gegenstaende.Magisch;

public class Zauberer extends Mensch {
	
	private List<Magisch> magischeGegenstaende;
	private double magiePunkte;
	
	public Zauberer(String name, double lebenspunkte, int tragkraft, boolean kannZaubern, double magiePunkte) {
		super(name, lebenspunkte, tragkraft, kannZaubern);
		this.magiePunkte=magiePunkte;
		magischeGegenstaende = new ArrayList<Magisch>();
	}
	
	public void setMagiePunkte(double neueMagiePunkte){
		magiePunkte = neueMagiePunkte;
	}
	
	/**
	* Benuetzt den gegebenen magischen Gegenstand auf die Ziel-Spielfigur, aber
	* nur wenn der magischer Gegenstand im Besitze des Zauberers ist.
	*
	* @param magischerGegenstand den magischen Gegenstand
	* @param ziel die Ziel-Spielfigur
	*/
	public void zaubern(Magisch magischerGegenstand, Spielfigur ziel) {
		if(magischeGegenstaende.contains(magischerGegenstand)) {
			magischerGegenstand.zauberAnwenden(ziel);
			// contains ruft equals auf und deshlab muss man equls und hashcode überschreiebn
		}
	}
	
	@Override
	protected int getIQ() {
		return (int) (super.getIQ()+magiePunkte/2);
	}
	
	@Override
	 public boolean nehmeGegenstand(Gegenstand gegenstand) {
		if(super.nehmeGegenstand(gegenstand)) {
			if(gegenstand instanceof Magisch) {
				magischeGegenstaende.add((Magisch)gegenstand);
				return true;
			}	
		}
		 return false;
	 }
}
