
public class DDLInLine {
    public static void main(String[] args) {
        DDLLinkedlist ddl;
        ddl=DDLInsideDDL.main(args);
        System.out.println("The changed ddl is :");
        DDLNode currentNode;
        currentNode=ddl.firstNode;
        Loops(currentNode);
        currentNode=ddl.firstNode;
        while(currentNode!=null)
        {
            System.out.print(currentNode.name+"\t");
            currentNode=currentNode.next;
        }
    }
    public static void Loops(DDLNode currentNode)
    {
        DDLNode nextNode;
        DDLNode endNode;
        while(currentNode.next!=null)
        {
            if(currentNode.new1!=null)
            {
                nextNode=currentNode.next;
                endNode=Theloops(currentNode.new1.firstNode);
                currentNode.new1.firstNode.prev=currentNode;
                currentNode.next=currentNode.new1.firstNode;
                endNode.next=nextNode;
                nextNode.prev=endNode;
                currentNode=currentNode.next;
            }
            else
            currentNode=currentNode.next;
        }
    }
    public static DDLNode Theloops(DDLNode curNode)
    {
        while(curNode.next!=null)
        {
            curNode=curNode.next;
        }
        return curNode;
    }
}
