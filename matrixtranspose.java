import java.util.Scanner;
public class matrixtranspose{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int [][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int [][] transpose = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Before Elements are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("After Elements are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}