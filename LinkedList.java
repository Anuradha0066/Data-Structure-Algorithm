// package Linked_List;

// public class linkedlist {
//  class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
//  }
 
//    public class Innerlinkedlist {
//     Node head;
//     public void addTofirst(int data){
//    Node newNode=new Node(data);
//        if(head==null){
//         head = newNode;
//         return;
//        }
//        newNode.next=head;
//        head=newNode;

//     }
//     public void addToLast(int data){
//    Node newNode=new Node(data);
//        if(head==null){
//         head = newNode;
//         return;
//        }
//     }

//     void display(){
//         Node temp=head;
//         if(temp!=null){
//             System.out.println(temp.data+"->");
//             temp=temp.next;
//         }
//     }

//     //public void 
    
//     public static void main(String[] args) {
//         linkedlist list=new linkedlist();
//         list.addTofirst(10);
//     }


    
//    } 
 

   
  
// }


package Linked_List;

public class LinkedList {
    
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }

    Node head;

    public void addToFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addToLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void deleFromfirst(){
        head=head.next;
    }
     public void delete(){
        head=head.next;

    }
     public void deleFromLast(){
       if(head.next==null){
        head=null;
        return;
       }
       Node temp=head;
       while(temp.next.next ==null){
        temp=temp.next;
       }
     //  temp.next=null;

    }
    public void Search(int data){
        Node curr=head;
        while(curr!=null){
            if(curr.data==data){
                System.out.println("Data found  "+data);
                return;
            }
            curr=curr.next;
        }
    }
    public void mid(){
        if(head==null){
            return;
        }
        Node t1=head;
        Node t2=head;
        while(t2 != null){
            t1=t1.next;
            t2=t2.next.next;

        }
        System.out.println("middle: "+t1.data);
    }

    public void dupli(){
        Node temp=head;
        while (temp != null && temp.next!= null) {
           if (temp.data==temp.next.data) {
           temp.next=temp.next.next;
              
        }
        else{
           temp= temp.next;
        }
       
        }
         temp=head;
         while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
         System.out.println("null"); 
       
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void evenOdd(){
        Node temp=head;
       while (temp != null) {
        if(temp.data%2==0){
            System.out.println("Even: "+temp.data);
        }
        else{
            System.out.println("odd "+temp.data);
        }
        temp=temp.next;
    }
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFirst(1);
        list.addToLast(5);
        list.addToLast(5);
        list.addToLast(30);
       
        // list.deleFromfirst();
        // list.deleFromLast();
         //list.Search(10);
        list.display();
        list.evenOdd();  
       // list.dupli();
       // list.mid();
        
    }
}
