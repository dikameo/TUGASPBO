package com.example;

public class CheckingAccount {
    private String nama;
    private double balance;

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public double setBalance(double balance){
        return this.balance = balance;
    }

    public String getNama(){
        return this.nama;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double uang){
        setBalance(getBalance()+uang);
    }

    public void withdraw(double uang){
        if (uang <= 0) {
            System.out.println("Penarikan tidak boleh negatif");
        }else if(getBalance()>= uang){
            System.out.println("Berhasil ditarik");
            this.balance -= uang;
        }else if(uang > getBalance()){
            System.out.println("Penarikan tidak boleh melebihi uang anda");
        }
    }


    // EXERCISE 4 bunga
    public double earnInterest(double rate, double bulan){
        return setBalance(this.balance += this.balance * rate / 12 * bulan);
    }


    public void displayAccount(){
        System.out.println("Nama :"+getNama());
        System.out.println("Balance :"+getBalance());
    }
}
