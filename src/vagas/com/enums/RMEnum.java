package vagas.com.enums;



public enum RMEnum {

	I(1),
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1000);
	
	private int Rm;
	
	RMEnum(int rm){
		this.Rm = rm;
	}
	
	public int getRM(){
		return this.Rm;
	}
	
}
