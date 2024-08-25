
package input_output;

import java.util.Scanner;

public class Input_Output {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Data:");
        System.out.print("Ho ten:");
        String HoTen = keyboard.nextLine();
        System.out.print("Que quan:");
        String QueQuan = keyboard.nextLine();
        System.out.print("Nam sinh:");
        int NamSinh = keyboard.nextInt();
        System.out.print("Tuoi:");
        int Tuoi = keyboard.nextInt();
        System.out.print("GPA:");
        float GPA = keyboard.nextFloat();
        System.out.println("Ho Ten:"+HoTen+ "-Nam Sinh:"+NamSinh+ "-Tuoi:"+Tuoi+ "-GPA:"+GPA+ "-Que quan:"+QueQuan);
    }
    
}
