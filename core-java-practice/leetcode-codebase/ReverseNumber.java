import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int x) {
        int sum=0;
        while(x!=0){
            int rev=x%10;
             x=x/10;
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;
            }
            sum=sum*10+rev;
           
        }
        return sum;   
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = reverse(num);
        System.out.print("The reverse Integer is "+reverseNum);

    }
}
