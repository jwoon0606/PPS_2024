package week4;

import java.util.Arrays;
import java.util.Scanner;

public class A084_20240728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int sLength = s.length();
        String[] strArray = new String[sLength];

        for(int i=0; i<sLength; i++) {
            strArray[i] = s.substring(i, sLength);
        }

        Arrays.sort(strArray);

        for (String str : strArray) {
            System.out.println(str);
        }
    }
}