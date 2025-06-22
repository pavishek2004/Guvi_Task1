package PatternPrinting;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmt=sc.nextDouble(); // Read the input amount

        double discount;
        // Apply discount based on the purchase amount

        if(purchaseAmt<500){
            discount=0;
        }else if(purchaseAmt <=1000){
        discount=0.10*purchaseAmt;// 10% discount for 500–1000
        }else{
            discount=0.20*purchaseAmt;// 20% discount for amount above 1000
        }
        // Calculate the final amount after applying the discount

        double finalAmount=purchaseAmt-discount;
        System.out.println("Final Payable Amount ₹:"+finalAmount);
    }
}
