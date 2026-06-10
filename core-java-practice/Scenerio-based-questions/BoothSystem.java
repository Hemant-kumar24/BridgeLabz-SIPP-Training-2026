import java.util.*;

public class BoothSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Booth System");
        int Acount = 0;
        int Bcount = 0;
        int Ccount = 0;
        while (true) {
            System.out.println("Enter  your Age : ");
            int n = sc.nextInt();
            if (n < 18) {
                System.out.println("You are not Eligible to Vote");

            } else {
                System.out.println("Cast Your Vote to any one of the following  A,B,C : ");
                String vote = sc.next();
                if (vote.equals("A")) {
                    Acount++;
                } else if (vote.equals("B")) {
                    Bcount++;
                } else if (vote.equals("C")) {
                    Ccount++;
                } else {
                    System.out.println("Invalid Vote");
                }
                System.out.println("Does All Voters Complete their Vote (yes/no) ? ");
                String res = sc.next();
                if (res.equals("yes")) {
                    System.out.println("Voting Closed !");
                    break;
                }
            }
        }
        System.out.println("Result of the Voting ");
        System.out.println("A : " + Acount);
        System.out.println("B : " + Bcount);
        System.out.println("C : " + Ccount);
        System.out.println("****************WINNER**************");
        if (Acount > Bcount && Acount > Ccount) {
            System.out.println("A is the Winner");
        }
        else if (Bcount > Acount && Bcount > Ccount) {
            System.out.println("B is the Winner");
        }
        else{
            System.out.println("C is the Winner");
        }
    }
}
