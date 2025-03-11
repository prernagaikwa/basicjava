import java.io.*;
public class FileManipulation {
public static void main(String[] args) {
if (args.length == 0) {
System.out.println("Please provide the filename as an argument.");
return;
}
String filename = args[0];
File file = new File(filename);
try (BufferedReader reader = new BufferedReader(new FileReader(file));
BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
if (file.exists()) {
System.out.println("File contents:");
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
System.out.println("Do you want to add data at the end of the file? (Yes/No)");
BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
String response = inputReader.readLine();
if (response.equalsIgnoreCase("Yes")) {
System.out.println("Enter data to append (type 'exit' to stop):");
while (true) {
String newData = inputReader.readLine();
if (newData.equalsIgnoreCase("exit")) {
break;
}
writer.write(newData);
writer.newLine();
}
System.out.println("Data appended successfully.");
} else {
System.out.println("Exiting the program.");
}
} else {
System.out.println("File does not exist. Creating a new file.");
if (file.createNewFile()) {
System.out.println("File created successfully.");
System.out.println("Enter data to write into the file (type 'exit' to stop):");
BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
while (true) {
String newData = inputReader.readLine();
if (newData.equalsIgnoreCase("exit")) {
break;
}
writer.write(newData);
writer.newLine();
}
System.out.println("Data written successfully.");
} else {
System.out.println("Failed to create the file.");
}
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
