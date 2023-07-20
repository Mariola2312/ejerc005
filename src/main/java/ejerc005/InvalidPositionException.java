package ejerc005;

public class InvalidPositionException extends RuntimeException{

	private static final long serialVersionUID = 8270231657590755362L;

	public InvalidPositionException() {
		super();
	}

	public InvalidPositionException(String message, Throwable cause) {
		super(message, cause);
	}
}
