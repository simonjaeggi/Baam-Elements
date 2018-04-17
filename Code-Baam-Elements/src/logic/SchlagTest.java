package logic;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Dieses Junit Testfile dient zum Test der Funktion schlag.
 *
 */
public class SchlagTest {
	Avatar Avatar_1 = new Feuerelementar();
	Avatar Avatar_2 = new Erdelementar();
	Kampf s = new Kampf(Avatar_1, Avatar_2);
	/**
	 * hier wird jeweils vor und nach einem kampf auf die korrekte Veraenderung der Lebenspunkte ueberprueft
	 * ausserdem ob der richtige Avatar gestorben ist.
	 */

	@Test
	public void testAngreifen() {
		assertEquals(100, Avatar_1.getLebenspunkte(), 0.01);
		assertEquals(120, Avatar_2.getLebenspunkte(), 0.01);

		while(s.gestorben(Avatar_1) == false && s.gestorben(Avatar_2) == false){
			s.kaempfen();
		}
		if(Avatar_1.getLebenspunkte() <= 0){
			assertTrue(s.gestorben(Avatar_1));
		}else if(Avatar_2.getLebenspunkte() <= 0){
			assertTrue(s.gestorben(Avatar_2));
		}
		
	}


}


