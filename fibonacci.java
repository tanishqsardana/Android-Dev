import java.util.Scanner;
public class fibonacci{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int one=0;
        int two=1;
        System.out.println("Enter number of terms you want:");
        int n = sc.nextInt();
        int three=0;
        System.out.println(one);
        System.out.println(two);
        for(int i =2;i<n;i++){
            three=one+two;
            System.out.println(three);
            one=two;
            two=three;
        }

    }
}