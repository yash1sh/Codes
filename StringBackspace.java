import java.util.*;


public class StringBackspace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first,second,newFirst="",newSecond="";
        System.out.println("Enter the first String");
        first=sc.next();
        System.out.println("Enter the second String");
        second=sc.next();
        int val= first.length() < second.length() ? second.length():first.length();
        System.out.println(val);
        for(int i=0;i<val;i++)
        {
            if( i<first.length() && first.charAt(i) == '#' )
            {
                newFirst=newFirst.substring(0,newFirst.length()-1);
            }
            else if(i<first.length())
            {
                newFirst+=first.charAt(i);
            }
            if(i<second.length() && second.charAt(i) == '#'  )
            {
                newSecond=newSecond.substring(0,newSecond.length()-1);
            }
            else if(i<second.length())
            {
                newSecond+=second.charAt(i);
            }

            
        }
        
        if(newFirst.equals(newSecond))
        {
            System.out.println("Strig are same");
        }
        else{
            System.out.println("String are note same ");
        }
        
    }
}
