import edu.princeton.cs.algs4.*;

public class Ex1109 {
    public static String DtoB(int N){
        String s="";
        while(N>0){
            s=N%2+s;    // 两个运算对象顺序不能反
            N/=2;
        }
        return s;
    }
    public static void main(String args[]) {
        StdOut.println(DtoB(2));
    }
}