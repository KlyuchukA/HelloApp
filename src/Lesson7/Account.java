package Lesson7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

//public class Account implements Serializable {
public class Account  {
    public Integer accountId;
    public String holder;
    public Double amount;

    public Account(int accountId, String holder, double amount) {
        this.accountId = accountId;
        this.holder = holder;
        this.amount = amount;
    }

    public Account(String s, int parseInt, String s1, double parseDouble) {
    }

    public int getAccount(){
        return accountId;
    }
    public String getHolder(){
        return holder;
    }
    public double getAmount(){
        return amount;
    }
}


