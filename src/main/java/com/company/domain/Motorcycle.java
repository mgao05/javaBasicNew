package com.company.domain;

import com.company.domain.Bike;

public class Motorcycle extends Bike {

    int pedalNum;
    int gasTank;
    int motor;
    public Motorcycle(String wheel, int numOfWheel, String shapeOfSeat, int numOfPedal, int numOfGasTank, int numOfMotor) {

        super(wheel, numOfWheel, shapeOfSeat);
        pedalNum = numOfPedal;
        gasTank = numOfGasTank;
        motor = numOfMotor;
        System.out.println("number of pedal is " + pedalNum + ", number of gas tank is " +
                gasTank + ", number of motor is " + motor + ".");
    }

}