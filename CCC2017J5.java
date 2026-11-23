package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CCC2017J5 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        StringTokenizer input = new StringTokenizer(reader.readLine());
        int[] mes = new int[N];

        for(int i=0;i<N;i++) mes[i] = Integer.parseInt(input.nextToken());

        Arrays.sort(mes);

        if(N%2==0){
            for(int i=0;i<N/2;i++){
                System.out.print(mes[N/2-i-1]+" "+mes[N/2+i]+" ");
            }
        }else{
            System.out.print(mes[N/2]+" ");
            for(int i=1;i-1<N/2;i++){
                System.out.print(mes[N/2+i]+" "+mes[N/2-i]+" ");
            }
        }
    }
}
