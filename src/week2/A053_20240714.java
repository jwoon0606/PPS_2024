package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A053_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s){
                case "push" :
                    stack.push(Integer.valueOf(st.nextToken()));
                    break;
                case "pop" :
                    if(stack.isEmpty())
                        sb.append(-1);
                    else
                        sb.append(stack.pop());
                    sb.append("\n");
                    break;
                case "top" :
                    if(stack.isEmpty())
                        sb.append(-1);
                    else
                        sb.append(stack.peek());
                    sb.append("\n");
                    break;
                case "size" :
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case "empty" :
                    if(stack.isEmpty())
                        sb.append(1);
                    else
                        sb.append(0);
                    sb.append("\n");
                    break;
            }

        }
        System.out.println(sb);
    }
}
