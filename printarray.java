import java.util.Scanner;
public class printarray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}