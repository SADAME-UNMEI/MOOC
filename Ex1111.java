import edu.princeton.cs.algs4.*;

public class Ex1111 {
    public static void prtboolmtrx(boolean matrix[][]) {
        StdOut.printf("  ");
        for(int k=0; k<matrix[0].length; k++)
            StdOut.printf("%d ",k);
        StdOut.printf("\n");
        for(int i=0; i<matrix.length; i++)
        {
            StdOut.printf("%d ",i);
            for(int j=0; j<matrix[i].length; j++)
                StdOut.printf("%c ",(matrix[i][j])?'*':' ');
            StdOut.printf("\n");
        }
    }
    public static void main(String args[]) {
        boolean matrix[][]={{false,true,true},
            {true,false,true},{true,false,false}};
        prtboolmtrx(matrix);
    }
}
            
        