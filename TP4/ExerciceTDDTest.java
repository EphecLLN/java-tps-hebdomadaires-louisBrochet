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
class ExerciceTDDTest {

	@Test
	void test() {
		ExerciceTDD exo = new ExerciceTDD();
		assertEquals(true, exo.estPair(0));
		assertEquals(33.2, exo.perimetreCarre(8.3));
	}

}
