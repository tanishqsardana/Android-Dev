import java.util.Scanner;
public class largestofthree{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n1=sc.nextInt();
        System.out.println("Enter number:");
        int n2=sc.nextInt();
        System.out.println("Enter number:");
        int n3=sc.nextInt();
        int temp=n1>n2?n1:n2;
        int largest=n3>temp?n3:temp;
        System.out.println("THe largest number is: "+largest);
    }
}