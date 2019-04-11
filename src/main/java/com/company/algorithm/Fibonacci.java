package com.company.algorithm;


import java.util.Map;

public class Fibonacci {
        public int fibRec(int N) {
             //recursion
             if(N==0){return 0;}
             if(N==1){return 1;}
             else {return fibRec(N-1)+fibRec(N-2);}
        }

        public int fibMem(int N, Map mem) {
            //recursive+memory
            int zero = 0;
            int one =1;
            int result=0;
            if(N==0){return zero;}
            if(N==1){return one;}
            else {
                for(int i=2; i<=N; i++){
                    result = zero+one;
                    zero = one;
                    one = result;
                }
                return result;
            }
        }

        public int dpFib(int N) {
        int f[] = new int[N+2];
            f[0]=0;
            f[1]=1;
            for (int i=2; i<=N; i++){
                f[i] = f[i-1] + f[i-2];
            }
            return f[N];
        }




        }



