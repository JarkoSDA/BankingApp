package org.example;

public class Account {
    private String name;
    private String lastName;
    private String pesel;
    private String login;
    private String acconutNumber;
    private double balance;
    private int pin;


    Account(String name, String lastName, String pesel, String login, String acconutNumber, double balance, int pin) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.login = login;
        this.acconutNumber = acconutNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getLogin() {
        return login;
    }

    public int getPin() {
        return pin;
    }

    public String getAcconutNumber() {
        return acconutNumber;
    }

    public double withdraw(double cashToGet) {
        return balance = balance - cashToGet;
    }

    public double getBalance() {
        return balance;
    }
    public double deposite(double moneyToDeposite){
        return balance = balance + moneyToDeposite;
    }
    public double credit (double moneyToBorrow){

        double check = balance * 0.1;
        if (check > moneyToBorrow){
            return balance += moneyToBorrow;
        } else {
            System.out.println("nara biedaku");
            return balance;
        }

    }
}
