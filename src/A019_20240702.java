import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A019_20240702 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        while(mul > 0){
            arr[mul%10]++;
            mul /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}