import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;


//{[(]}-Not valid {[()]()}- valid 


public class stringCorrect {
    public static void main(String[] args) {
        Stack<Character> st= new Stack<>();
        boolean flag=true;
        String str;
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put(']', '[');
        hm.put('}','{');
        hm.put(')','(');
        hm.put('>','<');
        Scanner sc= new Scanner(System.in);
        Pattern left = Pattern.compile("[\\[\\{\\<\\(]");
        Pattern right = Pattern.compile("[\\]\\}\\>\\)]");
        System.out.println("Enter the String");
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            
            if(left.matcher(""+str.charAt(i)).matches())
            {
                st.push(str.charAt(i));
            }
            else if(right.matcher(""+str.charAt(i)).matches())
            {

                if(st.peek()==hm.get(str.charAt(i)))
                    st.pop();
                else
                    flag=false;
            }
        }
        if(flag)
        System.out.println("The string is proper");
        else
        System.out.println("String is not proper");
        sc.close();
        
        
    }
}
