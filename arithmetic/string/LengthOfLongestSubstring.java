import java.util.HashMap;

/**
 * @author vanku
 * @date 2020/3/5
 * @leetCode 3
 * @timeComplexity
 * @spaceComplexity
 */


public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        int result = new LengthOfLongestSubstring().lengthOfLongestSubstring("aans");
        System.out.println(result);
    }


    int lengthOfLongestSubstring(String s) {
        //ASCll
//        int n = s.length(), ans = 0;
//        int[] index = new int[128];
//        for (int j = 0, i = 0; j < n; j++) {
//            i = Math.max(index[s.charAt(j)], i);
//            ans = Math.max(ans, j - i + 1);
//            index[s.charAt(j)] = j + 1;
//        }
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}

