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
		assertEquals(true, exo.estPair(-2));
		assertEquals(false, exo.estPair(1));
		assertEquals(33.2, exo.perimetreCarre(8.3));
		assertEquals(0.0, exo.perimetreCarre(-9.0));
		assertEquals(0.0, exo.perimetreCarre(0.0));
		assertEquals(20, exo.perimetreCarre(5));
		assertEquals(3, exo.contientCaractere('a', "zaebaebzaz"));
		assertEquals(0, exo.contientCaractere('s', "zaebaebzaz"));
		assertEquals(0, exo.contientCaractere('à', "zaebaebzaz"));
		assertEquals(3, exo.contientCaractere('z', "zaeb    aebzaz"));
		
		
	}

}
