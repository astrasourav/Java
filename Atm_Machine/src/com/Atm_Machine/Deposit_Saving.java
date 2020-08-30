package com.Atm_Machine;

import java.util.Scanner;

public class Deposit_Saving {

    protected void deposit_sav() {

        Saving_Balance obj = new Saving_Balance();

        Scanner scan = new Scanner(System.in);
        System.out.print("How much amount you want to deposit :- ");

        double deposit = scan.nextDouble();
        obj.saving += deposit;

        System.out.print("Current balance of your account :- " + obj.saving);

    }
}
