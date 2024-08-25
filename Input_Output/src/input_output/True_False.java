
package input_output;

import java.util.Scanner;

public class True_False {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Data:");
        int x = keyboard.nextInt();
        if(x>0){
            System.out.println("Positive");
        } else if(x<0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
