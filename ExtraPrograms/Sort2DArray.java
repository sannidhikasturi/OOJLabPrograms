import java.util.*;
class Sort2DArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of  rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int n = sc.nextInt();
        int A[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter the elements: ");
                A[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("The original matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
 
        /* Sorting the 2D Array */
        int t=0;
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(A[i][j]>A[x][y])
                        {
                            t = A[x][y];
                            A[x][y] = A[i][j];
                            A[i][j] = t;
                        }
                    }
                }
            }
        }
 
        System.out.println("The Sorted Array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
