package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2000S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        int it = 0;
        int[] m = {Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine())};
        int[] loop = {35, 100, 10};
        int[] pay = {30, 60, 9};

        while(q>0){
            if(q<3){
                int temp = q;
                for(int i=0;i<temp;i++){
                    q--;it++;
                    q+=inc(i, m, loop, pay);
                }
                if(q!=0){
                    for(int i=3-temp+1;i<3;i++){
                        q--;it++;
                        q+=inc(i, m, loop, pay);
                    }
                }
            }else{
                q-=3;it+=3;
                q+=inc(0, m, loop, pay);
                q+=inc(1, m, loop, pay);
                q+=inc(2, m, loop, pay);
            }
        }
        System.out.println("Martha plays "+it+" times before going broke.");
    }
    static int inc(int m, int[] machine, int[] loop, int[] pay){
        machine[m]+=1;
        if(machine[m]==loop[m]){
            machine[m]=0;
            return pay[m];
        }
        return 0;
    }
}
