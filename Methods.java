//public class Methods {
    //Simple method creation
//     public void Printmessage(){
//         System.out.println("prernas here");
//     }
//    public static void main(String[] args){
//     Methods m1 = new Methods();
//     m1.Printmessage();
//    }  
// }


//static method 
//this static method is belong to the class only not nedd to create object example school name is same for all student but student owns name is diff for all stud
// class Student{
//     static String SchoolName = "ABC School";
//     String StudentName;

//     public void display(){
//         System.out.println(StudentName +" Studied in " + SchoolName);
//     }
// }
//     public class Methods {
//         public static void main(String[] args){
//             Student s1 = new Student();
//             s1.StudentName = "Prerna";
//             s1.display();
//         }
//     }

//anothe static method programm
//class Hospitals{
//  static String HospitalName = "Patil Hospital";
//     String DoctorName ;

//     void display(){
//         System.out.println(DoctorName + "working in " + HospitalName);
//     }
// }
// public class Methods{
//     public static void main(String[] args){
//         Hospitals h1 = new  Hospitals();
//         h1.DoctorName ="prerna";
//         h1.display() ; 
//     }
// }

class Calculator{
    static int addition(int a , int b){
        return a + b ;
    }
    static int substraction(int a , int b){
        return a - b ;
    }
    static int multiplication(int a , int b){
        return a * b ;
    }
}
public  class Methods{
    public static void main(String[] args){
        
        int sum = Calculator.addition(10,5);
        int sub = Calculator.substraction(10,5);
        int multi = Calculator.multiplication(10,5);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
    }
}
