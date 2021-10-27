import java.util.Arrays;

/**
 * @author Albert Ku
 * @date 2020/1/12
 * @time 16:18
 */
public class ReverseString {

    public static void main(String[] args) {

        char[] s = new char[]{'h','e','l','l','o','w'};
        function(s);
        System.out.println(Arrays.toString(s));

    }


    static void function(char[] s){

        for (int i = 0; i < s.length/2; i++) {
              char temp;
              temp = s[i];
              s[i] = s[s.length-(i+1)];
              s[s.length-(i+1)] = temp;
        }
    }

}
