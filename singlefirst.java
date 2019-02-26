import java.util.*;
class node
{
 node head = null;
 int data;
 node next;
public node()
{
 this.data=0;
 this.next= null;
}
public node(int data1)
{
 this.data=data1;
 this.next= null;
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
   while(temp.next!=null) //tb tak chlega jb tk use next me null nahi mil jata.
{
 temp=temp.next;
}

temp.next=a;
}
return head;
}
public node addfirst(int data1)
{
   node a1 = new node(data1);
   a1.next=head;
   head=a1;
   return head;
}

public void printlist(node head)
{
 node temp=head;
while(temp!=null)
{
 

 System.out.print(temp.data);
 System.out.println();
temp=temp.next;
}
}
}

public class singlefirst
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
 System.out.println("Enter element to be adjusted at first");
 int q=in.nextInt();
 h = l.addfirst(q); 
  System.out.println("After adding");
  l.printlist(h);



}
}