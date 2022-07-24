import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWithPositionUsingLibrary {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=10;i++)
            list1.add(i);
        System.out.println("Enter the value for m and n");
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        int data;
        int i=0;
        System.out.println("Elements before rerverse at given position");
        for(int j=0;j<list1.size();j++)
            System.out.print( list1.get(j)+"\t");
        System.out.println();
        while(i<list1.size())
        {
            if(i==m)
            {
                while(m<n)
                {
                    data=list1.get(m);
                    list1.set(m,list1.get(n));
                    list1.set(n,data);
                    m++;n--;
                }
                break;
            }
            else
                i++;
        }
        System.out.println("Elements after reverse");
        for(i=0;i<list1.size();i++)
        System.out.print( list1.get(i)+"\t");
    }
    
}
