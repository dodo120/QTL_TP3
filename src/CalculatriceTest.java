import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatriceTest {
	
	private static long startTime;
	private long testStartTime;
	
	@Test
    void testCalculatriceAddition() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.addition(4, -2));
    }
	
	@Test
    void testCalculatriceSoustraction() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.soustraction(4, 2));
    }
	
	@Test
    void testCalculatriceMultiplication() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(434*3645, calculatrice.multiplication(434, 3645));
    }
	
	@Test
    void testCalculatriceDivision() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(10.0, calculatrice.division(42,4));
    }
	
	@Test
    void testCalculatriceCalcul() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(46, calculatrice.calcul(42,4,"+"));
    }
	

	@Test
    void testCalculatriceFactorielleRecursive() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(120, calculatrice.factorielleRecursive(5));
    }
	
	@Test
	@Disabled
    void testCalculatriceFactorielleIterative() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(120, calculatrice.factorielleIterative(5));
    }
	
	
	@Test
	@Timeout(value = 10000)
    void testCalculatriceWait() {
		Calculatrice calculatrice = new Calculatrice();
        assertEquals(true, calculatrice.wait(10));
    }
	
	
	@ParameterizedTest
    @CsvSource({ "1, 2, 3", "4, 5, 9", "7, 8, 15" })
    void testCsvSource(int a, int b, int expected) {
		Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.addition(a, b);
        assertEquals(expected, result);
    }
	
	
	@ParameterizedTest
    @CsvFileSource(resources="~/test.csv")
    void testCsvFileSource(int a, int b, int expected) {
		Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.addition(a, b);
        assertEquals(expected, result);
    }
	
	
	@BeforeAll
    static void setUpAll() {
        startTime = System.currentTimeMillis();
        System.out.println("Démarrage des tests...");
    }

    @BeforeEach
    void setUp() {
        testStartTime = System.currentTimeMillis();
        System.out.println("Démarrage d\'un test...");
    }
    
    
    @AfterEach
    void afterTest() {
        long testEndTime = System.currentTimeMillis();
        long testDuration = testEndTime - testStartTime;
        System.out.println("Test fini en " + testDuration + "ms");
    }

    @AfterAll
    static void afterAllTest() {
        long endTime = System.currentTimeMillis();
        long totalDuration = endTime - startTime;
        System.out.println("Tous les tests finis en " + totalDuration + "ms");
    }

}
