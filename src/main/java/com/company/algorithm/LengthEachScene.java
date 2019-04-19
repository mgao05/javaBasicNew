package com.company.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.copyOfRange;

public class LengthEachScene {
    public static List<Integer> lengthEachScene(List<Character> s) {
//        int small = 0;
//        int big = 1;
//        int index = 1;
//        Character[] array = new Character[inputList.size()];
//        inputList.toArray(array);
//        List<Integer> result = new ArrayList<>();
//        if (big == array.length - 1) {
//
//            result.add(1);
//        } else {
//            while (big < array.length - 1) {
//                while (index < array.length - 1) {
//                    copyOfRange(array, small, big);
//                    boolean contains = Arrays.stream(copyOfRange(array, small, big)).anyMatch(array[index]::equals);
//                    if (contains) {
//                        big = index;
//                        index++;
//                    } else {
//                        index++;
//                    }
//                }
//                int temp = big -small;
//                big = index+2;
//                small = index+1;
////                List<Integer> result = new ArrayList<>();
//                result.add(temp);
//            }
//        }
//        return result;
        if(s==null)
            return null;
        List<Integer> result = new ArrayList<Integer>();

        int startSeq = 0;
        int endSeq = 0;
        // Character[] array = new Character[inputList.size()];
//        inputList.toArray(array);
        Character[] sArr = new Character[s.size()];
         s.toArray(sArr);
        while(startSeq<sArr.length){
            endSeq=s.lastIndexOf(sArr[startSeq]);
            if(startSeq==endSeq){
                result.add(1);
                startSeq++;
            }else{

                for(int j=startSeq+1;j<endSeq;j++){
                    if(s.lastIndexOf(sArr[j])>endSeq)
                        endSeq = s.lastIndexOf(sArr[j]);
                }
                result.add(endSeq-startSeq+1);
                startSeq = endSeq+1;
            }

        }
        Integer[] resultArr =  new Integer[result.size()];
        resultArr = result.toArray(resultArr);
        List<Integer> resultList = Arrays.asList(resultArr);
        return resultList;
    }




    public static void main(String[] args) {
        List<Character> testList = new ArrayList<>(3);
        testList.add('a');
        testList.add('b');
        testList.add('c');
        testList.add('a');
        testList.add('n');
        testList.add('m');
        testList.add('h');
        List<Integer> ans = lengthEachScene(testList);
        System.out.println(ans);

    }
}
