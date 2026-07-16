import java.util.Scanner;

public class PallindromeNumber {
    public static boolean isPalindrome(int x) {
        int sum=0;
        if(x<0){
            return false;
        }
        int rev;
        int temp=x;
        while(x>0){
            rev=x%10;
            sum=sum*10+rev;
            x=x/10;
        }
        if (temp==sum){
            return true;
        }
        else{
            return false;
        }
    
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = isPalindrome(num);
        if(check){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }

}
