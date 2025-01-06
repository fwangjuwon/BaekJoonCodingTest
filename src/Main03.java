import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        // 문제: 두 단어를 애너그램으로 만들기 위해
        // 제거해야하는 문자의 최소 개수
        // 애너그램: 단어의 구성(알파벳과 그 개수)이 완전히 같은 단어
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int ans = 0;
        //26개의 숫자가 들어갈 수 있는 배열을 선언
        int[] countA = new int[26];
        int[] countB = new int[26];
        //a의 ascii코드는 97 
        for (int i = 0; i < str.length(); i++) {
            countA[str.charAt(i) - 'a']++;
        }
        for (int n = 0; n < str2.length(); n++) {
            countB[str2.charAt(n) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (countA[i] > countB[i]) {
                ans += countA[i] - countB[i];
            } else if (countA[i] < countB[i]) {
                ans += countB[i] - countA[i];
            }
        }
        System.out.println(ans);

    }
}
