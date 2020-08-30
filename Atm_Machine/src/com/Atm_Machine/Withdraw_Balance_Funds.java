package com.Atm_Machine;

import java.util.Scanner;

public class Withdraw_Balance_Funds {

    protected void withdraw_bal() {

        View_Balance view_obj = new View_Balance();

        Scanner scan = new Scanner(System.in);

        System.out.print("How much you want to withdraw :- ");
        double withdraw = scan.nextDouble();

        view_obj.balance -= withdraw;

        System.out.print("Current balance of your account :- " + view_obj.balance);

    }
}
