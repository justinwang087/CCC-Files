package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CCC2003S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pos = 1;

        HashMap<Integer,Integer> sl = new HashMap<>();
        sl.put(54,19);
        sl.put(90,48);
        sl.put(99,77);

        sl.put(9,34);
        sl.put(40,64);
        sl.put(67,86);

        String s;

        while(!(s=reader.readLine()).equals("")){
            int temp = Integer.parseInt(s);
            if(temp==0) {System.out.println("You Quit!");return;}
            if(pos+temp<=100)pos+=temp;
            if(sl.get(pos)!=null)pos = sl.get(pos);
            System.out.println("You are now on square "+pos);
            if(pos==100){System.out.println("You Win!");return;}
        }
    }
}
