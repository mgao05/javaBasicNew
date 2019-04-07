package com.company.vehicle;


public class Bicycle extends Bike {

    int pedalNum;

    public void test(){

    }
    public static void isStatic(){

    }

    public Bicycle(String wheel, int numOfWheel, String shapeOfSeat, int numOfPedal) {
        super(wheel, numOfWheel, shapeOfSeat);
        pedalNum = numOfPedal;
        System.out.println("number of pedal is "+ pedalNum +".");
//        Bicycle.isStatic();
    }

}