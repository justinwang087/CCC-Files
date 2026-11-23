package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CCC2015S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        Stack<Integer> nums = new Stack<>();

        while(N-->0){
            int num = Integer.parseInt(reader.readLine());
            if(num==0)nums.pop();
            else nums.push(num);
        }
        int out = 0;
        for(int i:nums){
            out+=i;
        }
        System.out.println(out);
    }
}
