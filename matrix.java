import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int max[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                max[i][j]=sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(max[i][j]+" ");
            System.out.println();}

        int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=max[i][i];
        //     sum+=max[j][i];
        //     j--;
        // }
        sum=method(max, 0, n-1, sum);
        System.out.println("Additions of the diagonals are "+sum);
        sc.close();

    
    }
    public static int method(int max[][],int i,int j,int sum)
    {
        if(i==max.length)
        return sum;
        sum+=max[i][i];
        sum+=max[j][i];
        return method(max, i+1, j-1, sum);
    }
}
