package com.company;

import java.util.Scanner;

public class Main {
    static int usbulma(int sayi, int us){
        if(us < 1){
            return 1;
        }
        else{
            return sayi * usbulma(sayi,us-1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, us;

        System.out.print("Taban giriniz: ");
        sayi = int.nextInt();
        System.out.print("Üs giriniz: ");
        us = int.nextInt();

        System.out.println("Sonuc:" +usbulma(sayi,us));
    }
}
