package Lesson7;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(String message) {
        super("Недостаточно средств на счете");
    }
}
