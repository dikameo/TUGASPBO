package com.example;

public class Bond extends CheckingAccount{
    // membuat kelas saving bond 1 - 60 bulan
    // setiap penambahan bulan ada penambahan bunga
    // pakai switch case

public void setTermAndRate(int pil, int bulan){
    double rate;
    switch (pil) {
        case 1:
        rate = 0.005;
        earnInterest(rate, bulan);
        break;
        case 2:
        rate = 0.01;
        earnInterest(rate, bulan);
        break;
        case 3:
        rate = 0.015;
        earnInterest(rate, bulan);
        break;
        case 4:
        rate = 0.015;
        earnInterest(rate, bulan);
        break;
        case 5:
        rate = 0.02;
        earnInterest(rate, bulan);
        break;
    
        default:
            break;
    }
    }
    
}
