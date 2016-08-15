package vagas.com.exceptions;

public class MaxLengthRepeatedException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MaxLengthRepeatedException(String msg){
		super(msg);
	}
	
	public MaxLengthRepeatedException (){
		super("Repeated quantity bigger then allowed.");
	}
	

}
