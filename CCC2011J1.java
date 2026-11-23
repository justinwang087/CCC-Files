package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2011J1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int t = 0;
        int s = 0;

        while(N-->0){
            String in = reader.readLine();
            for(char c : in.toCharArray()){
                if(c=='t'||c=='T')t++;
                if(c=='s'||c=='S')s++;
            }
        }
        if(t>s)System.out.println("English");
        else System.out.println("French");
    }
}
