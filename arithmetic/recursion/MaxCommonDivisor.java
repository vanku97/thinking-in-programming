/**
 * @author vanku
 * @date 2020/1/12
 * @time 16:53
 */
public class MaxCommonDivisor {

    public static void main(String[] args) {
        int function = function(25, 10);
        System.out.println(function);
    }


    static int function(int a,int b){
        if (a==b)return a;
        int big = Math.max(a, b);
        int min = Math.min(a, b);
        return function(big-min,min);
    }

}
