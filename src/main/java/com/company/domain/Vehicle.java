package com.company.domain;



//public abstract class Vehicle {
//    abstract void drive();
//    void register(int plate){ };
//
//}
public abstract class Vehicle implements com.company.repository.Vehicle{
    public void drive() {
        return;
    }

    public boolean register(int plate) {
        if(plate != 0){
        return true;}
        else return false;

    }
}