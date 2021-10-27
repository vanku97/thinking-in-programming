/**
 * @author Albert Ku
 * @date 2020/1/8
 * @time 18:21
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(function("Hello World     "));
    }

    static int function(String parms) {
        int length = 0;
        for (int i = parms.length() - 1; i >= 0; i--) {
            if (parms.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }

}
