package exception;

public class ObjectCreationException extends RuntimeException{

    public ObjectCreationException(String message) {
        System.out.println("Exception occured" + message);
    }

}
