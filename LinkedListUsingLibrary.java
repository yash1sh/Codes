import java.util.*;
public class LinkedListUsingLibrary {
    public static void main(String[] args) {
        int ch,value;
        boolean exit=true;
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(exit)
        {
            System.out.println("Enter the number operation you want to do \n1) add \n2)remove \n3) Contains \n4)Reverse \n5)print 6)clear \n7)exit ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the value integer only");
                    value=sc.nextInt();
                    list.add(value);
                    break;
                case 2:
                    if(list.isEmpty())
                    {
                        System.out.println("List is empty");
                    }
                    else{ 
                        System.out.println("select choice 1)index 2) value");
                        value=sc.nextInt();
                        if(value==1)
                        {
                            System.out.println("Enter the index val");
                            value=sc.nextInt();
                            list.remove(value);
                        }
                        else{
                            System.out.println("Enter the value");
                            value=sc.nextInt();
                            list.remove(Integer.valueOf(value));
                        }
                        System.out.println("Removed....");
                    }
                    break;
                case 3:System.out.println("Enter the value to check if it contains");
                        value=sc.nextInt();
                        if(list.contains(value))
                            System.out.println(value +" contains");
                        else
                            System.out.println(value+" does not contains");
                        break;
                case 4: int first=0;
                        int last=list.size()-1;
                        
                        while(first<last)
                        {
                            value=list.get(last);
                
                            list.set(last, list.get(first));

                            list.set(first, value);

                            first++;
                            last--;
                        }
                case 5:if(list.isEmpty())   System.out.println("List is empty");
                        else{
                        System.out.print("List values are : ");
                        for(int i=0;i<list.size();i++)
                            System.out.print( list.get(i)+"\t");;
                        System.out.println();
                        }
                        break;
                case 6: list.clear();
                        System.out.println("List is been cleared ");
                        break;
                case 7:exit=false;
                            break;
                
                default:System.out.println("Invalid input");
            }
        } 
        sc.close();     
    }
}
