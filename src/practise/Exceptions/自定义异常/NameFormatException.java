package practise.Exceptions.自定义异常;

public class NameFormatException extends RuntimeException{
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
