package com.r13technewbie.java.Project_Bulanan1;

import java.util.Scanner;

class Main {

    public static void main (String[] args) {

        wrap(60);
        System.out.println("Selamat Datang");
        System.out.println("Selamat Datang");
        System.out.println("Selamat Datang");
        System.out.println("Selamat Datang");
        wrap(60);

        menu();

        Scanner input = new Scanner(System.in);

        int data = input.nextInt();

        proses(data);



    }

    private static void wrap(int x){

        for (int i=1;i<=x;i++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }

    private static void menu(){

        System.out.println("\n APLIKASI HEWAN");
        wrap(20);
        System.out.println(" 1. Ayam");
        System.out.println(" 2. Sapi");
        System.out.println(" 3. Kambing");
        System.out.print("Masukkan Pilihan (1/2/3):");

    }

    private static void ayam(){

        System.out.print("ayam");

    }

    private static void sapi(){

        System.out.print("sapi");

    }

    private static void kambing(){

        System.out.print("kambing");

    }

    private static void proses(int data){

        if (data == 1) {
            ayam();
        }
        else if (data == 2) {
            sapi();
        }
        else if (data == 3) {
            kambing();
        }
        else {
            System.out.print("input salah, coba masukkan ulang");
        }
    }
}

