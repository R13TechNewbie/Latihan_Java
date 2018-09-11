package com.r13technewbie.java.SoloLearn;

import java.util.HashMap;

class hashmap_sololearn {

    public static void main (String[] args) {

        HashMap<String, Integer> objek = new HashMap<>();
        objek.put("ayam",1);
        System.out.println(objek.get("ayam"));
        System.out.println(objek.get(1));
        HashMap<Integer, String> objek2 = new HashMap<>();
        objek2.put(1, "kambing");
        System.out.println(objek2.get(1));
        System.out.println(objek2.get("kambing"));
        objek2.put(1, "kucing");
        System.out.println(objek2.get(1));

    }

}
