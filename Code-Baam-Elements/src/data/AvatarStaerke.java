package data;

import logic.*;


/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
 * Avatarkombinationen werden auf staerken/schwaechen ueberprueft
 */

public class AvatarStaerke {
	private Avatar Avatar_1;
	private Avatar Avatar_2;
	/**
	 * 
	 * @param Avatar_1
	 * @param Avatar_2
	 * Konstruktor, hier werden die beiden Avatar Objekte mitgegeben und in die lokalen Variablen gespeichert 
	 */
	public AvatarStaerke(Avatar Avatar_1, Avatar Avatar_2){
		this.Avatar_1 = Avatar_1;
		this.Avatar_2 = Avatar_2;
	}
	/**
	 * 
	 * @return zw
	 * Hier wird auf die einzelnen staerken der Avatare ueberpreueft. Wenn ein Avatar staerker ist, wird er mit dem return Wert zw zurueckgegeben
	 */
	public Avatar Staerkenvergleich(){
		Avatar zw = null;
		

			if(Avatar_1 instanceof Feuerelementar || Avatar_1 instanceof Erdelementar && Avatar_2 instanceof Feuerelementar || Avatar_2 instanceof Erdelementar){
				if(Avatar_1 instanceof Feuerelementar){
					return Avatar_1;
				}else if(Avatar_2 instanceof Feuerelementar){
					return Avatar_2;
				}
			}

			else if(Avatar_1 instanceof Erdelementar || Avatar_1 instanceof Luftelementar && Avatar_2 instanceof Erdelementar || Avatar_2 instanceof Luftelementar){
				if(Avatar_1 instanceof Erdelementar){
					return Avatar_1;
				}else if(Avatar_2 instanceof Erdelementar){
					return Avatar_2;
				}
			}

			else if(Avatar_1 instanceof Luftelementar || Avatar_1 instanceof Wasserelementar && Avatar_2 instanceof Luftelementar || Avatar_2 instanceof Wasserelementar){
				if(Avatar_1 instanceof Luftelementar){
					return Avatar_1;
				}else if(Avatar_2 instanceof Luftelementar){
					return Avatar_2;
				}
			}

			else if(Avatar_1 instanceof Wasserelementar || Avatar_1 instanceof Feuerelementar && Avatar_2 instanceof Wasserelementar || Avatar_2 instanceof Feuerelementar){
				if(Avatar_1 instanceof Wasserelementar){
					return Avatar_1;
				}else if(Avatar_2 instanceof Wasserelementar){
					return Avatar_2;
				}
			}
		
		return zw;
	}
}
