package Lesson7;

public class UnknownAccountException extends RuntimeException{
    public UnknownAccountException(String message) {
        super("Неизвестный аккаунт");
    }
}
