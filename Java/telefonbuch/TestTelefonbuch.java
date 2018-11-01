package telefonbuch;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestTelefonbuch {

	@Test
	void testAddEntry() {
		Telefonbuch test = new Telefonbuch();
		test.addEntry("Marc", "1");
		assertTrue("", test.name == "Marc");
		
		test.addEntry("Stefan", "2");
		assertTrue("", test.name == "Stefan");
		
	}
	
	@Test
	void testPrintTelBuch() {
		Telefonbuch test = new Telefonbuch();
		test.addEntry("Marc", "1");
		test.addEntry("Stefan", "2");
		test.printTelBuch();
	}
}
