//Conside a string find the highest substring present in the string where char in that substring are not repeated

import java.util.*;
class HighestSubString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        HashMap <Character,Integer> hmap=new HashMap<>();
        int left=0,length=0;
        if(str.length()<=1)
            System.out.println("1");
        for(int right=0;right<str.length();right++)
        {
            if(hmap.containsKey(str.charAt(right)))
            {
                left=right;
                hmap.clear();
            }
            else{
                hmap.put(str.charAt(right),right);
            }
            length=Math.max(length, right-left+1);
            
        }
        System.out.println(length);

sc.close();

    }
}
