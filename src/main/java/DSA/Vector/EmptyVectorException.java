package DSA.Vector;

@SuppressWarnings("serial")
public class EmptyVectorException extends RuntimeException {
	private String msg = "Sorry Boss Your Vector is Empty";
	
	EmptyVectorException(){}
	EmptyVectorException(String msg){this.msg = msg;}
	
	public String toString() {
		return getClass().getName()+":"+msg;
	}

}
