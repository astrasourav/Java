package com.Atm_Machine;

import java.util.Scanner;

public class Saving_Withdraw {

    protected void sav_with() {

        Saving_Balance obj = new Saving_Balance();

        Scanner scan = new Scanner(System.in);

        System.out.print("How much you want to withdraw :- ");

        double withdraw = scan.nextDouble();
        obj.saving -= withdraw;

        System.out.print("Current balance of your account :- " + obj.saving);

    }
}
