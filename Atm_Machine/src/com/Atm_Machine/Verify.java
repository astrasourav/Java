package com.Atm_Machine;

import java.util.Scanner;

public class Verify {

    final long Cust_Number = 181117106025L;
    final long Cust_Pin = 9811398861L;

    protected void verify() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you Number:- ");
        long inp_num = scan.nextLong();
        System.out.print("Enter your Pin:- ");
        long inp_pin = scan.nextLong();

        if (inp_num == Cust_Number && inp_pin == Cust_Pin) {
            System.out.print("Welcome Sourav\n");
            Choice obj = new Choice();
            obj.choice();
        } else {
            System.out.println("Wrong Credentials");
        }
    }
}
