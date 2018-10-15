package rollenspiel.rollenspielMain;
import rollenspiel.spielfiguren.Elf;
import rollenspiel.spielfiguren.Mensch;
import rollenspiel.spielfiguren.Ork;
import rollenspiel.spielfiguren.Spielfigur;


public class RollenspielMain {

	private Spielfigur ork1;
	private Spielfigur elf1;
	private Spielfigur mensch1;
	
	/**
	 * Non static Methdoe um das Spiel zu starten. Code kann nicht in main MEthdoe ren, da es eine static Mehtode ist und somit keine non-static
	 * methoden referenzeiren kann.static Methoden koennen als "one thing" angeschaut werden.
	 * Ich kann somit in der static Mehtode keine non.-sstic Objekte referenzieren z.B keine Spielfiguren etc von denen 
	 * es jeweils mehr als eine gibt.
	 */
	public void play() {
		ork1 = new Ork("Shrek", 10, 10, false);
		ork1.setWaffe();
		
		elf1 = new Elf("Frida", 10, 10, true, 10);
		elf1.setWaffe();
		
		mensch1 = new Mensch("Walti", 5, 15, false);
		mensch1.setWaffe();
	}
	
	public static void main(String[] args) {
		RollenspielMain game = new RollenspielMain();
		game.play();
		
	}
}
