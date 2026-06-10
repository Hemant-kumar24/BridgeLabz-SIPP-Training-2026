import java.util.Scanner;
public class SubtractTheProductAndSum {
     public static int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;
        }
        return prod-sum;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int difference = subtractProductAndSum(num);
        System.out.print("The difference of product and sum is "+difference);

    }
}
