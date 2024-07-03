import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A045_20240702 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];

        for(byte val : br.readLine().getBytes()){
            if((char)val <= 'Z')
                count[(char)val - 'A']++;
            else
                count[(char)val - 'a']++;
        }

        int max = -1;
        int ch = '?';
        for (int i = 0; i < count.length; i++) {
            if(count[i] > max){
                max = count[i];
                ch = i + 'A';
            }
            else if(count[i] == max){
                ch = '?';
            }
        }

        System.out.println((char)ch);
    }
}