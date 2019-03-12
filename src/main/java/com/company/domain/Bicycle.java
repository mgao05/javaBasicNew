package com.company.domain;


public class Bicycle extends Bike {

    int pedalNum;

    public Bicycle(String wheel, int numOfWheel, String shapeOfSeat, int numOfPedal) {
        super(wheel, numOfWheel, shapeOfSeat);
        pedalNum = numOfPedal;
        System.out.println("number of pedal is "+ pedalNum +".");
    }

}