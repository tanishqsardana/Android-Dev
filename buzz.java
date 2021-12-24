import java.util.Scanner;
public class buzz{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(n%10==7){
            System.out.println("Number is buzz number");
        }
        else{
            if(n%7==0){
                System.out.println("Number is buzz number");
            }
            else{
                System.out.println("Number is not a buzz number");
            }
        }
    }
}