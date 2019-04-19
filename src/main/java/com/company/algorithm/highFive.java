package com.company.algorithm;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class highFive {
    /**
     * @param results a list of <student_id, score>
     * @return find the average of 5 highest scores for each person
     * Map<Integer, Double> (student_id, average_score)
     */

    public static Map<Integer, Double> highFive(record[] results){
        Map<Integer, Double> result = new HashMap<Integer, Double>();
        HashMap<Integer, PriorityQueue<record>> map = new HashMap<Integer, PriorityQueue<record>>();
        int k =5;
        for(record r : results){
            if(!map.containsKey(r.id)){
                PriorityQueue<record> pq = new PriorityQueue<record>(k, new Comparator<record>() {
                    @Override
                    public int compare(record o1, record o2) {
                        return o1.score-o2.score;
                    }
                });
                map.put(r.id,pq);
            }
            map.get(r.id).add(r);
            if(map.get(r.id).size()>k){
                map.get(r.id).poll();
            }
        }
        for (Map.Entry<Integer, PriorityQueue<record>>entry : map.entrySet()){
            int id = entry.getKey();
            PriorityQueue<record> pq = entry.getValue();
            double average = 0;
            int num = pq.size();
            while (!pq.isEmpty()){
                average += pq.poll().score;
            }
            average /= num;
            result.put(id,average);
        }
        return result;
    }

    public static void main(String args[]){
        record[] input = new record[12];
        int[][] matrix = {{1,92},{2,93},{2,99},{2,98},{1,92},{2,93},{2,99},{2,98},{1,92},{2,93},{2,99},{2,98}};
        for(int i =0; i<matrix.length-1; i++){
          input[i].id = matrix[i][0];
          input[i].score=matrix[i][1];
        }

        System.out.println(highFive(input));
        return;
    }

}
