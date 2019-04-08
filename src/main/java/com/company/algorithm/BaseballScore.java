package com.company.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BaseballScore {

        public List<Integer> findDuplicates(int[] nums) {
            int [] array = new int [nums.length];
            int i =0;
            while (i<=nums.length-1){
                array[nums[i]-1] = array[nums[i]-1]+1;
                i++;
            }
            int j =0;
            List<Integer> keeper = new ArrayList<Integer>();
            while(j<=array.length-1){
                if (array[j]>=2){
                    keeper.add(j+1);
                    j++;}
                else j++;
            }
            return keeper;
        }
    }

