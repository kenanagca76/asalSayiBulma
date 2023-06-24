package odevler;

import java.util.Scanner;

public class asalSayiBulma {
// Senaryo
//Sayı Giriniz : 22
//22 sayısı ASAL değildir !

//Sayı Giriniz : 2
//2 sayısı ASALDIR !

//Sayı Giriniz : 39
//39 sayısı ASAL değildir !

//Sayı Giriniz : 17
//17 sayısı ASALDIR !
public static boolean isPrime(int sayi, int bolen){ // isPrime= asal mı ?  :)
    if (sayi < 2) {
        return false;
    }
    if (sayi == 2){
        return true;
    }
    if (sayi % bolen == 0) {
        return false;
    }
    if (bolen * bolen > sayi){
        return true;
    }
    return isPrime(sayi, bolen +1);
}

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz :");
        int sayi = inp.nextInt();

        if (isPrime(sayi,2)){
            System.out.println(sayi + " sayısı ASAL bir sayıdır.");
        } else {
            System.out.println(sayi + " sayısı ASAL bir sayı DEĞİLDİR.");
        }

    }
}
