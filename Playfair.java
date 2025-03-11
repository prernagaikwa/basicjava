
import java.util.*;
public class Playfair {
    static int size =30;
    static void lowercase(char plain[],int ps)
    {
        int i;
        for(i=0;i<ps;i++){
            if(plain[i] >64 && plain[i]<91)
            plain[i] += 32;
        }
    }

static int removeSpaces(char[] plain,int ps)
{
    int i,count=0;
    for(i=0;i<ps;i++)
    if(plain[i] !='\u0000')
    plain[count++] = plain[i];

    return count;
}
static void generatekeytable(char key[],int ks,char keyT[][])
{
    int i,j,k,flag=0;
    int dicty[]=new int[26];
    for(i=0;i<ks;i++]{
        if (key[i]!='j')
        dicty[key[i]-97]=2;
    }
    dict
}    
}
