import java.util.*;
public class Javabasic3{
    public static void main(String args[]){
//         int a,b,sum;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();

//        b = sc.nextInt();
       
//         sum = a+b;
//        System.out.println(sum);
  //  char a='a';
  //  char b='b';
  //  System.out.println((int)(a));
  //  System.out.println((int)(b));
  //  System.out.println(b-a);
  
  // arithmatic oprator

  // int A=5;
  // int B=10;
  // System.out.println("add:"+(A+B));
  // System.out.println("sub:"+(A-B));
  // System.out.println("mul:"+(A*B));
  // System.out.println("div:"+(B/A));
  // System.out.println("nod:"+(B%A));


//  unary oprator
// int A =10;
// int B= A--;
// System.out.println(B);

// Relation oprator
// int A=10;
// int B=5;
// System.out.println(A==B);
// System.out.println(A!=B);
// System.out.println(A>B);
// System.out.println(A<B);
// System.out.println(A>=B);
// System.out.println(A<=B);


// int age =20;
// if(age > 18){
//   System.out.println("able to vote");
// }
// else{
//   System.out.println("not able to vote");
// }

// if else styatement

// Scanner sc=new Scanner(System.in);
// int income = sc.nextInt();
// int tax;
//  if(income <500000){
//   tax=0;
//  }
//  else if(income >=50000 && income<=100000){
//   tax =(int)(income*0.2);
//  }

//  else{
//  tax=(int)(income*0.3);
//  }
//  System.out.println("tax is:" +tax);


// }
// }


// largest of 3 number
// System.out.println("enter values of a,b,c:");
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// if(a>b && a>c){
//   System.out.println("a is largest");
// }
// else if(b>a && b>c){
//   System.out.println("b is largest");
// }
// else{
//   System.out.println("c is largest");
// }

// ternary oprator
// int n=4;
// String type = ((n % 2)==0) ? "even": "odd";
// System.out.println(type);


// Switch cases
// System.out.println("enter the day number");
// Scanner sc=new Scanner(System.in);
// Boolean day =sc.newBoolean();
// int day=5;
// switch(day){
//   case 1:
//        System.out.println("its sunday");
//       break;
//   case 2 :
//         System.out.println("its monday");
//         break;
//   case 3:
//         System.out.println("its thusday");
//         break;
//   case 4:
//         System.out.println("its wensday");
//        break;
//   case 5:
//         System.out.println("its thrusday");
//         break;
//   case 6:
//         System.out.println("its friday");
//         break;
//   case 7:
//         System.out.println("its saturday");
//         break;
//       default:
//       System.out.println("its not a day");

//     }


//while loop in java
// int counter =1;
// while(counter <10){
//   System.out.printf(counter);
//   counter ++;
// }
//print 1 to 10
// int c=1;
// while(c<=10){
//   System.out.println(c);
//   c++
//   ;
// }
// int number;
// Scanner sc=new Scanner(System.in);
// number =sc.nextInt();
// int counter =1;
// System.out.println("enter the number value");
// while (counter <= number){
//   System.out.println(counter);
//   counter++;
// }
//sum of first natural number
//   Scanner sc = new Scanner(System.in);
//   int n =sc.nextInt();
//   int sum =0 ;
//   int i =1;
//   while ( i <= n){
//     sum += i;
//     i++;
// }

//for loop
// for(int i=1; i<=5; i++){
//   System.out.println(i);
// }
//square pattern
// for(int i=1; i<=4 ; i++){
//  // for(int j=; j<=4 ; j++){
//     System.out.println("****");
//  // }
// }

//reversing the number
//Scanner sc =new Scanner(System.in);
  //    int n=172004;
  //    while(n>0){
  //     int lastdigit = n % 10 ;
  //     System.out.println(lastdigit + " ");
  //     n = n/10;
  //    }
  //    System.out.println();



  //do while loop
  // int c=1;
  // do{
  //   System.out.println("hii");
  //   c++;
  // }while(c <= 10);

  //break  and continue statement
// for ( int i=0 ; i<= 10 ; i++){
//   if (i ==5){
//     continue;
//   }
//   System.out.println(i);
// }
//for prime number
// Scanner sc=new Scanner (System.in);
// int n = sc.nextInt();
// boolean isPrime = true;
// for(int i=2;i<=n-1;i++){
//   if(n % i ==0){
//     isPrime =false ;
//   }
// }
// if(isPrime == true){
//   System.out.println("n is prime");
// }
// else{
//   System.out.println("n is not  prime");
// }





//factorial for given number
// Scanner sc =new Scanner(System.in);
// int n= sc.nextInt();
// int fact =1;
// for (int i =1;i<=n;i++){
//   fact *=i;
// }
// System.out.println("factorial:" + fact);

// multiplication number
// Scanner sc =new Scanner(System.in);
// int n= sc.nextInt();

// for (int i =1;i<=10;i++){
// System.out.println(n +"*"+i+"="+n*i);
// }

//print  star pattern 

// for(int line =1 ; line <=4; line++){
//   for(int star=1; star <= line ; star++){
//     System.out.print("*");
//   }
//   System.out.println();
// }


//print inverse star pattern 
// int n =4;
// for(int line =1 ; line <=4; line++){
//   for(int star=1; star <= (n - line +1) ; star++){
//     System.out.print("*");
//   }
//   System.out.println();
// }

//to print half pyramid

// int n=4;
// for(int line =1 ; line <=4; line++){
//   for(int number=1; number <= n-line+1  ; number++){
//     System.out.print(number);
//   }
//   System.out.println();
// }


//print character pattern 
// int n =4;
char ch='A';
for(int i=1 ; i <=n; i++){
  for(int  j=1; j <= i ; j++){
    System.out.print(ch);
    ch++;
  }
  System.out.println();
}



 }
}
