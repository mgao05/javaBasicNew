package com.company.vehicle;



//public abstract class Vehicle {
//    abstract void drive();
//    void register(int plate){ };
//
//}
public abstract class Vehicle implements com.company.interfaces.Vehicle{
    public void drive() {
        return;
    }

    public boolean register(int plate) {
        if(plate != 0){
        return true;}
        else return false;

    }
}