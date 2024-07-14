package week2;

public class A009_20240713 {
    public boolean solution(String s) {
        boolean answer = true;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                answer = false;
                break;
            }
        }

        if(s.length() != 4 && s.length() != 6)
            answer = false;

        return answer;
    }
}
