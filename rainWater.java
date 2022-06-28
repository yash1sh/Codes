//giver int array represents elevation map where thr width of each map is 1 return how much rainwater  can trap


public class rainWater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,3,1,0,1,2};
        int waterStored=0;
        int maxLeft=0,maxRight=0;
        int leftPointer=0;
        int rightPointer=arr.length-1;
        while(leftPointer!=rightPointer)
        {
            if(arr[leftPointer]<=arr[rightPointer])
            {
                if(arr[leftPointer]<maxLeft)
                    waterStored+=maxLeft-arr[leftPointer];
                else if(arr[leftPointer]>=maxLeft)
                    maxLeft=arr[leftPointer];
                leftPointer++;
            }
            else if(arr[leftPointer]>arr[rightPointer])
            {
                if(arr[rightPointer]<maxRight)
                    waterStored+=maxRight-arr[rightPointer];
                else if(arr[leftPointer]>=maxRight)
                    maxRight=arr[rightPointer];
                rightPointer--;
            }
        }
        System.out.println(waterStored);
    }
}
