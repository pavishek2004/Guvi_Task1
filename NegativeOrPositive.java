package PatternPrinting;
import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num =sc.nextInt();//read the user input
        // Check if the number is zero, positive, or negative

        if(num ==0){
            System.out.println("you have entered zero");
        }else if(num>0){
            System.out.println("positive");
        }else{
            System.out.println("Negative");
        }
    }
}
