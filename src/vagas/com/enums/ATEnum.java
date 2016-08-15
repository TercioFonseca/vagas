package vagas.com.enums;

import java.math.BigDecimal;

public enum ATEnum {
	
	Silver(new BigDecimal(17)),
	Gold(new BigDecimal(14.450)),
	Iron(new BigDecimal(195.5));
	
	private BigDecimal at;
	
	ATEnum(BigDecimal at){
		
		this.at = at;
	}

}
