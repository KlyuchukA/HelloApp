package Lesson7;

public interface AccountService {

     void balance(int accountId) throws UnknownAccountException;

     void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

     void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

}
