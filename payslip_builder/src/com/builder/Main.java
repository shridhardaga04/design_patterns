package com.builder;

public class Main {
    public static void main(String[] args) {
        PaySlip entry = new PaySlip.Builder()
                .setBasic(10000)
                .setHomeRentAllowance(1100)
                .setTravelAllowance(800)
                .build();

        PaySlip experienced = new PaySlip.Builder()
                .setBasic(100000)
                .setLunchAllowance(6100)
                .setMedicalAllowance(28000)
                .setHomeRentAllowance(5000)
                .build();

        System.out.println(entry);
        System.out.println(experienced);
    }
}