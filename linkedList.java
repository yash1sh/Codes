
class listNode{
    Object name;
    listNode nextNode;

    listNode(Object obj){
        this(obj,null);
    }
    listNode(Object obj,listNode nextNode)
    {
        this.name=obj;
        this.nextNode=nextNode;
    }
    Object getObject()
    {
        return name;
    }

    listNode get_nextNode()
    {
        return nextNode;
    }
}

class list{
    listNode firstNode;
    private listNode lastNode;
    private String name;

    public list()
    {
        this("list");
    }
    public list(String name)
    {
        this.name=name;
        firstNode=lastNode=null;
    }
    public boolean isEmpty()
    {
        return firstNode==null;
    }
    public void insertAtFront(Object item)
    {
        if(isEmpty())
            firstNode=lastNode=new listNode(item);
        else
            firstNode=new listNode(item,firstNode);
    }
    public void insertAtBack(Object item)
    {
        if(isEmpty())
            firstNode=lastNode=new listNode(item);
        else
            lastNode=lastNode.nextNode=new listNode(item);
    }
    public Object removeAtFront() 
    {
        if(isEmpty())
            System.out.println(this.name+": doest has no values");

            Object removeObject=firstNode.name;
        
            if(firstNode==lastNode)
                firstNode=lastNode=null;
            else
                firstNode=firstNode.nextNode;
        
        return removeObject;
    }

    public Object removeAtBack() 
    {
        if(isEmpty())
            System.out.println(this.name+": doest has no values");

            Object removeObject=lastNode.name;
        
            if(firstNode==lastNode)
                firstNode=lastNode=null;
            else{
                listNode Current=firstNode;
                while(Current.nextNode!=lastNode)
                    Current=Current.nextNode;
                lastNode=Current;
                Current.nextNode=null;
            }
        
        return removeObject;
    }
    
    public void print()
    {
        if(isEmpty())
        {
            System.out.println(
                "List is empty"
            );
        }
        else{
            System.out.print("The "+name+" is:");
            listNode Current=firstNode;
            while(Current!=null)
            {
                System.out.print(Current.name+"\t");
                Current=Current.nextNode;
            }
        }
        System.out.println();
    }
}


public class linkedList {


    public static void main(String[] args) {
        list list=new list();
        list.insertAtFront(1);
        list.insertAtFront(2);
        list.insertAtBack(9);
        list.insertAtFront(3);
        list.insertAtFront(4);
        list.insertAtFront(5);
        
        Object removeObject=list.removeAtFront();
        System.out.println("The removed object from front is "+removeObject);

        removeObject=list.removeAtBack();
        System.out.println("The removed object from back is "+removeObject);

        list.print();

    }
}
