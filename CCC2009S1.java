package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2009S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int count = 0;

        int sq = (int)(Math.ceil(Math.sqrt(a)));
        int cb = (int)(Math.ceil(Math.cbrt(a)));

        int s = (int)(Math.pow(sq,2));
        int c = (int)(Math.pow(cb,3));

        while(s<=b&&c<=b){
            if(s==c){count++;sq++;s=(int)(Math.pow(sq,2));}
            else if(s<c){sq++;s=(int)(Math.pow(sq,2));}
            else{cb++;c = (int)(Math.pow(cb,3));}
        }
        System.out.println(count);
    }
}
