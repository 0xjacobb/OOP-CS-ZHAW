package lebewesen;

public class Main {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		test10();
		test11();
		test12();
		test13();

	}

	static void  test1() {
		Lebewesen lebewesen = (Lebewesen) new Knollenblaetterpilz(); 
		Pilz pilz = (Pilz) lebewesen;
	}

	static void  test2() {
		Pilz pilz = new Champignon();

	}

	static void  test3() {
		Essbar essbar = new Champignon(); 
		// Essbar muss zu einem Lebewesen gecastet werden
		//Lebewesen lebewesen = essbar;		
		Lebewesen lebewesen = (Lebewesen) essbar;		
	}

	static void  test4() {
		Lebewesen pilz = new Wiesenchampignon(); 
		// Der Cast zu einem Knollblaetterpilz geht nicht, weil das I/F Essabar fehlt
		//Knollenblaetterpilz pilz2 = (Knollenblaetterpilz) pilz;
	}
	
	static void  test5() {
		// Lebewesen ist eine abstrakte Klasse
		//Essbar essbar = new Lebewesen(); 
		//Kopfsalat lebewesen = (Kopfsalat) essbar;
	}
	
	static void test6 () {
		Essbar essbar = new Champignon(); 
		// Champignon champignon = essbar;
		Champignon champignon = (Champignon) essbar;
	}

	static void test7 () {
		Essbar essbar = new Kopfsalat(); 
		// Der Kopfsalat kann nicht zu einem Pilz gemacht werden
		//Wiesenchampignon pilz = (Wiesenchampignon) essbar;		
	}

	static void test8 () {
		Pilz pilz = new Champignon(); 
		Lebewesen lebewesen = pilz;		
	}

	
	static void test9 () {
		// der Knollenblätterpilz implementiert das I/F Essbar nicht
		//Champignon champignon = (Champignon) new Knollenblaetterpilz();
	}

	
	static void test10 () {
		Essbar essbar = new Wiesenchampignon(); 
		Pilz pilz = (Champignon) essbar;		
	}
	
	static void test11() {
		Champignon pilz = new Wiesenchampignon(); 
		// ein auf Essbar reduziertes Objekt kann nicht einem Champignon zugewiesen werden
		//Champignon champignon = (Essbar) pilz;
	}
	
	static void test12() {
		// abstract class kann nicht instanziert werden
		//Lebewesen pilz = (Lebewesen) new Pilz();
	}
	
	static void test13() {
		Lebewesen lebewesen = new Wiesenchampignon();
		Pilz pilz = (Champignon) lebewesen;
	}
	

}
