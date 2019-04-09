package com.company.hashing;
import java.util.HashMap;
import java.util.Map;
public class HashingTest {
    public static void main(String[] args){
        Map<DataKey,Integer> hm = getAllData();
        DataKey dk1 = new DataKey();
        dk1.setName("molly");
        dk1.setId(5);
        System.out.println(dk1.hashCode());
        Integer value = hm.get(dk1);
        System.out.println(value);
    }

    private static Map<DataKey, Integer> getAllData(){
        Map<DataKey, Integer> hm = new HashMap<DataKey, Integer>();
        DataKey dk = new DataKey();
        dk.setId(2);
        dk.setName("lulu");
        System.out.println(dk.hashCode());
        hm.put(dk,10);
        return hm;
    }
}
