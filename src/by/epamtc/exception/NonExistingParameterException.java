package by.epamtc.exception;

public class NonExistingParameterException extends Exception {
    public NonExistingParameterException() {
    }

    public NonExistingParameterException(String message) {
        super(message);
    }

    public NonExistingParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonExistingParameterException(Throwable cause) {
        super(cause);
    }
}
