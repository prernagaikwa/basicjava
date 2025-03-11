import java.io.*;
public class Student {
 public static void main(String[] args) {
 try {
 // Taking student information from the user
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter student information:");
 System.out.print("Name: ");
 String name = reader.readLine();
 System.out.print("Age: ");
 int age = Integer.parseInt(reader.readLine());
 System.out.print("Weight: ");
 double weight = Double.parseDouble(reader.readLine());
 System.out.print("Height: ");
 double height = Double.parseDouble(reader.readLine());
 System.out.print("City: ");
 String city = reader.readLine();
 System.out.print("Phone: ");
 String phone = reader.readLine();
 // Storing student information in a file
 FileOutputStream fileOutputStream = new FileOutputStream("student_info.dat");
 DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
 dataOutputStream.writeUTF(name);
 dataOutputStream.writeInt(age);
 dataOutputStream.writeDouble(weight);
 dataOutputStream.writeDouble(height);
 dataOutputStream.writeUTF(city);
 dataOutputStream.writeUTF(phone);
 dataOutputStream.close();
 System.out.println("Student information stored successfully.");
//Retrieving student information from the file
 FileInputStream fileInputStream = new FileInputStream("student_info.dat");
 DataInputStream dataInputStream = new DataInputStream(fileInputStream);
 System.out.println("\nRetrieving student information:");
 System.out.println("Name: " + dataInputStream.readUTF());
 System.out.println("Age: " + dataInputStream.readInt());
 System.out.println("Weight: " + dataInputStream.readDouble());
 System.out.println("Height: " + dataInputStream.readDouble());
 System.out.println("City: " + dataInputStream.readUTF());
 System.out.println("Phone: " + dataInputStream.readUTF());
 dataInputStream.close();
 } 
 catch (IOException e) {
 e.printStackTrace();
 }
 }
}
