package logic;
/**
 * 
 * @author Simon Jaeggi, Lukas Reinhardt
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
	 * Setzt lokale Variable "Lebenspunkte" auf den mitgelieferten Wert 
	 * @param Lp
	 * 
	 */
	protected void setLebenspunkte(double Lp){
		this.Lebenspunkte = Lp;
	}
	/**
	 * Gibt den Wert der lokalen Variable Lebenspunkte zurück
	 * @return
	 */
	public double getLebenspunkte(){
		return Lebenspunkte;
	}
	/**
	 * Diese Methode wird verwendet um die jeweilige Attacke aufzurufen. Da wir nur einen Angriff haben, ist das ganze statisch programmiert.
	 * @return
	 */
	public double AngreifenAufrufen(){
		angriff = new Schlag();
		double zw = angriff.angreifen();
		return zw;
	}
}
