package App;

public class MyArrayDataException {
    public class MyArrayDataException extends RuntimeException {
        public MyArrayDataException(String message) {
            super("Некорректные данные "+message);
        }
}
}