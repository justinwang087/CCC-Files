package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CCC2013S1 {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("");
        int[] year = new int[input.length+1];
        for(int i=1;i< input.length+1;i++){
            year[i]=Integer.parseInt(input[i-1]);
        }
        year[0]=0;
        year[year.length-1]++;

        HashSet<Integer> ints = new HashSet<>();
        ints.add(0);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);

        for(int i=year.length-1;i>0;i--){
            if(year[i]>9){
                year[i]=0;
                year[i-1]++;
            }
        }

        for(int i=1-year[0];i< year.length;i++){
            if(ints.contains(year[i]))ints.remove(year[i]);
            else{
                if(year[i]+1>9){
                    year[i]=0;
                    ints.add(year[i-1]);
                    year[i-1]+=1;
                    i-=2;
                    for(int j=i+3;j< year.length;j++)year[j]=0;
                }else{
                    year[i]++;
                    if(year[i]>9){
                        year[i]=0;
                        ints.add(year[i-1]);
                        year[i-1]+=1;
                        i-=2;

                        for(int j=i+3;j< year.length;j++)year[j]=0;
                    }else {
                        i--;
                        for(int j=i+2;j< year.length;j++)year[j]=0;
                    }
                }
            }
        }
        for(int i=0;i< year.length;i++){
            if(i==0&&year[i]==0){continue;}
            System.out.print(year[i]);
        }
        System.out.println();
    }
}
