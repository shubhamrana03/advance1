import java.util.*;
class node
{
 
 node head = null;
 int data;
 node next;
 node prev;
public node()
{
 this.data=0;
 this.next= null;
 this.prev= null;
}
public node(int data1)
{
 this.data=data1;
 this.next= null;
 this.prev= null;
}

public node add(int data)
{
  node a = new node(data);
  if(head == null)
{
head=a;
}

else
{ 
 node temp = head;
   while(temp.next!=null) //tb tak chlega jb tk use next me null nahi mila
{
 temp=temp.next;
 // temp.prev=head;
}

temp.next=a;
//a.prev=temp;
}
return head;

}

public void printlist(node head)
{
 node temp=head;
 node pre = null;
while(temp!=null)
{
 
pre=temp;
 System.out.print(temp.data);
 System.out.println();
temp=temp.next;
}
/*System.out.println("Reverse");
while(pre!=null)
{
 

 System.out.println(pre.data);
pre=pre.prev;
}*/


}
}

public class doublelist
{
public static void main(String[] args) 
{
node l = new node();
 Scanner in = new Scanner(System.in);
 int d;
 d = in.nextInt();
 node h=null;
 while(d!=0)
{
int n=in.nextInt();
 h=l.add(n);
 d--;
}
 System.out.println("Answer is");

l.printlist(h);
}
}