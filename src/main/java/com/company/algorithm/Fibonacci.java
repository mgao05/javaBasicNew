package com.company.algorithm;

public class FibonacciThreeWay {
        public int fib(int N) {
            // recursion
            // if(N==0){return 0;}
            // if(N==1){return 1;}
            // else {return fib(N-1)+fib(N-2);}
            //dp
            // int f[] = new int[N+2];
            // //int f[]= new int[N+1]；
            // f[0]=0;
            // f[1]=1;
            // for (int i=2; i<=N; i++){
            //         f[i] = f[i-1] + f[i-2];
            //     }
            // return f[N];
            // }
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
    }


