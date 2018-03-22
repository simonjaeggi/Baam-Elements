package logic;

public class Schlag implements Angriffsverhalten{
	private double KritischerTreffer;
	private double Verfehlen;
	private double Schaden;
	@Override
	public double angreifen() {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean verfehlen(){
		return true;
	}
	private boolean kritisch(){
		return true;
	}
}
