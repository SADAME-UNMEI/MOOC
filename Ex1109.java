import edu.princeton.cs.algs4.*;

public class Ex1109 {
    public static String DtoB(int N){
        String s="";
        while(N>0){
            s=N%2+s;    // �����������˳���ܷ�
            N/=2;
        }
        return s;
    }
    public static void main(String args[]) {
        StdOut.println(DtoB(2));
    }
}