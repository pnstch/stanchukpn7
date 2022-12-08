public class WrongPasswordException extends Exception{
    private final String text;

    public WrongPasswordException() {
        text = "Неверный пароль";
    }

    public WrongPasswordException(String message) {
        super(message);
        text = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: "+text;
    }
}