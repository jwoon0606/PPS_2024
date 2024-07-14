package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A029_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int z = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(N >= 6){
            System.out.println("Love is open door");
            return;
        }
        for (int i = 0; i < N-1; i++) {
            if(z == 0)
                sb.append(++z).append("\n");
            else
                sb.append(--z).append("\n");
        }
        System.out.print(sb);
    }
}
