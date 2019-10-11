/**
 * 
 */
package TP4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author lb
 *
 */
class CalculatriceTest {

	@Test
	void test() {
		Calculatrice calc1 = new Calculatrice(); 
		assertEquals(0, calc1.carre(0));
	}

}
