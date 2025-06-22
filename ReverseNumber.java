package PatternPrinting;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();//read the user input
        int rem=0; // This will hold the reversed number
        while(num!=0){
            int digit =num%10; // Get the last digit
            rem=rem*10+digit; // Append digit to the reversed number
            num=num/10; // Remove the last digit from the original number
        }
        System.out.println(rem);//print the reversed number
    }
}
