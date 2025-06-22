package PatternPrinting;

import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter first number (a): ");
        int a=sc.nextInt();

        // Prompt the user to enter three numbers
        System.out.print("Enter second number (b): ");
        int b=sc.nextInt();

        // Prompt the user to enter three numbers
        System.out.print("Enter third number (c): ");
        int c=sc.nextInt();
        if(a<=b && a<=c){
                System.out.println(a+": A is the smallest one");
        }
        else if(b<=c&&b<=a){
            System.out.println(b+": B is the smallest one");
        }else{
            System.out.println(c+": C is the smallest one");
        }
    }
}
