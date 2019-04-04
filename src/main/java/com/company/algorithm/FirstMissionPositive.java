package com.company.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FirstMissionPositive {
    public int firstMissingPositive(int[] nums) {
        List<Integer> input = new ArrayList(3);
        int i =0;
        while(i<nums.length-1){
            if(nums[i]>=0){
                System.out.println(nums[0]);
                int temp=nums[i];
                input.add(temp,1);
                System.out.println(input.get(0));
                i++;
            }}
        int j=0;
        System.out.println(input);
        while(j<=input.size()-1){
            if(input.get(j)==0){
                return j;
            }
            else j++;
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {7,8,9,11,12};
        FirstMissionPositive positive = new FirstMissionPositive();
        positive.firstMissingPositive(nums);
    }
}
