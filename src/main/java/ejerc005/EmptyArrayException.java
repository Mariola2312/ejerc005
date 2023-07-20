package ejerc005;

public class EmptyArrayException extends RuntimeException{

	private static final long serialVersionUID = -3426278829410529890L;

	public EmptyArrayException() {
		super();
	}

	public EmptyArrayException(String message, Throwable cause) {
		super(message, cause);
	}
}
