package logic;
import java.util.Random;

/**
 * 
 * @author Simon Jäggi, Lukas Reinhardt
 * Stellt den Angriff "Schlag" dar.
 */
public class Schlag implements Angriffsverhalten{
	private double KritischerTreffer = 0.25;
	private double Verfehlen = 0.3;
	private double Schaden = 15;
	private Random rand = new Random();

	/**
	 * hier wird der Schadenswert des Schlages verrechnet. Dabei wird auf verfehlen und kritisch treffen überprüft.
	 */
	public double angreifen() {
		double zw = 0;
		if(verfehlen() == false){
			zw = Schaden;
			if(kritisch() == true){
				zw = zw * 1.5;
			}
		}
		
		return zw;
	}
	/**
	 * Hier wird ueberprueft, ob ein Angriff verfehlt hat oder nicht.
	 * @return
	 */
	private boolean verfehlen(){

		double rz = rand.nextDouble();
		if (rz > Verfehlen ){
			return false;
		}
		return true;
	}
	/**
	 * Hier wird ueberprueft, ob ein Angriff kritisch getroffen hat.
	 * @return
	 */
	private boolean kritisch(){
		double rz = rand.nextDouble();
		if (rz > KritischerTreffer ){
			return false;
		}
		return true;
	}
}
