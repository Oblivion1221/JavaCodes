public class TimeFormatException extends Exception {
    public TimeFormatException() {
        super("That is not a valid time");
    }

    public TimeFormatException(String s) {
        super(s);
    }
}
