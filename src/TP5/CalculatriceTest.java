/**
 * 
 */
package TP5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author lb
 *
 */
class CalculatriceTest {

	/**
	 * Test method for {@link TP5.Calculatrice#equals(java.lang.Object)}.
	 */
	@Test
	void testEqualsObject() {
		Calculatrice calc1 = new Calculatrice(3);
		Calculatrice calc2 = new Calculatrice(3);
		
		assertEquals(true, calc1.equals(calc2));
		
		Calculatrice calc3 = new Calculatrice(3);
		Calculatrice calc4 = new Calculatrice(1);
		
		assertEquals(false, calc3.equals(calc4));
		
		Calculatrice calc5 = new Calculatrice();
		Calculatrice calc6 = new Calculatrice(3);
		
		assertEquals(false, calc5.equals(calc6));
	}


}
