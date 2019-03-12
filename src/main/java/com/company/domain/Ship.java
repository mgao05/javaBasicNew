package com.company.domain;

//public abstract class Ship {
//    abstract void license();
//    void owner(){};
//    abstract class SmallShip{};
//    abstract class BigShip{};
//
//}

public abstract class Ship implements com.company.repository.Ship{
    public void floatRiver() {
        System.out.println("floating things");
    }
}