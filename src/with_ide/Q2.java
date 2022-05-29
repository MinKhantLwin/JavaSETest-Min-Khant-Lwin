package with_ide;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner swap= new Scanner(System.in);
        System.out.println("Enter the Value of X and Y");
        x=swap.nextInt();
        y= swap.nextInt();
        System.out.println("Before Swapping"+"" +x+" "+y );
        z=x;
        x=y;
        y=z;
        System.out.println("After Swapping"+" "+x+" "+y);
        System.out.println();
    }
}
