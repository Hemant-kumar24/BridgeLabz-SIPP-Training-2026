import java.util.*;
public class CoffeCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Coffee Counter");
        while(true){
        System.out.println("Type (exit) to Exit Coffee Counter ");
        System.out.println("Enter Type of Coffee : ");
        String coffeeType=sc.next();
        int price=0;
        if(coffeeType.equals("exit")){
            break;
        }
        switch(coffeeType){
            case("Americano"):
                price=140;
                break;
            case("Latte"):
                price=190;
                break;
            case("Cappuccino"):
                price=150;
                break;
            case("Espresso"):
                price=200;
                break;
            default:
                System.out.println("Invalid Coffee Type");
                break;
        }
        System.out.println("The price of "+coffeeType+" is "+price);
        System.out.println("Enter quantity : ");
        int quantity=sc.nextInt();
       
        int GST=(quantity*price*13)/100;
        System.out.println("GST of this Product : "+GST);
        int totalBill=(quantity*price)+GST;
        System.out.println("Total bill is : "+totalBill);
    }

    }
}
