package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2006S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] p1 = reader.readLine().split("");
        String[] p2 = reader.readLine().split("");

        int[] map = new int[5];

        for(int i=0;i<5;i++){
            boolean p1a=false,p1A=false,p2a=false,p2A=false;
            if(Character.isUpperCase(p1[i*2].charAt(0))||Character.isUpperCase(p1[i*2+1].charAt(0)))p1A = true;
            if(Character.isLowerCase(p1[i*2].charAt(0))||Character.isLowerCase(p1[i*2+1].charAt(0)))p1a = true;

            if(Character.isUpperCase(p2[i*2].charAt(0))||Character.isUpperCase(p2[i*2+1].charAt(0)))p2A = true;
            if(Character.isLowerCase(p2[i*2].charAt(0))||Character.isLowerCase(p2[i*2+1].charAt(0)))p2a = true;

            if(p1a&&p2a)map[i]+=1;
            if(p1A||p2A)map[i]+=2;
        }

        int N = Integer.parseInt(reader.readLine());

        while(N-->0){
            String[] in = reader.readLine().split("");
            boolean can = true;

            for(int i=0;i<5;i++){
                if(map[i]==3)continue;
                if(map[i]==2&&Character.isLowerCase(in[i].charAt(0))){can=false;break;}
                if(map[i]==1&&Character.isUpperCase(in[i].charAt(0))){can=false;break;}
            }
            if(can)System.out.println("Possible baby.");
            else System.out.println("Not their baby!");
        }
    }
}
