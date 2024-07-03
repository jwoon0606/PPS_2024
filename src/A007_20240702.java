import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class A007_20240702 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "12345678";
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }
        if(str.contentEquals(sb)){
            System.out.println("ascending");
        } else if (str.contentEquals(sb.reverse())){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}