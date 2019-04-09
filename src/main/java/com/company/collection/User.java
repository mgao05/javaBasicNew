package com.company.collection;

public class User implements Comparable<User> {
    private int id;
    private String name;
    private int age;
    private int salary;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public User(int id, String name, int age, int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //@Override
    //implement comparable, this case it is id, we can write more, salary, name
//    public int compareTo(User user){
//        return (this.id - user.id);
//    }
//
//
//    public int compareTo(User user){
//        return (this.salary.compareTo(user.salary));
//    }
//
//    public int compareTo(User user){
//        return (this.age.compareTo(user.age));
//    }
//

    public int compareTo(User user){return (this.name.compareTo(user.name));}

    @Override
    public String toString(){
        return "[ id" + this.id + ", name" + this.name + ", age" + this.age + ", salary" + this.salary + " ]";
    }

}
