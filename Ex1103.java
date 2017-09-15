import edu.princeton.cs.algs4.*;

public class Ex1103 {
    public static void main(String args[]) {
        int a=StdIn.readInt();
        int b=StdIn.readInt();
        int c=StdIn.readInt();
        if(a==b && a==c)
            StdOut.printf("equal\n");
        else
            StdOut.printf("not equal\n");
    }
}