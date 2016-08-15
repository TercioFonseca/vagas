package vagas.com.enums;

public enum GMEnum {

	glob(1),
	prok(5),
	pish(10),
	tegj(50);
	
		
	private int money;
	
	GMEnum(int money){
	this.money = money;
	}
	
	public int getMoney(){
		return this.money;
	}
	
}
