package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2002S2 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int w = A/B;
        A -= w*B;

        int A1 = A;
        int B1 = B;

        while(B1!=0){
            int temp = B1;
            B1 = A1%B1;
            A1 = temp;
        }
        if(w>0){
            if(A>0){
                System.out.print(w+" "+A/A1+"/"+B/A1);
            }else{
                System.out.print(w);
            }
        }else{
            if(A>0){
                System.out.print(A/A1+"/"+B/A1);
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }
}
