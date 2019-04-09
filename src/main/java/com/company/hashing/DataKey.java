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
        if (id!= dataKey.id) return false;
        return name != null ? name.equals(dataKey.name) : dataKey.name == null;
    }

    @Override
    public int hashCode() {
        int result = name !=null ? name.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
