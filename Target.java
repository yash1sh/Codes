//In an array get the index of 2 numbers which add up the target
//Example [1,2,3,4,5] array target is 9 then 3 and 4 is the index 

import java.util.*;
class Target
{
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int target;
        System.out.println("enter the target");
        target=sc.nextInt();
        int value;

        HashMap<Integer,Integer> hMap=new HashMap<>();

        for(int p=0;p<arr.length;p++)
        {
            if(hMap.containsKey(arr[p]))
            {
                System.out.println("The value is "+hMap.get(arr[p])+ " "+p);
            }
            else
            {
                hMap.put(target-arr[p], p);
            }
        }
        

        

    }
}