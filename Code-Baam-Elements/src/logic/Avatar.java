package logic;

public class Avatar{
	private double Lebenspunkte;
	private Angriffsverhalten angriff;

	public void WenigerLebenspunkte(){

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
