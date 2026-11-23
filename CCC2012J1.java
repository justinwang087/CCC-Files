package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2012J1 {
        public static void main(String[] args)throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(reader.readLine());
            if(N<4){System.out.println(0);return;}
            System.out.println((N-1)*(N-2)*(N-3)/(6));
        }
    }
