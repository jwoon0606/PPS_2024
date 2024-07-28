package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A050_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String before = br.readLine();
        char[] after = before.toCharArray();
        for (int i = 0; i < before.length(); i++) {
            char word = after[i];
            if (word >= 'A' && word <= 'C') {
                after[i] = (char) (word + 23);
            } else {
                after[i] = (char) (word - 3);
            }
        }

        System.out.print(after);
    }
}