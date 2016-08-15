package vagas.com.exceptions;

public class InvalideRowException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5442554817794678681L;
	
	public InvalideRowException(String msg){
		super(msg);
	}
	
	public InvalideRowException (){
		super("This row is invalid.");
	}
	

}
