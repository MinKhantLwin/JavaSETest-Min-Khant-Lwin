package with_ide;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int day1=3;
        int day2=4;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a Date 3 or 4");
        int x= a.nextInt();
        if(x==day1){
            System.out.println("good day");
        } else if (x==day2) {
            System.out.println("bad day");
        } else {
            System.out.println("re enter");
        }
    }
}
