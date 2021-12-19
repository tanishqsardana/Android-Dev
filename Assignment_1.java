import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int n=0;
        double x = 0;
        do {
            System.out.println("Enter 1 if you want to test Neon Number, 2 for Armstrong Number, 3 for ISBN, 4 to Quit");
            choice = sc.nextInt();
            if(choice==1 || choice==2){
                System.out.println("Enter number to be evaluated:");
                n = sc.nextInt();
            }
            if(choice==3){
                System.out.println("Enter number to be evaluated:");
                x = sc.nextDouble();
            }
            if(choice==1){

                int square = n*n;
                int nn = square;
                int sum = 0;
                while (nn>0) {
                    int digit = nn % 10;
                    nn = nn / 10;
                    sum += digit;
                }
                if (sum==n)
                    System.out.println("It is Neon Number");
                else
                    System.out.println("Not a Neon Number");
            }
            else if(choice==2){
                int nn = n;
                int sum = 0;
                while (nn>0){
                    int digit = nn%10;
                    nn = nn/10;
                    sum += (digit*digit*digit);
                }
                if (sum==n)
                System.out.println("It is Armstrong Number");
                else
                System.out.println("Not a Armstrong Number");

            }
            else if (choice==3){
                double nn = x;
                int sum=0;
                int i =1;
                while (i<=10){
                    int digit = (int) (nn%10.00);
                    nn = nn/10.0;
                    //System.out.println("Digit:"+digit+" NN:"+nn+" i:"+i);
                    sum += i*digit;
                    i+=1;
                }
                System.out.println(sum);
                if (sum%11==0)
                    System.out.println("It is ISBN Number");
                else
                    System.out.println("It is not ISBN Number");
            }
            else if (choice==4){
                System.out.println("Terminating Program");
            }
            else{
                System.out.println("Invalid Input");
            }
        }while(choice!=4);
    }
}
