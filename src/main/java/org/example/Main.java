package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1=new Account("Adam", "Adamek", "123456789" "AdAd","987654321", 1000000, 1234);
        Scanner sc=new Scanner(System.in)


        System.out.println("Witamy w naszym banku");
        Scanner sc=new Scanner(System.in)
        System.out.println("Uzytkowniku wpisz login" );
        String login=sc.next();
        if(login.equals(account1.getLogin())){
            System.out.println("Login poprawny");
        } else {
            System.out.println("Login z dupy");
        }
        System.out.println("podaj kod PIN");
        int pin=sc.nextInt();




    }

}