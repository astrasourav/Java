package com.Atm_Machine;

import java.util.Scanner;

public class Checking_Acc {

    protected void check_acc() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Checking Account:- ");
        System.out.println("Type 1:- View Balance:- ");
        System.out.println("Type 2:- Withdraw Funds:- ");
        System.out.println("Type 3:- Deposit Funds:- ");
        System.out.println("Type 4:- Exit");

        System.out.print("Enter your choice :- ");
        int inp = scan.nextInt();

        View_Balance view_obj = new View_Balance();
        Withdraw_Balance_Funds with_bal_obj = new Withdraw_Balance_Funds();
        Deposit_Funds dep_fun_obj = new Deposit_Funds();

        switch (inp) {
            case 1 -> view_obj.view_bal();
            case 2 -> with_bal_obj.withdraw_bal();
            case 3 -> dep_fun_obj.deposit_funds();
            case 4 -> System.exit(0);
            default -> System.out.println("Invalid Input");

        }
    }
}
