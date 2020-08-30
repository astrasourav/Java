package com.Atm_Machine;

import java.util.Scanner;

public class Choice {

    protected void choice() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Select the account you want to access:- \n");
        System.out.print("Type 1:- Checking Account:- \n");
        System.out.print("Type 2:- Saving Account:- \n");
        System.out.print("Type 3:- Exit\n");

        System.out.print("Enter your choice :- ");
        int a = scan.nextInt();

        Checking_Acc obj = new Checking_Acc();
        Saving_Acc sav_obj = new Saving_Acc();

        switch (a) {
            case 1 -> obj.check_acc();
            case 2 -> sav_obj.sav_acc();
            case 3 -> System.exit(0);
            default -> System.out.println("Invalid Input");

        }
    }
}
