import java.util.Scanner;

public class typeExtra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0,x=1,count=0;
        while(x<=n)
        {
            if(x*x>b)
            {
                a=x;
                b=b+x*x;
                count++;
                x++;
            }
            else
            x++;
        }
        System.out.println(count);
    }
}
