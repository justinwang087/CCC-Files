package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2019S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("");

        boolean isV = false;
        boolean isH = false;

        for(String c : input){
            if(c.equals("V"))isV=!isV;
            if(c.equals("H"))isH=!isH;
        }

        if(!isV){
            if(!isH){
                System.out.println("1 2\n3 4");
            }else{
                System.out.println("3 4\n1 2");
            }
        }else{
            if(!isH){
                System.out.println("2 1\n4 3");
            }else{
                System.out.println("4 3\n2 1");
            }
        }
    }
}
