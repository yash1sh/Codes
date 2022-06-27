//Consider a array of number each array conatins the height and these heights is like a wall which can fill water we have to find a 2 numbers which can store the large amount of water by giving the area so lets think 4 1 2 3 9 is an array to find the the area we use height x width which will give me the area so the area is 36 as 4 and 9 stores the high water


public class Container {
    public static void main(String[] args) {
        int arr[]={4,8,1,2,3,9};
        int i=0,j=arr.length-1;
        int area=0;
        while(i<j)
        {
            if(area<(Math.min(arr[i], arr[j])*(j-i)))
                area= Math.min(arr[i], arr[j])*(j-i);
            if(arr[i]<arr[j])
                i++;
            else
            j++;
        }

        System.out.println(area);


    }
}
