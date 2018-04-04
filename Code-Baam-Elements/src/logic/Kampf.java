package logic;
import data.AvatarStaerke;;
/**
 * 
 * @author Simon Jäggi, Lukas Reinhardt
 * Die Klasse Kampf wird zentral zur simulation des Kampfes simuliert.
 */
public class Kampf {
	private Avatar Avatar_1;
	private Avatar Avatar_2;
	private Avatar StarkerAvatar;
	private AvatarStaerke as;
	/**
	 * 
	 * @param Avatar_1
	 * @param Avatar_2
	 * Konstruktor, die beiden kaempfenden Avatare werden lokal gespeichert und auf Staerke ueberprueft.
	 */
	public Kampf(Avatar Avatar_1, Avatar Avatar_2){
		this.Avatar_1 = Avatar_1;
		this.Avatar_2 = Avatar_2;
		as = new AvatarStaerke(Avatar_1, Avatar_2);
		StarkerAvatar = as.Staerkenvergleich();
		
		
	}
	/**
	 * hier werden die einzelnen Angriffe ausgeführt und verrechnet. Falls einer der Avatare stirbt wird eine entsprechende Methode aufgerufen.
	 */
	public void kaempfen(){
		
		double zw = Avatar_1.AngreifenAufrufen();
		if(Avatar_1 == StarkerAvatar){
			zw = zw * 1.2;
			
		}
		Avatar_2.WenigerLebenspunkte(zw);
		if (gestorben(Avatar_2) == true){
			gewonnen();
		}
		zw = Avatar_2.AngreifenAufrufen();
		if(Avatar_2 == StarkerAvatar){
			zw = zw * 1.2;
		}
		Avatar_1.WenigerLebenspunkte(zw);
		if (gestorben(Avatar_1) == true){
			verloren();
			
		}
		
	}
	/**
	 * 
	 * @param avatar
	 * @return
	 * Hier wird bei einem Avatar ueberprueft, ob er gestorben ist.
	 */
	private boolean gestorben(Avatar avatar){

		if (avatar.getLebenspunkte() <= 1){
			return true;
		}
		return false;
	}
	/**
	 * Diese Methode wird aufgerufen, wenn der Spieler gewonnen hat. Eine entsprechende Meldung wird ausgegeben.
	 */
	private void gewonnen(){
		System.out.println("Yaay, you won!");
	}
	/**
	 * Diese Methode wird aufgerufen, wenn der Spieler verloren hat. Eine entsprechende Meldung wird ausgegeben.
	 */
	private void verloren(){
		System.out.println("Awww, you lost!");
	}
}
