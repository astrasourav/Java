package com.Atm_Machine;

import java.util.Scanner;

public class Saving_Acc {

    protected void sav_acc() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Checking Account:- ");
        System.out.println("Type 1:- View Saving Balance:- ");
        System.out.println("Type 2:- Withdraw Saving Funds:- ");
        System.out.println("Type 3:- Deposit Funds in Saving Account:- ");
        System.out.println("Type 4:- Exit");

        System.out.print("Enter your choice :- ");
        int inp = scan.nextInt();

        Saving_Acc sav_bal_obj = new Saving_Acc();
//
        switch (inp) {
            case 1 -> sav_bal_obj.sav_acc();
//            case 2 -> obj5.Saving_Withdraw();
//            case 3 -> obj5.Deposit_Saving_Funds();
//            case 4 -> System.exit(0);
//            default -> System.out.println("Invalid Input");
        }
    }
}
