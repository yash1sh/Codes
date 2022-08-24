import java.util.Scanner;

class reverseWords {

    static String reverseStringWordWise(String input,int space,String str1) {
        // Write your code here
        if(space!=-1){
            str1=reverseStringWordWise( input.substring(space+1,input.length()),input.substring(space+1,input.length()).indexOf(' '),str1);
            input = input.substring(0, space);
        }

        space=input.indexOf(' ');
        if(space==-1){
            return str1+=input+" ";
        }

        return str1;
            
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1="",input = sc.nextLine();
          int space = input.indexOf(' ');
        String ans = reverseStringWordWise(input,space,str1);
      
        System.out.println(ans);
    }
}
