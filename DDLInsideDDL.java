import java.util.Scanner;

class DDLNode
{
    Object name;
    DDLNode prev;
    DDLNode next;
    DDLLinkedlist new1;

    DDLNode(Object item)
    {
        this.name=item;
        this.prev=null;
        this.next=null;
        this.new1=null;
    }

}

class DDLLinkedlist
{
    String space="\t";
    int spaces=0;
    Object item;
    boolean exit=true;
    int x,j,ch;
    DDLNode firstNode;
    DDLNode lastNode;
    DDLNode currentNode;
    Scanner sc=new Scanner(System.in);
    public void insertAtFront(Object item)
    {
        if(firstNode==null)
            firstNode=lastNode=new DDLNode(item);
        else
        {
            currentNode=new DDLNode(item);
            currentNode.next=firstNode;
            firstNode.prev=currentNode;
            firstNode=currentNode;
        }

    }
    public void insertAtBack(Object item)
    {
        if(firstNode==null)
            firstNode=lastNode=new DDLNode(item);
        else{
            currentNode=new DDLNode(item);
            currentNode.prev=lastNode;
            lastNode.next=currentNode;
            lastNode=currentNode;
        }
    }
    public void insertnewInnerDDL()
    {
        j=1;
          System.out.println("Enter the position at which you wnt to start a ddl");
          x=sc.nextInt();
          currentNode=firstNode;
          while(currentNode!=null)
          {
            if(j==x)
            {
                currentNode.new1 = new DDLLinkedlist();
                while(exit)
                {
                    System.out.println("\nEnter choice\n 1)insert At beg \n 2) insert at end \n 3)new ddl \n4)end of this ddl");
                    ch=sc.nextInt();
                    switch(ch)
                    {
                        
                        case 1: System.out.println("enter the item");
                                item=sc.next();
                                currentNode.new1.insertAtFront(item);
                                break;
                        case 2: System.out.println("enter the item");
                                item=sc.next();
                                currentNode.new1.insertAtBack(item);
                                break;
                        case 3: currentNode.new1.insertnewInnerDDL();
                                break;
                        case 4: exit=false;
                                break;
                        default: System.out.println("Invalid Input");
                    }
                }
                currentNode=currentNode.next;
            }
            else{
                currentNode=currentNode.next;
                j++;
            }
          }
    }
    public void printDDL()
    {

        System.out.print("List is : ");
        Theloops(firstNode);

    }
    public void Theloops(DDLNode newlist)
    {
        System.out.println();
        currentNode=newlist;
        for(int i=0;i<spaces;i++)
            System.out.print(space);
        while(currentNode!=null)
        {
            System.out.print(currentNode.name+"\t");
            currentNode=currentNode.next;
        }
        currentNode=newlist;
        while(currentNode!=null)
        {
            
            if(currentNode.new1!=null)
            {
                currentNode=currentNode.new1.firstNode;
                Theloops(currentNode);
            }
            else{
                spaces++;
                currentNode=currentNode.next;
            }
        }
    }
}

class DDLInsideDDL{
    public static void main(String[] args) {
        boolean exit=true;
        int ch;
        Object item;
        Scanner sc=new Scanner(System.in);
        DDLLinkedlist ddl = new DDLLinkedlist();
        while(exit)
        {
            System.out.println("\nEnter the choice \n1)insert at front \n 2)insert at back \n 3)insert a new ddl\n 4)Print all dll\n5)exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the value");
                        item=sc.next();
                        ddl.insertAtFront(item);
                        break;
                case 2: System.out.println("Enter the value");
                        item=sc.next();
                        ddl.insertAtBack(item);
                        break;
                case 3: if(ddl.firstNode==null)
                        {
                            System.out.println("No ddl formed");
                            break;
                        }
                        else{
                            ddl.insertnewInnerDDL();
                        }
                        break;
                case 4: if(ddl.firstNode==null)
                        {
                            System.out.println("no ddl found");
                            break;
                        }
                        else
                        ddl.printDDL();
                        break;
                case 5: exit=false;
                        break;
                default: System.out.println("Invalid input");
            }
        }
        sc.close();
    }
}

