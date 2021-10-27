/**
 * @author Albert Ku
 * @date 2021/10/21
 * @leetCode
 * @title
 * @timeComplexity
 * @spaceComplexity
 */
public class ShiftingLetters {

    public static void main(String[] args) {
        String s = "mkgfzkkuxownxvfvxasy";
        Integer shifts[] = new Integer[]{505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
        StringBuilder ans = new StringBuilder();
        Long X = 0L;
        for (int shift : shifts) X = (X + shift);
        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';
            ans.append((char) (97 + ((X + index) % 26)));
            X -= shifts[i];
        }
        System.out.println(ans.toString());
    }
}
