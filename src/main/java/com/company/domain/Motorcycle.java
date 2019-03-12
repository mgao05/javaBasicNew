package com.company.domain;

import com.company.domain.Bike;

public class Motorcycle {

    int pedalNum;
    int gasTank;
    int motor;
    public void Motorcycle(String wheel, int numOfWheel, String shapeOfSeat, int numOfPedal, int numOfGasTank, int numOfMotor) {

   // super(numOfWheel, shapeOfSeat, numOfPedal,numOfGasTank,numOfGasTank);
        //wheelNum = numOfWheel;
        gasTank = numOfGasTank;
        motor = numOfMotor;
        System.out.println("number of pedal is " + pedalNum + ", number of gas tank is " +
                gasTank + ", number of motor is " + motor + ".");
    }

}