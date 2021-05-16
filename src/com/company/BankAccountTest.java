package com.company;

import java.util.Locale;
import java.util.Scanner;

class BankAccount {
    private int _accountNumber;
    private String _owner;
    private double _balance;

    public int getAccountNumber() {
        return _accountNumber;
    }

    public String getOwner() {
        return _owner;
    }


    public BankAccount(int accountNumber, String owner, double balance) {
        this._accountNumber = accountNumber;
        this._owner = owner;

        if (balance >= 0.0) {
            this._balance = balance;
        }
    }

    public void setOperation(String operation , double amount) {
        switch (operation) {
            case "Withdraw":
                _balance = _balance - amount;
                break;
            case "Deposit":
                _balance = _balance + amount;
                break;
            default:
                System.out.println("Nothing Entered");
        }
    }
    public double getBalance(){
        return _balance;
    }
}

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(10801, "Vishal", 50.07);
        BankAccount obj2 = new BankAccount(10802, "Megha", 0.0);

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Bank..");
        System.out.println(obj1.getAccountNumber());
        System.out.println(obj2.getAccountNumber());
        System.out.println("Enter Account Number : ");
        int accNum = s.nextInt();

        if(accNum==10801){

            System.out.println("What to do : Withdraw or Deposit ");
            String operation = s.next();

            System.out.println("Enter Amount : ");
            double amount = s.nextDouble();
            obj1.setOperation(operation,amount);

            System.out.printf("%s amount to %s \n", operation,obj1.getOwner());
            System.out.println(obj1.getBalance());
        }
        else if(accNum==10802) {
            System.out.println("What to do : Withdraw or Deposit ");
            String operation1 = s.next();

            System.out.println("Enter Amount : ");
            double amount1 = s.nextDouble();
            obj2.setOperation(operation1, amount1);

            System.out.printf("%s amount to %s \n", operation1, obj2.getOwner());
            System.out.println(obj2.getBalance());
        }
        else {
            System.out.println("Entered Wrong Account Number! ");
        }
    }
}
