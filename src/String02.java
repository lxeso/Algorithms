import java.util.*;
/*
* 문제 : 입력받은 문자열의 대문자는 소문자로, 소문자는 대문자로 변환하여 출력
* */
public class String02 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }
        return answer;
    }
        public static void main(String[] args){
            String02 t = new String02();
            Scanner kb = new Scanner(System.in);
            String str1 = kb.next();
            System.out.print(t.solution(str1));
    }
}
