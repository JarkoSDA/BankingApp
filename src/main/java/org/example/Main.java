package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1=new Account("Adam", "Adamek", "123456789", "AdAd","987654321", 1000000, 1234);
        Scanner sc=new Scanner(System.in);


        System.out.println("Witamy w naszym banku");
        System.out.println("Uzytkowniku wpisz login" );
        String login=sc.next();
        if(login.equals(account1.getLogin())){
            System.out.println("Login poprawny");
        } else {
            System.out.println("Login z dupy");
        }
        System.out.println("podaj kod PIN");
        int pin=sc.nextInt();
        if (pin==account1.getPin())


        System.out.println("MENU - wybierz numerycznie operacje która Cię interesuje");
        System.out.println( "\n 1. Wpłata  \n 2. Wypłata  \n 3. Sprawdzenie salda \n 4. Kredyt \n 5. Wyjście");
        System.out.println("Twoj wybor");
        int wybor=sc.nextInt();
        switch (wybor){
            case 1:
                System.out.println("Wpłata gotówki");
                break;
            case 2:
                System.out.println("WYpłata gotówki");
                double wyplata = sc.nextDouble();
                account1.withdraw(wyplata);

                break;
            case 3:
                System.out.println("Sprawdzanie salda");
                System.out.println(account1.getBalance());
                break;
            case 4:
                System.out.println("kredyt");
                break;
            case 5:
                System.out.println("wyjście");
        }





    }

}