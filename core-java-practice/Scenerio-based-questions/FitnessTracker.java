import java.util.*;
public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fitness Tracker");

        System.out.println("what is your Height in (cm) : ");
        double height=sc.nextDouble()/100;
        System.out.println("what is your Weight in (kg) : ");
        double weight=sc.nextDouble();
        double BMI=weight/(height*height);
        System.out.println("Your BMI is : "+BMI);
        if(BMI<18.5){
            System.out.println("You are Underweight");

        }
        else if(BMI>=18.5 && BMI<=24.5){
            System.out.println("you are Healthy");   
        }
        else{
            System.out.println("You are Overweight");
        }

    }
}
