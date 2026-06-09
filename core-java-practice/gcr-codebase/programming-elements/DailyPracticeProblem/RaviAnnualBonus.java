package DailyPracticeProblem;
import java.util.*;
public class RaviAnnualBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  name=sc.nextLine();
        int age=sc.nextInt();
        int rank=sc.nextInt();
        int salary=sc.nextInt();
        float membershipFees=sc.nextFloat();
        int annualBonus=(12*salary)/100;
        System.out.println("Hello "+name+" Your Annual Bonus is "+annualBonus+".");
    }
}
