import java.util.Scanner;

public class MultiplicativeInverse {

   
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    
    static int extendedGCD(int a, int b, int[] x, int[] y) {
        if (a == 0) {
            x[0] = 0;
            y[0] = 1;
            return b;
        }

        int[] newX = new int[1];
        int[] newY = new int[1];
        int gcd = extendedGCD(b % a, a, newX, newY);

        x[0] = newY[0] - (b / a) * newX[0];
        y[0] = newX[0];

        return gcd;
    }

   
    static int multiplicativeInverse(int a, int m) {
        int[] x = new int[1];
        int[] y = new int[1];
        
        int gcd = extendedGCD(a, m, x, y);

  
        if (gcd != 1) {
            System.out.println("Multiplicative inverse does not exist.");
            return -1;
        }

       
        int inverse = (x[0] % m + m) % m;

        return inverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = scanner.nextInt();

        System.out.print("Enter modulus: ");
        int m = scanner.nextInt();

        int inverse = multiplicativeInverse(a, m);

        if (inverse != -1) {
            System.out.println("The multiplicative inverse of " + a + " modulo " + m + " is: " + inverse);
        }

        scanner.close();
    }
}
