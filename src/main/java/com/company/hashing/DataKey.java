package com.company.hashing;

import java.util.Objects;

public class DataKey {
    private String name;
    private int id;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "DataKey [name ="+name+" , id="+id+"]";}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataKey dataKey = (DataKey) o;
        return id == dataKey.id &&
                Objects.equals(name, dataKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
