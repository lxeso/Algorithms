import java.util.Scanner;

// 문제 : 문자열안에 특정 문자 개수 계산 (대소문자 구분X)
public class String01 {
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x : str.toCharArray()) {
            if (x == c) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
       String01 t = new String01();
       Scanner kb = new Scanner(System.in);
       String str1 = kb.next();
       char c1 = kb.next().charAt(0);
       System.out.print(t.solution(str1, c1));
    }
}