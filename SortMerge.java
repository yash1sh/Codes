import java.util.Arrays;

public class SortMerge {
    public static void small(int arr[],int p,int q)
    {
        int temp=0;
        if(q>=arr.length)
            return;
        else if(arr[p]>arr[q])
        {
            temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;
            small(arr,q,++q); 
        }
        else   
        small(arr,p,++q);
        
    }
    public static void main(String[] args) {
        int temp;
        int arr[]={1,6,10,22,25,-1,-1,-1,-1};
        int arr1[]={3,4,21,27};
        int p=0,q=0;
        while(p<arr.length)
        {
             if(arr[p]==-1)
            {
                temp=arr[p];
                arr[p]=arr1[q];
                arr1[q]=temp;
                // arr[p]^=arr1[q]^=arr[p]^=arr1[q];
                q++;p++;
            }
            else if(arr[p]>arr1[q])
            {
                temp=arr[p];
                arr[p]=arr1[q];
                arr1[q]=temp;
                small(arr1,0,0);
            }
            else if(arr[p]<=arr1[q])
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
