package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A046_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[26];
        for (int i = 0; i < num; i++) {
            String temp = br.readLine();
            a[temp.charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if(a[i] >= 5){
                sb.append((char)(i + 'a'));
                flag = true;
            }
        }
        System.out.print(sb);
        if(flag == false){
            System.out.println("PREDAJA");
        }
    }
}
