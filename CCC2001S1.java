package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2001S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("");

        System.out.println("Cards Dealt Points");

        int p = 0;
        int count = 0;
        int tp = 0;

        for(String c : input){
            if(c.equals("C")){System.out.print("Clubs ");continue;}
            else if(c.equals("D")){System.out.print(" "+(p+Math.max(0,3-count))+"\nDiamonds ");p=0;tp+=+Math.max(0,3-count);count=0;continue;}
            else if(c.equals("H")){System.out.print(" "+(p+Math.max(0,3-count))+"\nHearts ");p=0;tp+=+Math.max(0,3-count);count=0;continue;}
            else if(c.equals("S")){System.out.print(" "+(p+Math.max(0,3-count))+"\nSpades ");p=0;tp+=+Math.max(0,3-count);count=0;continue;}

            System.out.print(c+" ");
            if(c.equals("A")){p+=4;tp+=4;}
            else if(c.equals("K")){p+=3;tp+=3;}
            else if(c.equals("Q")){p+=2;tp+=2;}
            else if(c.equals("J")){p+=1;tp+=1;}
            count++;
        }
        System.out.print(" "+(p+Math.max(0,3-count))+"\nTotal "+(tp+=Math.max(0,3-count)));
    }
}
