package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
  int sc;
  int des;
  int w;

  public Node(int sc, int des, int w) {
    this.sc = sc;
    this.des = des;
    this.w = w;
  }

  public String toString() {
    return "{" + sc + "," + des + "}" + " w: " + w;
  }
}

public class index {

  static void buildGraph(ArrayList<Node> gList[], int sc, int des, int w) {
    gList[sc].add(new Node(sc, des, w));
    gList[des].add(new Node(des, sc, w));

  }

  static void print(ArrayList<Node> gList[]){
      for(int i=0;i<gList.length;i++){
        System.out.println(i+" Nodes");
      
      for(Node x:gList[i]){
      System.out.println(x);
      }}
    }

      static void bfs(ArrayList<Node> gList[],int sc,boolean visited[]){
      Queue<Integer> queue=new LinkedList<>() ;
      queue.add(sc);
      visited[sc]=true;

      while (!queue.isEmpty()) {
        int curr=queue.poll();
        System.out.println(curr+" ");
      
      for(Node n:gList[curr]){
        if(!visited[n.des]){
          visited[n.des]=true;
          queue.add(n.des);
        }
      }
     
       }
    }

  public static void main(String[] args) {
    int n = 4;
    ArrayList<Node> gList[] = new ArrayList[n];
    for (int i = 0; i < gList.length; i++) {
      gList[i] = new ArrayList<>();
    }
    buildGraph(gList,0,1,7);
    buildGraph(gList,1,2,5);
    // print(gList);

    boolean[] visited = new boolean[n];
    bfs(gList, 0, visited);

  }
}
