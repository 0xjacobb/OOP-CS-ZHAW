package rollenspiel.gegenstaende;

public class Gegenstand {
	private String nameGegenstand;
	private int gewichtGegenstand;
	
	public Gegenstand(String name, int gewicht) {
		nameGegenstand = name;
		gewichtGegenstand = gewicht;
		
	}
	
	public String getNameGegenstand() {
		return nameGegenstand;
	}
	
	public int getGewichtGegenstand() {
		return gewichtGegenstand;
	}
}
