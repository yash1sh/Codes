
import java.util.Scanner;
import java.util.Stack;
//Give the valid String ie if the given string is a(bcgd(sj)dj->abcgd(sj)dj
public class StringValid {
    public static void main(String[] args) {
        int val;
        Stack<Integer> st= new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        char res[]=str.toCharArray();
        for(int i=0;i<res.length;i++)
        {
            if(res[i]=='('){
                st.push(i);}
            else if(res[i]==')')
            {
                if(!st.empty())
                    st.pop();
                else
                    res[i]=' ';
            }
        }
        while(!st.empty()){
            val=st.pop();
            res[val]=' ';
        }
        System.out.print("The valid String is : ");
        for(int i=0;i<res.length;i++)
        {
            if(res[i]!=' ')
            System.out.print(res[i]);
            else
                continue;
        }
        sc.close();
    }
}
