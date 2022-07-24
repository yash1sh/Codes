import java.util.Scanner;

//Given a list with 2 numbers m and n as positions,return it back with only positions m and n in reverse





public class ReverseWithPosition {
public static void main(String[] args) {
    list list=new list();
    for(int i=1;i<10;i++)
    list.insertAtBack(i);
    list.print();
    //Now starts the program 
    System.out.println("Enter the m and n");
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    // int x= m>1? m-1:m;
    int y=n<10? n+1:n;
    listNode extraNode=null;
    listNode currentNode=list.firstNode;
    listNode prevNode=null;
    listNode reverseNode=null;
    listNode start=null;

    while(currentNode!=null)
    {
        
        if((Integer)currentNode.name==m)
        {
            extraNode=currentNode;
            while(!((Integer)currentNode.name==(n+1)))
            {
                prevNode=currentNode;
                currentNode=currentNode.nextNode;
                prevNode.nextNode=reverseNode;
                reverseNode=prevNode;
            }
        }
        else{
            start=currentNode;
            currentNode=currentNode.nextNode;
        }
         if(((Integer)currentNode.name==y))
        {
            extraNode.nextNode=currentNode;
            start.nextNode=prevNode;
        }
    }
    list.print();
    sc.close();
}

}
//(Integer.valueOf((String)currentNode.name)