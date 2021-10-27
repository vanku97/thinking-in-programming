/**
 * @author Albert Ku
 * @date 2020/3/8
 * @leetCode
 * @timeComplexity
 * @spaceComplexity
 */


public class GenerateTheString {

    public static void main(String[] args) {
        String s = new GenerateTheString().generateTheString(88);
        System.out.println(s);

    }

    String generateTheString(int n){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n-1;i++) {
            s.append("a");
        }
        if(n%2 == 0) {
            s.append("b");
        } else {
            s.append("a");
        }
        return s.toString();
    }
}
