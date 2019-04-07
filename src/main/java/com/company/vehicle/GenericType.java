package com.company.vehicle;

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {

        Test<Integer> iObj = new Test<Integer>(15);
        Test<String> sObj = new Test<String>("MouiMoui");
        Test<Double> dObj = new Test<Double>(5.55);
        System.out.println(iObj.getObject());
    }
}