import java.util.Scanner;
public class matrixmultiplication{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int [][] arr = new int[n][n];
        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int [][] arr1 = new int[n][n];
        System.out.println("Enter elements of second matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int [][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
                for(int k=0;k<3;k++){
                    matrix[i][j]+= arr[i][k]*arr1[k][j];
            }
        }
    }

        System.out.println("After Elements are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}