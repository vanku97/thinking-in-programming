/**
 * @author Albert Ku
 * @date 2020/1/9
 * @time 14:22
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(function("A man, a plan, a canal: Panama"));

    }


    static boolean function(String s){
        int i= 0;int j = s.length()-1;
        while (i<j){
            while (i<j&&!Character.isLetterOrDigit(s.charAt(i)))i++;
            while (i<j&&!Character.isLetterOrDigit(s.charAt(j)))j--;
            if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))return false;
            i++;j--;
        }
        return true;
    }

}
