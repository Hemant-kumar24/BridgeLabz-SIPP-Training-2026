package javaProgrammingElementsLevel2;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int unitPrice = sc.nextInt();
        int totalPrice = quantity*unitPrice;
        System.out.println("The total price is "+totalPrice);
    }
}
