package rollenspiel_interfaces.gegenstaende;

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
	
	@Override
	  public int hashCode() {
	    // vereinfachte Version
	    return nameGegenstand.hashCode() + gewichtGegenstand;
	  }
	  
	  @Override
	  public boolean equals(Object obj) {
	    if (obj == null) {
	      return false;
	    }
	    
	    if (this == obj) {
	      return true;
	    }
	    
	    if (!(obj instanceof Gegenstand)) {
	      return false;
	    }
	    
	    Gegenstand other = (Gegenstand) obj;
	    
	    return this.nameGegenstand.equals(other.getNameGegenstand()) && this.gewichtGegenstand == other.getGewichtGegenstand();
	  }
	
}
