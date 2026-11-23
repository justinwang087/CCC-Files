package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2004S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        while(N-->0){
            String[] s = {reader.readLine(), reader.readLine(), reader.readLine()};
            boolean no = false;


            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i==j)continue;
                    if(s[i].length()<s[j].length())continue;
                    if(s[i].startsWith(s[j])||s[i].endsWith(s[j])){
                        no=true;
                        break;
                    }
                }
                if(no) break;
            }
            if(no)System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
