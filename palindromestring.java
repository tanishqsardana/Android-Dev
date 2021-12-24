import java.util.Scanner;
public class palindromestring{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        str = str.toLowerCase();
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}