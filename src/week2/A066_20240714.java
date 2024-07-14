package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class A066_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split("");
        Arrays.sort(strings, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
        }
        sb.append("\n");
        System.out.print(sb);
    }
}
