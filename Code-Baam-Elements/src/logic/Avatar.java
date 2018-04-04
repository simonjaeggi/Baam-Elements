package logic;
/**
 * 
 * @author Simon Jäggi, Lukas Reinhardt
 * Oberklasse fuer die einzelnen Avatare, vereint alle gemeinsamen Attribute.
 */
public class Avatar{
	private double Lebenspunkte;
	private Angriffsverhalten angriff;
	
	/**
	 * 
	 * @param zw
	 * Zieht den mitgelieferten Wert von den lokalen Lebenspunkten ab.
	 */
	public void WenigerLebenspunkte(double zw){
		Lebenspunkte = Lebenspunkte - zw;
	}
	
	/**
	 * 
	 * @param Lp
	 * 
	 */
	protected void setLebenspunkte(double Lp){
		this.Lebenspunkte = Lp;
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
