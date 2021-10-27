/**
 * @author Albert Ku
 * @date 2020/1/9
 * @time 16:02
 */
public class ClimbStairs {

    public static void main(String[] args) {
//        System.out.println(function(0,90));
        System.out.println(climbStairs(5));

    }
    //time complexity: O(log n)
    static int function(int i,int n){

        if (i>n){
            return 0;
        }
        if (i==n){
            return 1;
        }
        return function(i+1,n)+function(i+2,n);
    }

    static  int function2(int n){
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }

    // f(n) = f(n - 1) + f(n - 2)f(n)=f(n−1)+f(n−2)
    //time complexity: O(n)
    static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}
