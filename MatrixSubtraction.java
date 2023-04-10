class MatrixSubtraction  
{  
    public static void main(String args[]) {  
        int n,m;  
        int a[][] = {  
                     {4, 5, 6},  
                     {3, 4, 1},  
                     {1, 2, 3}  
                    };  
        int b[][] = {  
                    {2, 0, 3},  
                    {2, 3, 1},  
                    {1, 1, 1}  
                    };  
        n = a.length;  
        m = a[0].length;  
        int diff[][] = new int[n][m];  
        for(int i = 0; i < n; i++){  
            for(int j = 0; j < m; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("Subtraction of two matrices: ");  
        for(int i = 0; i < n; i++){  
            for(int j = 0; j < m; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}    
