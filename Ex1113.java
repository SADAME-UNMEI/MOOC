import edu.princeton.cs.algs4.*;

public class Ex1113 {
    public static double[][] transposition(double mtrx[][]) {
        double newmtrx[][]=new double[mtrx[0].length][mtrx.length];
        for(int i=0; i<mtrx.length; i++)
            for(int j=0; j<mtrx[0].length; j++)
                newmtrx[j][i]=mtrx[i][j];
        return newmtrx;
    }
    public static void prt_ar2d(double mtrx[][]) {
        for(int i=0; i<mtrx.length; i++){
            for(int j=0; j<mtrx[0].length; j++)
                StdOut.printf("%2.2f ",mtrx[i][j]);
            StdOut.printf("\n");
        }
    }
    public static void main(String args[]) {
        double mtrx[][]={{1,8,0.3},{5,2.2,5.9}};
        prt_ar2d(transposition(mtrx));
    }
}
        
        