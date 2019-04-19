package com.company.algorithm;

import com.google.common.primitives.Ints;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeSubfiles {
    public static int mergeSubfileOpt(List<Integer> files, int numberOfFiles){
        Collections.sort(files);
        if(numberOfFiles==0 ) return 0;
        if(numberOfFiles==1) return files.get(0);
        if(numberOfFiles ==2) return files.get(0)+files.get(1);
        int sum =0;
        int i =0;
        while(i< numberOfFiles){
            if(i==0 || i==1){
                sum+=files.get(i)*(numberOfFiles-1); i++;
            }
            else{ sum += files.get(i) *(numberOfFiles-i); i++;
            }
        }
    return sum;
    }

    public static void main(String args[]){
        int[] array = {20, 4, 8,2};
        List<Integer> intarray = Ints.asList(array);

        int[] intarray2 = new int[] {1, 2, 5, 10, 35, 89};
        int number = 4;
        int number2 =6;
    int result = mergeSubfileOpt(intarray, number);
    System.out.println(result);
    }
}
