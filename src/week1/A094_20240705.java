package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A094_20240705 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count =0;
        for (int i = 0; i < input.length(); i++) {
            if(i < input.length() - 1){
                String str = Character.toString(input.charAt(i)) + Character.toString(input.charAt(i+1));
                if(str.equals("c=") || str.equals("c-")|| str.equals("d-") || str.equals("lj") || str.equals("nj") || str.equals("s=") || str.equals("z=")){
                    i++;
                } else if (i < input.length() - 2){
                    str += Character.toString(input.charAt(i+2));
                    if(str.equals("dz=")){
                        i += 2;
                    }
                }
            }

            count++;

        }
        System.out.println(count);

    }
}