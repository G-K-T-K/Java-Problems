import java.util.Scanner;
class MatrixAddition  
{  
    public static void main(String args[]) {  
        int n,m,i,j;  
	  Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
	  n=sc.nextInt();
        System.out.print("Enter the no. of columnms : ");
	  m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the elements of the matrix A : ");
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        int b[][]=new int[n][m];
        System.out.println("Enter the elements of the matrix B : ");
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++)
                b[i][j] = sc.nextInt();
        n = a.length;  
        m = a[0].length;  
        int diff[][] = new int[n][m];  
        for(i = 0; i < n; i++){  
            for(j = 0; j < m; j++){  
                diff[i][j] = a[i][j] + b[i][j];  
            }  
        }  
  
        System.out.println("Addition of two matrices: ");  
        for(i = 0; i < n; i++){  
            for(j = 0; j < m; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}    
