package vagas.com.exceptions;

public class InvalidSymbolException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5508606296783784997L;

	public InvalidSymbolException(String msg){
		super(msg);
	}
	
	public InvalidSymbolException (){
		super("There is invalid symbols.");
	}
	
}
