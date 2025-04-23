package utils;

public class CustomExceptions {
    public static class InvalidMarksException extends Exception {
        public InvalidMarksException(String message) {
            super(message);
        }
    }

    public static class DuplicateRollNoException extends Exception {
        public DuplicateRollNoException(String message) {
            super(message);
        }
    }
}
