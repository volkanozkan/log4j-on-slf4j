package first;

public class CustomException extends Exception {

	private static final long serialVersionUID = -9215110350618429926L;

	public CustomException(String message) {
		super(message);
	}

	public CustomException(String message, Throwable throwable) {
		super(message, throwable);
	}

}