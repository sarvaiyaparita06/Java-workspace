package September032022;

@SuppressWarnings("serial")
public class InsufficientFunds extends RuntimeException 
{ 
	private String message; 
	public InsufficientFunds(String message) 
	{ 
		this.message = message; 
	} 
	public InsufficientFunds(Throwable cause, String message) 
	{ 
		super(cause); this.message = message; 
	} 
	public String getMessage() 
	{ 
		return message; 
	} 
}

