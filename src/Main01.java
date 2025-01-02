import java.util.Scanner;

public class Main01 {
    // 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
    // ascii table 활용해보자!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                ans += (char) ('a' + ch - 'A');

            } else {
                ans += ((char) ('A' + ch - 'a'));
            }
        }
        System.out.println(ans);
    }
}

// String 비교할 때 == 연산자보다
// .equals() 함수 사용해서 비교해야한다.
// https://docs.oracle.com/javase/11/docs/api/java/lang/String.html