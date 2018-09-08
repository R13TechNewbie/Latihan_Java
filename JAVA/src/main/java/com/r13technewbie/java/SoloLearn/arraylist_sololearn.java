package com.r13technewbie.java.SoloLearn;

import java.util.ArrayList;

class arraylist_sololearn {

    public static void main (String[] args){
        ArrayList<String> warna = new ArrayList<>(1);
        warna.add("kuning");
        warna.add("hijau");
        warna.add("orange");
        System.out.println(warna);
        System.out.println(warna.size());
        warna.remove("kuning");
        System.out.println(warna.size());
        System.out.println(warna);
        System.out.println(warna.get(1));
        System.out.println(warna.contains("orange"));
        warna.clear();
        System.out.println(warna);
    }

}


