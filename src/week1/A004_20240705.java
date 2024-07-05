package week1;

import java.util.Arrays;
public class A004_20240705 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer = Arrays.copyOf(answer,answer.length + 1);
                answer[answer.length-1] = arr[i];
            }
        }

        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);
        return answer;
    }
}


