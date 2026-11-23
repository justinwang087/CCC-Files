package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2023J1 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());

        if(P>C) System.out.println(P*50-C*10+500);
        else System.out.println(P*50-C*10);
    }
}
