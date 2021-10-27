/**
 * @author Albert Ku
 * @date 2020/1/9
 * @time 10:38
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = function(a, b);
        System.out.println(result);

    }


    static String function(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
}
