public class Vowel{

public static void main(String args[]){

try{

checkForVowels("Hello");

System.out.println("No exception thrown, the string contains vowels.");

}

catch (Exception e){

System.out.println("Exception caught: String does not contains vowels!");

}

}

public static void checkForVowels(String input) throws Exception{ if(! input.matches(".* [aeiouAEIOU].*"))

throw new Exception("String does not contail vowels!");

}

}