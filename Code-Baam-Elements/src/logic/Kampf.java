package logic;
import data.AvatarStaerke;;

public class Kampf {
	private Avatar Avatar_1;
	private Avatar Avatar_2;
	private Avatar StarkerAvatar;
	private AvatarStaerke as;
	
	public Kampf(Avatar Avatar_1, Avatar Avatar_2){
		this.Avatar_1 = Avatar_1;
		this.Avatar_2 = Avatar_2;
		as = new AvatarStaerke(Avatar_1, Avatar_2);
		StarkerAvatar = as.Staerkenvergleich();
		
		
	}
	public void kaempfen(){
		
		double zw = Avatar_1.AngreifenAufrufen();
		if(Avatar_1 == StarkerAvatar){
			zw = zw * 1.2;
			Avatar_2.WenigerLebenspunkte(zw);
		}
		if (gestorben(Avatar_2) == true){
			gewonnen();
			
		}
		zw = Avatar_2.AngreifenAufrufen();
		if(Avatar_2 == StarkerAvatar){
			zw = zw * 1.2;
			Avatar_1.WenigerLebenspunkte(zw);
		}
		if (gestorben(Avatar_1) == true){
			verloren();
			
		}
		
	}
	private boolean gestorben(Avatar avatar){

		if (avatar.getLebenspunkte() <= 1){
			return true;
		}
		return false;
	}
	private void gewonnen(){
		System.out.println("Yaay, you won!");
	}
	private void verloren(){
		System.out.println("Awww, you lost!");
	}
}
