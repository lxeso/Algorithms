import java.util.*;
public class String03 {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE; // 최대값 선언. Integer클래스의 MIN_VALUE로 초기화. 최대값의 경우 제일 작은값으로 초기화 해줌. int max = Integer.MIN_VALUE, pos; 는 int a = 5, b;와 같다
        String[] strArray = str.split(" "); // split 함수 : 인수에 입력받은 정규표현식 or 특정문자를 기준으로 문자열을 나누어 배열(Array) 저장하여 리턴
        for(String x : strArray){
            int wordLength = x.length(); //length() : 문자열 길이 리턴하는 함수
            if(wordLength > max){
                max = wordLength;
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String03 t = new String03();
        Scanner kb = new Scanner(System.in); //Scanner 객체를 생성하려면 다음과 같이 생성자에 System.in 매개값을 주면 된다.
        String str1 = kb.nextLine(); // next()가 아닌 nextLine()을 써야하는 이유. next()의 경우 공백을 기준으로 한 단어 or 한 문자씩 입력 받고, 버퍼에 입력된 문자나 문자열에서 *공백 전까지의 단어*를 읽어오고, 개행문자는 가져오지 않는다. 하지만 nextLine()의 경우, 문자 or Enter를 치기 전까지의 문장 전체를 입력 받고, 버퍼에 입력된 문자열을 개행문자(즐바꿈문자)까지 다 가져옴
       System.out.print(t.solution(str1));
    }
}
