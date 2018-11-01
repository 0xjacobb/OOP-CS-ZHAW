package telefonbuch;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestTelefonbuch {

	@Test
	void testAddEntry() {
		Telefonbuch test = new Telefonbuch();
		try {
			test.addEntry("Marc", "1");
			assertTrue("", test.name == "Marc");
		}
		catch (NotValidEntryException e) {
			System.out.println(e.toString());
		}
		
		
		try {
			test.addEntry("Stefan", "2");
			assertTrue("", test.name == "Stefan");
		}
		catch (NotValidEntryException e) {
			System.out.println(e.toString());
		}
		
	}
	
	@Test
	void testPrintTelBuch() {
		Telefonbuch test = new Telefonbuch();
		try {
			test.addEntry("Marc", "1");
			assertTrue("", test.name == "Marc");
		}
		catch (NotValidEntryException e) {
			System.out.println(e.toString());
		}
		
		
		try {
			test.addEntry("Stefan", "2");
			assertTrue("", test.name == "Stefan");
		}
		catch (NotValidEntryException e) {
			System.out.println(e.toString());
		}
		
		test.printTelBuch();
	}
}
