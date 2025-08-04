package Traversal;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
 
static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
    }
}

static class Build{
  static int id=-1;

  public static Node buildNode(int[] arr){
    id++;
    if(arr[id]==-1){
        return null;
    }
    Node newNode=new Node(arr[id]);
    newNode.left=buildNode(arr);
    newNode.right=buildNode(arr);
    return newNode;
  }

  static void preorder(Node root){
    if(root==null){
        return ;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }


 static void postorder(Node root){
    if(root==null){
        return ;
    }
   
    postorder(root.left);
    postorder(root.right);
     System.out.println(root.data);
  }

  static void inorder(Node root){
    if(root==null){
        return ;
    }
  
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
  }


[1,2,3,34,54,56]
  static void LevelWise(Node root){
      if(root==null){
        return ;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        Node cuNode=   q.poll();
        System.out.println(cuNode.data);
        if(cuNode.left!=null){
          q.add(cuNode.left);

        }
           if(cuNode.right!=null){
          q.add(cuNode.right);

        }

      
    }


  }
   public static void main(String[] args) {
    int[] arr={1,2,4,-1,-1,-1,3,-1,-1};
  
    Node root=Build.buildNode(arr);
    inorder(root);

}
 
 
}

 

}
