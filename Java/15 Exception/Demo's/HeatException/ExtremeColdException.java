 package HeatException;

public class ExtremeColdException extends Exception{
	public ExtremeColdException() {
		super();
	}
	public ExtremeColdException(String message) {
		super(message);
	}
	public ExtremeColdException(String message, Throwable cause) {
		super(message,cause);
	}
	public ExtremeColdException(Throwable cause) {
		super(cause);
	}
}
