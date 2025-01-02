import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        // 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
        // 나는 그냥 UPPER, LOWER CASE 를 써볼래
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                ans += c;
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                ans += c;
            }

        }
        System.out.println(ans);

    }
}
