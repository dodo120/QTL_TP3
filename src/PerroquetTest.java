import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PerroquetTest {
	
	@Test
    void testPerroquetParlant() {
		Perroquet perroquet = new Perroquet();
        assertEquals("Hello", perroquet.perroquetParlant("Hello"));
    }
	
	@Test
    void testPerroquetBonjour() {
		Perroquet perroquet = new Perroquet();
        assertEquals("Bonjour Clément", perroquet.perroquetBonjour("Clément"));
    }

}
