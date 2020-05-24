package challenge;

public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFound(String message) {
        super(message);
    }

    public ResourceNotFound(Throwable cause) {
        super(cause);
    }

    public ResourceNotFound() {
        super();
    }
}
