package com.Atm_Machine;

import java.util.Scanner;

public class Deposit_Funds {

    protected void deposit_funds() {

        View_Balance View_Bal_obj = new View_Balance();

        Scanner scan = new Scanner(System.in);

        System.out.print("How much amount you want to deposit :- ");
        double deposit = scan.nextDouble();

        View_Bal_obj.balance += deposit;

        System.out.print("Current balance of your account :- " + View_Bal_obj.balance);
    }
}
