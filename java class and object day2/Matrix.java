import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                if(i==j){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i +  j)== (n-1)){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
