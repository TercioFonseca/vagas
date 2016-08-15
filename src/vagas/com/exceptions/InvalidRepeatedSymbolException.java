package vagas.com.exceptions;

public class InvalidRepeatedSymbolException extends RuntimeException {
	
	
	public InvalidRepeatedSymbolException(String msg){
		super(msg);
	}
	
	public InvalidRepeatedSymbolException (){
		super("Repeated symbol not is allowed.");
	}
	

}
