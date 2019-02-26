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
head.next=head;
}

else
{ 
   //node tem = head;
 node temp = head;
   while(temp.next!=head) //tb tak chlega jb tk use next me null nahi mila
{
 temp=temp.next;
 //temp.next=head;
 
}

temp.next=a;
a.next=head;

}
return head;

}

public void printlist(node head)
{
 node temp=head;
while(temp.next!=head)
{
 

 System.out.print(temp.data);//always use it because no value so cannot point back.
 System.out.println();
temp=temp.next;
}
System.out.println(temp.data);
System.out.println(temp.next.data);
System.out.println(temp.next.next.data);

}
}

public class singlecircular
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