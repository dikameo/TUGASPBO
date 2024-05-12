package com.example;

import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {

        System.out.println("bisa");
        Bond nasabah = new Bond();
        nasabah.setNama("Budi");
        nasabah.setBalance(1000000);
        nasabah.displayAccount();
    


        System.out.println("Pilih Angsuran yang anda pilih");
        System.out.println("1. 0 - 11 bulan bungan angsuran 0.5%");
        System.out.println("2. 12 - 23 bulan bungan angsuran 1%");
        System.out.println("3. 24 - 35 bulan bungan angsuran 1,5%");
        System.out.println("4. 36-47 bulan bungan angsuran 2,0%");
        System.out.println("5. 48-60 bulan bungan angsuran 2,5%");
        System.out.print("Pilihan anda :");
        Scanner input = new Scanner(System.in);
        int pil = input.nextInt();
        System.out.print("Berapa bulan : ");
        int bulan = input.nextInt();
        nasabah.setTermAndRate(pil,bulan);
        nasabah.displayAccount();

        input.close();
        

        // nasabah.interest(10, 2);
        // nasabah.displayAccount();
        // System.out.println( nasabah.interest(10, 1));

        // nasabah.deposit(500000);
        // nasabah.displayAccount();
        // nasabah.withdraw(1000);
        // nasabah.displayAccount();
        // nasabah.withdraw(1000);
        // nasabah.displayAccount();
        // nasabah.withdraw(100000000);
        // nasabah.displayAccount();



        // CheckingAccount
        // System.out.println(nasabah.getBalance());
    }


}