//   \d - Any digit
//  \D- any non-digit
//  \s - anywhitespace
//  \S-anynonwhitespace
//  \w-any word caracter
//  \W any none word character
//  \b a word bountry 
//  \B a non word boundry








import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        // sc.nextLine();
       String mainStr= str.replaceAll("[\\W&&\\D]","").toLowerCase(); // or [^A-Za-z0-9]
       System.out.println(mainStr);
        int flag=0,p=0;
        int q=mainStr.length()-1;
        while(p<q)
        {
            if(mainStr.charAt(p)==mainStr.charAt(q))
            {
                p++;
                q--;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Not a Palindrome");
        }
        else{
            System.out.println("is a Palindrome");
        }






        sc.close();
    }
}