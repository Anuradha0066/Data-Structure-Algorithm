package Linked_List;

public class Linked_list {
    public static void main(String[] args) {
        Node node1=new Node();
        Node node2=new Node();
        node2.value=2;
        node2.next=null;
        node1.value=1;
        node1.next=node2;
        System.out.println(node1.next.value);
    }
}

class Node{
    public int value;
    public Node next;
}
