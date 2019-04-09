package com.company.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballScore {
        public int calPoints(String[] ops) {
            Stack<Integer> storage = new Stack<>();
            for (int i=0; i<= ops.length-1; i++){
                if(ops[i].equals("D")){
                    int score = storage.peek();
                    score = 2*score;
                    //int score =Integer.parseInt(storage.peek()) *2;
                    storage.push(score);
                }
                else if(ops[i].equals("C")){
                    storage.pop();
                }

                else if(ops[i].equals("+")){
                    int first = (Integer)(storage.pop());
                    int second = (Integer)(storage.peek());
                    int score = first+second;
                    storage.push(first);
                    storage.push(score);
                }
                else{
                    storage.push(Integer.parseInt(ops[i]));
                }
            }

            int sum = 0;
            while (storage.empty()==false){
                sum+=storage.pop();
            }
            return sum;
        }

    public int calPointsSwitchCase(String[] ops){
        Stack<Integer> storage = new Stack<>();
        for (int i=0; i<= ops.length-1; i++){
            String input = ops[i];
            switch(input){
                case "D":
                    int score = storage.peek();
                    score = 2*score;
                    //int score =Integer.parseInt(storage.peek()) *2;
                    storage.push(score);
                    break;
                case "C":
                    storage.pop();
                    break;
                case "+":
                    int first = (Integer)(storage.pop());
                    int second = (Integer)(storage.peek());
                     score = first+second;
                    storage.push(first);
                    storage.push(score);
                    break;
                default:
                    storage.push(Integer.parseInt(ops[i]));
                    break;
            }
        }
        int sum = 0;
        while (storage.empty()==false){
            sum+=storage.pop();
        }
        return sum;

    }

        public static void main(String[] args){
            String[] arr = {"5","2","C","D"};
            BaseballScore baseballScore = new BaseballScore();
            System.out.println(baseballScore.calPointsSwitchCase(arr));
        }
    }


