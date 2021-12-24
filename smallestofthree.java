import java.util.Scanner;
public class smallestofthree{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n1=sc.nextInt();
        System.out.println("Enter number:");
        int n2=sc.nextInt();
        System.out.println("Enter number:");
        int n3=sc.nextInt();
        int smallest= n3<(n1<n2?n1:n2) ? n3:((n1<n2) ? n1:n2);
        System.out.println("The smallest number is: "+smallest);
    }
}