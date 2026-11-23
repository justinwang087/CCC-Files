package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2019J5 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean[] numbers = new boolean[10000001];
        sieve(numbers);

        int T = Integer.parseInt(reader.readLine());

        while(T-->0){
            int N = Integer.parseInt(reader.readLine());

            int hi = nextP(numbers, 1, N), lo = nextP(numbers, -1, N);
            double avg = (hi+lo)/2.0;
            while(avg!=(double)N){
                if(avg<N) hi = nextP(numbers, 1, hi+1);
                else lo = nextP(numbers, -1, lo-1);
                avg = (hi+lo)/2.0;
            }
            System.out.println(hi+" "+lo);
        }
    }
    static int nextP(boolean[] numbers, int dir, int start){
        while(numbers[start]) start+=dir;
        return start;
    }
    static void sieve(boolean[] numbers){
        int i=2;
        while(i<1000001){
            if(numbers[i]){i++; continue;}
            int j=2;
            while(j*i<1000001){
                numbers[i*j]=true;
                j++;
            }
            i++;
        }
    }
}
