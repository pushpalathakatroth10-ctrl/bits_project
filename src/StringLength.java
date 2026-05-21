package src;

import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        System.out.println("Length of string = " + length);
    }
    
}
