package logic;
/**
 * 
 * @author Simon Jäggi, Lukas Reinhardt
 * @version 0.1
 * Oberklasse für die einzelnen Avatare, vereint alle gemeinsamen Attribute.
 */
public class Avatar{
	private double Lebenspunkte;
	private Angriffsverhalten angriff;

	public void WenigerLebenspunkte(double zw){
		Lebenspunkte = Lebenspunkte - zw;
	}
	protected void setLebenspunkte(double Lp){
		this.Lebenspunkte = Lebenspunkte;
	}
	public double getLebenspunkte(){
		return Lebenspunkte;
	}
	public double AngreifenAufrufen(){
		angriff = new Schlag();
		double zw = angriff.angreifen();
		return zw;
	}
}
