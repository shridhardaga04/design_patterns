package com.singleton;

public class Main {
    public static void main(String[] args) {

        CacheSingleton ref = CacheSingleton.getInstance();
        ref.setInfo("name", "Shridhar");
        ref.setInfo("Gender", "Male");
        ref.setInfo("City", "Solapur");

        System.out.println(ref.getInfo("name"));

    }
}