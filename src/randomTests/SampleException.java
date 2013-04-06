package randomTests;

import java.io.IOException;

public class SampleException extends Exception {

	private static final long serialVersionUID = 1L;
	private String superficialMessage;
	
	public SampleException(){
		super();
	}
	
	public void setSuperficialMessage(String s){
		this.superficialMessage = s;
	}
	
	public String getMessage(){
		return this.superficialMessage;
	}
}
