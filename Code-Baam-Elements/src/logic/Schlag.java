package logic;
import java.util.Random;

/**
 * 
 * @author Simon Jäggi, Lukas Reinhardt
 * @version 0.1
 */
public class Schlag implements Angriffsverhalten{
	private double KritischerTreffer;
	private double Verfehlen;
	private double Schaden = 15;
	private Random rand = new Random();

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

	private boolean verfehlen(){

		double rz = rand.nextDouble();
		if (rz > Verfehlen ){
			return false;
		}
		return true;
	}
	private boolean kritisch(){
		double rz = rand.nextDouble();
		if (rz > KritischerTreffer ){
			return false;
		}
		return true;
	}
}
