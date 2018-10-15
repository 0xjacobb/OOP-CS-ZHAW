package rollenspiel_interfaces.gegenstaende;

import rollenspiel_interfaces.spielfiguren.Spielfigur;

public interface Magisch {
	/**
	* F�hrt den Zauber auf die Spielfigur aus.
	*/
	void zauberAnwenden(Spielfigur ziel);

	/**
	* @return die Zauberkraft des magischen Objekt zur�ck.
	*/
	double getZauberkraft();
}
