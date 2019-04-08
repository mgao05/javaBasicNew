package com.company.collection;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static Comparator<User> SalaryComparator = new Comparator<User>() {
        //sort by salary
       // @Override
        //todo why no override here
        public int compare(User o1, User o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    };
    public static Comparator<User> AgeComparator = new Comparator<User>() {
        public int compare(User o1, User o2) {
            return (int) (o1.getAge() - o2.getAge());
        }
    };

    public static Comparator<User> NameComparator = new Comparator<User>() {
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static void main(String[] args){
        User[] userArray = new User[5];
        userArray[0] = new User(1, "lily", 20, 20000);
        userArray[1] = new User(3, "limie", 35, 3000);
        userArray[2] = new User(4, "neil", 30, 50000);
        userArray[3] = new User(60, "luna", 24, 4000);
        userArray[4] = new User(10, "mario", 4, 2500);

        //array sorting using comparable interface
        //only one comparable at a time, it is defined in user , compareTo
        Arrays.sort(userArray);
        System.out.println("Default Sorting of Users list: \n" + Arrays.toString(userArray));

        //sort by salary using pre-defined salary comparator
        Arrays.sort(userArray, SalaryComparator);
        System.out.println("User sorted by salary: \n" + Arrays.toString(userArray));

        //sort by age using pre-defined age comparator
        Arrays.sort(userArray, AgeComparator);
        System.out.println("User sorted by age: \n" + Arrays.toString(userArray));

        //sort by name
        Arrays.sort(userArray, NameComparator);
        System.out.println("Users sort by name: \n" + Arrays.toString(userArray));


    }


}
