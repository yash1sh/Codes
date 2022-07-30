import java.util.HashMap;
import java.util.Scanner;

//Check if a liked list has a cycle or not 


public class cycleLinkedList {
    
    public static void main(String[] args) {
        list list=new list();
        int ch,val=0,i=1;
        boolean exit=true;
        HashMap<Integer,Integer> hm= new HashMap<>();
        Scanner sc= new Scanner(System.in);
        listNode curt;
        while(exit)
        {
            System.out.println("Enter the choice 1)insert 2)end");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the value");
                val=sc.nextInt();
                list.insertAtBack(val);
                break;
                case 2: exit=false;
                    break;
                default:System.out.println("Invalid input");
            }
        }
        curt=list.firstNode;
        while(curt.nextNode!=null)
        {
            if(hm.containsKey((Integer)curt.name)){
                val=hm.get((Integer)curt.name);
                break;
            }
            else{
                hm.put((Integer)curt.name, i++);
                curt=curt.nextNode;
            }
        }
        list.print();
        System.out.println("The Cycled list Starts with :"+val);
        sc.close();
    }
    
}


//Floyds tortoise and hare algo
//herenwe use both of them as a pointer where 1 moves 1 step and other  moves 2 steps

//while(tortoise.next!=null && hare!=null)
// {
//     while(tortoise!=hare)        //When the hare and the tortoise becomes the same that means that the list is a cyclic list 
//     {
//         tortoise=tortoise.nextNode;      
//         hare=hare.nextNode.nextNode;
//     }
//     gotNode=tortoise;      //here we get a position 
// }
// newNode=firstNode;
// while(newNode!=gotNode) //Taking a new pointer which starts from the start and then we get the position of the cyc started
// {
//     newNode=newNode.nextNode;
//     gotNode=gotNode.nextNode;
// }
// sysout("Printing the index of got node"+gotNode);


