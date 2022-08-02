import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> qe= new PriorityQueue<>();
        int a[]={9,8,7,6,5,4,3,2,1};
        for(int i=0;i<a.length;i++)
            qe.add(a[i]);
        System.out.println(qe);
    }
}
