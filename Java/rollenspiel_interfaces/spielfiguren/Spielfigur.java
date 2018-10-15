package rollenspiel_interfaces.spielfiguren;

import java.util.ArrayList;
import java.util.Random;

import rollenspiel_interfaces.gegenstaende.Gegenstand;
import rollenspiel_interfaces.waffen.Keule;
import rollenspiel_interfaces.waffen.Waffe;

public abstract class Spielfigur {
	
	private String name;
	private double lebenspunkte;
	private int tragkraft;
	private boolean kannZaubern;
	private boolean hatEineWaffe = false;
	private Waffe aktuelleWaffe;
	private ArrayList<Gegenstand> gegenstaende;
	
	public Spielfigur(String name, double lebenspunkte, int tragkraft, boolean kannZaubern) {
		this.name = name;
		this.lebenspunkte = lebenspunkte;
		this.tragkraft = tragkraft;
		this.kannZaubern = kannZaubern;
		aktuelleWaffe = new Keule ();
	}
	
	/**
	 * Definiert, dass eine Spielfigur eine Waffe besitzen wird
	 */
	public void setWaffe() {
		hatEineWaffe = true;
	}
	
	/**
	 * �berpr�ft ob die Spielfigur eine Waffe besitzt
	 * @return true oder false 
	 */
	public boolean getWaffe() {
		return hatEineWaffe;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getKannZaubern() {
		return kannZaubern;
	}
	
	public double getLebenskraft() {
		return lebenspunkte;
	}
	
	public void setLebenspunkte(double lebenspunkte) {
		this.lebenspunkte=lebenspunkte;
	}
	/**
	 * Gibt den Kampfwert der Spielfigur inkl. Waffe zurueck.
	 * Der Kampfwert der Waffe wird mit einer Random-Nr. zwischen
	 * 0.9 und 1.1 multipliziert.
	 * Dem Kampfwert des Elf wird zusätzlich die Hälfte des Zauberwerts addiert.
	 * @return kampfwert
	 */
	public double getKampfwert() {
		double n = (new Random().nextDouble()) * (1.1-0.9)+0.9; // random value between 0.- and 1.1
		double kampfwert = aktuelleWaffe.getKampfwert() * n;		
		return kampfwert;
	}
	
	/**
	 * Spielfiguren können neue Waffen aufnehmen wenn noch keine Waffe im Besitz
	 */
	public void waffeAufnehmen(Waffe waffe) {
		if (!getWaffe()) {
			aktuelleWaffe = waffe;
		}
	}	
	
	/**
	 * Nimmt ein Gegenstand auf, jedoch nur, wenn noch genuegend Tragkraft vorhanden ist.
	 * Wird ein Gegenstand aufgenommen, wird die Tragkraft entsprechend reduziert und
	 * <code>true</code> zurueckgegeben. Ist der Gegenstand zu schwer fuer die
	 * verbleibende Tragkraft, so wird <code>false</code> zurueckgegeben.
	 *
	 * @param gegenstand der Gegenstand, der aufgenommen werden soll.
	 * @return <code>true</code> wenn der Gegenstand aufgenommen wurde,
	 * sonst <code>false</code>.
	 */
	
	 public boolean nehmeGegenstand(Gegenstand gegenstand) {
		 
		 if(tragkraft >= gegenstand.getGewichtGegenstand()) {
			 tragkraft = tragkraft - gegenstand.getGewichtGegenstand();
			 gegenstaende.add(gegenstand);				 
			 return true;
		 }
		 return false;
	 }
	 
	 /**
	  * Laesst diese Spielfigur gegen eine andere Spielfigur kaempfen.
	  *
	  * Gekaempft wird in Runden. Es wird solange gekaempft, bis eine oder beide
	  * Spielfiguren keine Lebenspunkte mehr haben. Steht nach 20 Runden noch kein Sieger
	  * fest, wird der Kampf abgebrochen.
	  *
	  * Bei jeder Runde wird der Kampfwert der einen Spielfigur den Lebenspunkten
	  * des Gegners abgezogen und umgekehrt.
	  *
	  * Diejenige Spielfigur mit den meisten verbliebenen Lebenspunkten gewinnt.
	  *
	  * @param gegner die andere Spielfigur
	  * @return <code>true</code>, falls der Kampf gewonnen wird, sonst <code>false</code>.
	  */
	 public boolean kaempfeGegen(Spielfigur gegner) {
		int spielRunden = 0;
		
		 while(getLebenskraft() >0 && gegner.getLebenskraft() >0 && spielRunden <=20) {
			 setLebenspunkte(getLebenskraft()-gegner.getKampfwert());
				gegner.setLebenspunkte(gegner.getLebenskraft()-getKampfwert());
				spielRunden++;
			 }
		 return getLebenskraft() > gegner.getLebenskraft();
	 }
	 
	 abstract protected int getIQ();
}