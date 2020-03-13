package co.edu.unac;

public class ValueException extends Exception {


    private String message;

    public ValueException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
