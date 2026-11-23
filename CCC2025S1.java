package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2025S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        long[] lengths = new long[4];

        for(int i=0;i<4;i++){
            lengths[i] =  Integer.parseInt(input[i]);
        }

        System.out.print(Math.min(
                ((lengths[0]+lengths[2])+Math.max(lengths[1], lengths[3]))*2,
                ((lengths[1]+lengths[3])+Math.max(lengths[0], lengths[2]))*2));
    }
}
