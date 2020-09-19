package Lesson7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

//public class Account implements Serializable {
public class Account  {
    public int accountId;
    public String holder;
    public int amount;

    public Account(int accountId, String holder, int amount) {
        this.accountId = accountId;
        this.holder = holder;
        this.amount = amount;
    }

    public int getAccount(){
        return accountId;
    }
    public String getHolder(){
        return holder;
    }
    public int getAmount(){
        return amount;
    }
//    дать полю amount новое значение
    public void  setAmount(int amount){
        this.amount = amount;
   }
    public void print(){
        System.out.println(accountId + " " + holder + " " + amount);
    }
}


