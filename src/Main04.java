import java.util.Scanner;

public class Main04 {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                count[ch - 'A']++;

            } else {
                count[ch - 'a']++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 알파벳 대소문자로 된 단어가 주어지면,
        // 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
        // 소문자를 구분하지 않는다.

        // 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을
        // 대문자로 출력한다.
        // 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를
        // 출력한다.

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }

}
