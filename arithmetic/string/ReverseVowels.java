import java.util.Arrays;

/**
 * @author vanku
 * @date 2020/1/13
 * @time 13:40
 */
public class ReverseVowels {

    public static void main(String[] args) {

        String s = "hello";
        String result = function(s);
        System.out.println(result);

    }

    private static String function(String s){
        String vowel = "aeiou";
        char[] s2 = s.toCharArray();
        for (int i = 0; i < s2.length/2; i++) {
            if (!vowel.contains(Character.toString(s2[i]))) {
                continue;
            }
            char temp;
            temp = s2[i];
            s2[i] = s2[s2.length - (i + 1)];
            s2[s2.length - (i + 1)] = temp;
        }
        return Arrays.toString(s2);
    }


}
