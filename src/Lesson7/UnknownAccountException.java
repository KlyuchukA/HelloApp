package Lesson7;

public class UnknownAccountException extends RuntimeException{
    public UnknownAccountException() {
        super("Неизвестный аккаунт");
    }
}
