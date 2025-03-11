math_package/
    Statistics.java
    convert/
        DecimalConverter.java
package math_package;

public class Statistics {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int cube(int n) {
        return n * n * n;
    }
}
package math_package.convert;

public class DecimalConverter {
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
}
import math_package.Statistics;
import math_package.convert.DecimalConverter;

public class conv {
    public static void main(String[] args) {
        // Test statistics operations
        System.out.println("Factorial of 5: " + Statistics.factorial(5));
        System.out.println("Cube of 3: " + Statistics.cube(3));

        // Test conversion operations
        System.out.println("Decimal to Binary: " + DecimalConverter.decimalToBinary(10));
        System.out.println("Decimal to Octal: " + DecimalConverter.decimalToOctal(10));
        System.out.println("Decimal to Hex: " + DecimalConverter.decimalToHex(10));

        System.out.println("Binary to Decimal: " + DecimalConverter.binaryToDecimal("1010"));
        System.out.println("Octal to Decimal: " + DecimalConverter.octalToDecimal("12"));
        System.out.println("Hex to Decimal: " + DecimalConverter.hexToDecimal("A"));
    }
}