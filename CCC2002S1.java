package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2002S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(reader.readLine());
        int g = Integer.parseInt(reader.readLine());
        int r = Integer.parseInt(reader.readLine());
        int o = Integer.parseInt(reader.readLine());
        int total = Integer.parseInt(reader.readLine());

        int tc = 0;
        int min = Integer.MAX_VALUE;

        int[] order = new int[4];

        order[0] = total/o+1;
        while(order[0]-->0){
            order[1] = (total-order[0]*o)/r+1;
            while(order[1]-->0){
                order[2] = (total-order[0]*o-order[1]*r)/g+1;
                while(order[2]-->0){
                    order[3] = (total-order[0]*o-order[1]*r-order[2]*g)/p;
                    if(total-p*order[3]-g*order[2]-r*order[1]-o*order[0]==0){
                        System.out.println(
                                "# of PINK is "+ order[3] +
                                " # of GREEN is " +order[2] +
                                " # of RED is "+ order[1] +
                                " # of ORANGE is "+order[0]);
                        tc++;
                        int i = order[0] + order[1] + order[2] + order[3];
                        if(i <min)min= i;
                    }
                }
            }
        }
        System.out.println("Total combinations is "+ tc+".");
        System.out.println("Minimum number of tickets to print is "+min+".");
    }
}
