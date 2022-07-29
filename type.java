import java.util.Scanner;

public class type {
    public static void main(String[] args) {
        int[] a;
        int n,k;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         k=sc.nextInt();
        a=new int[n];
        for(int r=0;r<n;r++)
            a[r]=sc.nextInt();
        int i=0,j=i+1,max=0,exI=0,exJ=0;
        while(i<n-1 && j<n)
        {
            if((j+1-i+1)<=k){
            if(max<(a[j]-a[i])){
                max=a[j]-a[i];
                exI=i+1;
                exJ=j+1;
        System.out.println(exI+" "+exJ+" max"+max);
                j++;
            }
            else
                j++;}
            else
            {
                i++;
                j=i+1;
            }
        }
        int res=exJ-exI;
        System.out.println(exI+" "+exJ+" max"+max);
        System.out.println(res);
        sc.close();
    }
}
