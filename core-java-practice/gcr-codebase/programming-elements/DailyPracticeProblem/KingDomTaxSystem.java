package DailyPracticeProblem;
import java.util.*;

public class KingDomTaxSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totalTax = 0;
        for (int i=1;i<=10;i++) {
            System.out.print("Enter income of citizen "+i+": ");
            double income = sc.nextDouble();
            double tax = 0;
            if (income<=10000) {
                tax=income*0.05;
            } else if(income<=50000) {
                tax=(10000*0.05)+((income -10000)*0.15);
            } 
            else{
                tax =(10000*0.05)+(40000*0.15)+((income -50000)*0.30);
            }
            totalTax+=tax;
            System.out.println("Citizen " +i+ " Tax = "+tax);
        }
        System.out.println("Total Tax Collected = " +totalTax);

    }
}
