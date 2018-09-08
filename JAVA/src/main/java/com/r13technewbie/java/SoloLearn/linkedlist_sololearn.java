package com.r13technewbie.java.SoloLearn;

import java.util.LinkedList;

class linkedlist_sololearn {

    public static void main (String[] args) {

        LinkedList<String> unik = new LinkedList<>();
        unik.add("a");
        unik.add("b");
        unik.add("c");
        unik.add("a");
        unik.add("b");
        unik.remove("b");
        unik.add("d");
        System.out.println(unik.get(1));
        System.out.println(unik.contains("c"));
        System.out.println(unik);
        unik.clear();
        System.out.println(unik);
    }

}
