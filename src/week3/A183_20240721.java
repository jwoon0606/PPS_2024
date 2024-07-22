package week3;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class A183_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("\\    /\\" + "\n");
        bw.write(" )  ( ')" + "\n");
        bw.write("(  /  )" + "\n");
        bw.write(" \\(__)|" + "\n");
        bw.flush();
        bw.close();
    }
}
