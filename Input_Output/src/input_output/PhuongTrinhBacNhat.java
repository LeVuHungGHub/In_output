
package input_output;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = keyboard.nextInt();
        System.out.print("Enter b:");
        int b = keyboard.nextInt();
        float x;
        if(a==0){
            if(b==0){
                System.out.print("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh vo so nghiem!");
            } 
        } else {
            x=(float)(-b)/a;
            System.out.println("Phuong trinh co nghiem x="+x);
        }
            
    }
}
