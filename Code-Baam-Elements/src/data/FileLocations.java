package data;

import logic.*;

/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Die Klasse gibt fuer die verlangten Bilder die ensprechende File location an.
 */

public class FileLocations {
	/**
	 * 
	 * @param avatar
	 * @return
	 * Hier wird der Pfad des Bildes eines einzelnen Avatars zurückgegeben
	 */
	public String getAvatarImage(Avatar avatar) {
		String zw = null;
		if(avatar instanceof Feuerelementar) {
			zw = "/data/Feuer_Avatar.png";
		}else if(avatar instanceof Wasserelementar){
			zw = "/data/Wasser_Avatar.png";
		}else if(avatar instanceof Erdelementar){
			zw = "/data/Erd_Avatar.png";
		}else if(avatar instanceof Luftelementar){
			zw = "/data/Luft_Avatar.png";
		}
		return zw;
	}
	/**
	 * 
	 * @return
	 * hier wird der Pfad zum Bild fuer die Lebensanzeige zurueckgegeben.
	 */
	public String getHPImage() {
		String zw = "/data/Lebensanzeige_Hintergrund.png";
		return zw;
		
	}
}
