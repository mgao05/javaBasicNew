package com.company.domain;


import com.company.repository.Ship;
import com.company.repository.Vehicle;

public class Bike implements Vehicle, Ship {

//  String wheelShape;
//    int wheelNum;
//    String seatShape;
//
//    public Bike(String wheel, int numOfWheel, String shapeOfSeat) {
//        wheelShape = wheel;
//        wheelNum = numOfWheel;
//        seatShape = shapeOfSeat;
//        System.out.println("shape of the wheel is " + wheelShape + ",  number of wheel is " + wheelNum + ",  " +
//                "shape of seat is " + seatShape + ".");


    public boolean register() {
        return false;
    }

    public void drive() {

    }

    private String wheelShape = "round";

    protected Integer wheelNum = 2;

    public Bike(String wheel, int numOfWheel, String shapeOfSeat) {

    }
    public void Motorcycle(String wheel, int numOfWheel, String shapeOfSeat, int numOfPedal, int numOfGasTank, int numOfMotor) {

    }

    public void move(){System.out.println("1 mile per hour");}

    public Integer getWheelNum(){return wheelNum;}

    public String getWheelShape(){return wheelShape;}

    public void getSeatType(){
        new UnsupportedOperationException("No implementation found!");
    }

    public void floatRiver(){
        System.out.println("float on river!");
        return;
    }
    }