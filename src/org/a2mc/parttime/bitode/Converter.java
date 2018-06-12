package org.a2mc.parttime.bitode;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Binary number:");
        String BinaryNumber = input.nextLine();

        int DecimalNumber = Integer.parseInt(BinaryNumber,2);
        System.out.println("Decimal Number is:");
        System.out.println(DecimalNumber);
    }

}
