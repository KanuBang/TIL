package javaAlgorithm.UTILS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class InputAndOuput {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of text:");

        try {
            // read a line
            String line = reader.readLine();

            // Using StringTokenizer to tokenize the line
            StringTokenizer tokenizer = new StringTokenizer(line);
            System.out.println("Tokens:");

            // Iterate through the tokens and print them
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                System.out.println(token);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


