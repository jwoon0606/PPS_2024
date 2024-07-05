package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A048_20240705{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] dup;

        int count = 0;
        for (int i = 0; i < T; i++) {
            dup = new boolean[26];
            String str = br.readLine();
            char[] chars = str.toCharArray();
            char preChar = 'A';
            for (char c : chars) {
                if(c != preChar){
                    if(dup[c-'a'] == false)
                        dup[c-'a'] = true;
                    else {
                        count--;
                        break;
                    }
                }
                preChar = c;
            }
            count++;
        }

        System.out.println(count);
    }
}