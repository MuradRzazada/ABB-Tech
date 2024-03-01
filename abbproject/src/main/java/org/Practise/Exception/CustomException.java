package org.Practise.Exception;

public class CustomException extends ArrayIndexOutOfBoundsException {
    String message;

    public String getMessage() {
        return "Message";
    }
}