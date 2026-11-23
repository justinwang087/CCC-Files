package CCCPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2024J42 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String encode = reader.readLine();
        String code = reader.readLine();

        int character = 0;

        StringBuilder output = new StringBuilder();

        for(int n=0;n<code.length();n++){
            if(Character.isAlphabetic(code.charAt(n))){
                output.append((char)(((code.charAt(n)-'A')+(encode.charAt(character%encode.length())-'A'))%26 + 'A'));
                character++;
            }
        }
        System.out.println(output.toString());
    }
}
