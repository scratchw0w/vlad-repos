package project.exception;

public class BookIsNotInLibraryException extends RuntimeException {
    public BookIsNotInLibraryException(String message) {
        super(message);
    }
}
