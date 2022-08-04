import java.util.Scanner;
//A better recurrion from the tail factorial where you see is that in the normal recurrsion fuction is waiting for a value to be returned so we have a space complexcity of O(N) where in tail recurrion we just calling the function and not returning we nit waiting for the 1 function to complete 
public class TailRecurssion {
    public static void main(String[] args) {
        int r;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the factorial number ");
        int val=sc.nextInt();
        r=tailfact(val,1);
        System.out.println(r);
        sc.close();
    }
    public static int tailfact(int x,int totalsoFar)
    {
        if(x==0)
            return totalsoFar;
        else
        return tailfact(x-1,totalsoFar*x);
    }
}
