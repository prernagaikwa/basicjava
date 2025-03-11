import java.util.Scanner;
class CaesarCipher
{
   
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer sc= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 65) % 26 + 65);
                sc.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 97) % 26 + 97);
                sc.append(ch);
            }
        }
        return sc;
    }

    public static void main(String[] args)
    {
        String text = "MANAGEMENT";
        int s = 5;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
}


