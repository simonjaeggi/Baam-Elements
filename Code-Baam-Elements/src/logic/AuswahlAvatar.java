package logic;
import java.util.Random;

/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt 
 * Klasse zur zufaelligen Auswahl eines Avatars.
  */
public class AuswahlAvatar {
	private Avatar Feuerelementar = new Feuerelementar();
	private Avatar Wasserelementar = new Wasserelementar();
	private Avatar Luftelementar = new Luftelementar();
	private Avatar Erdelementar = new Erdelementar();

	/**
	 * 
	 * @return Avatar
	 * Gibt einen zufaellig ausgewählten Avatar zurück.
	 */
	public Avatar RandomAvatar(){
		Random rand = new Random();
		int rz = rand.nextInt((4 - 1) + 1) + 1;

		switch (rz){
		case 1:	return Feuerelementar;
		case 2: return Wasserelementar;
		case 3: return Luftelementar;
		case 4: return Erdelementar;
		}
		return null;
		
	}
}
