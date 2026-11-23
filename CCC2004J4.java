package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2004J4 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String header = reader.readLine();
        String code = reader.readLine();
        int count = 0;

        StringBuilder output = new StringBuilder();

        for(int i=0;i<code.length();i++){
            char character = code.charAt(i);

            if(Character.isLetter(character)){
                int shift = header.charAt(count%header.length())-'A';

                output.append((char)((character-'A'+shift)%26+'A'));
                count++;
            }
        }

        System.out.println(output.toString());
    }
}
