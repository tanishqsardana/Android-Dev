import java.util.Scanner;
public class palindrome{
        public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to be checked");
        int n = sc.nextInt();
        int temp=n;
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            sum = sum*10 +r;
            n=n/10;

        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}