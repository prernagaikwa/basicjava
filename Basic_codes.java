import java.io.*;
import java.util.*;
class Basic_codes{


  // public static void main(String[] args){
  //   int num;
  //   System.out.println("enter the number:");
  //   Scanner sc = new Scanner(System.in);
  //   num  = sc.nextInt();
  //   System.out.println("Entered number is:");
  //   sc.close();
  // }


 public static void printPattern(int n)
    {
        int i, j;
        
        //outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            //inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }

            //printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(Stringuserinput args[])
    {
        int n = 6;
        printPattern(n);
    }

}