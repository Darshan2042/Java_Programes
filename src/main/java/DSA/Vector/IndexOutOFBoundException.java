package DSA.Vector;

@SuppressWarnings("serial")
public class IndexOutOFBoundException extends RuntimeException{
	private String msg = "Check your index.....";
	
	IndexOutOFBoundException(){}
	IndexOutOFBoundException(String msg){this.msg = msg;}
	
	public String toString() {
		return getClass().getName()+":"+msg;
	}

}
