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
		
		kaempfen();
	}
	private void kaempfen(){
		
		double zw = Avatar_1.AngreifenAufrufen();
		
	}
	private boolean gestorben(Avatar avatar){
		return true;
	}
	private void gewonnen(){

	}
	private void verloren(){

	}
}
