public class MathOperations {
   
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

   
    public static int cube(int num) {
        return num * num * num;
    }
}


package convert;

public class Converter {
    // Decimal to Binary conversion
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Decimal to Octal conversion
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // Decimal to Hex conversion
    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal);
    }

    // Binary to Decimal conversion
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    // Octal to Decimal conversion
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    // Hex to Decimal conversion
    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
}
import convert.Converter;

public class main {
    public static void main(String[] args) {
      
        System.out.println("Factorial of 5: " + MathOperations.factorial(5));
        System.out.println("Cube of 3: " + MathOperations.cube(3));

        
        int decimalNumber = 42;
        String binary = Converter.decimalToBinary(decimalNumber);
        String octal = Converter.decimalToOctal(decimalNumber);
        String hex = Converter.decimalToHex(decimalNumber);

        System.out.println(decimalNumber + " in binary: " + binary);
        System.out.println(decimalNumber + " in octal: " + octal);
        System.out.println(decimalNumber + " in hexadecimpal: " + hex);

        String binaryNumber = "101010";
        String octalNumber = "52";
        String hexNumber = "2A";

        System.out.println(binaryNumber + " in decimal: " + Converter.binaryToDecimal(binaryNumber));
        System.out.println(octalNumber + " in decimal: " + Converter.octalToDecimal(octalNumber));
        System.out.println(hexNumber + " in decimal: " + Converter.hexToDecimal(hexNumber));
    }
}
}