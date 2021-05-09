package by.epamtc.exception;

public class NoSuchPlaneException extends Exception {
    public NoSuchPlaneException() {
    }

    public NoSuchPlaneException(String message) {
        super(message);
    }

    public NoSuchPlaneException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPlaneException(Throwable cause) {
        super(cause);
    }
}
