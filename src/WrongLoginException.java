public class WrongLoginException extends Exception {
    private final String text;

    public WrongLoginException() {
        text = "Неверный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        text = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + text;
    }
}