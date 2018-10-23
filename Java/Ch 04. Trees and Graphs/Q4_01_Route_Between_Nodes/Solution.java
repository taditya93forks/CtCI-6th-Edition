package Q4_01_Route_Between_Nodes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Solution {
    public static void main(String args[]){
        Graph graph = Question.createNewGraph();
        Node[] nodes = graph.getNodes();
//        Random random = new Random(System.currentTimeMillis());
//        int s_idx=random.nextInt(nodes.length), l_idx=random.nextInt(nodes.length-1);
        int s_idx=4, l_idx=3;
        System.out.println(searchNode(graph,nodes[s_idx],nodes[l_idx]));
    }

    public static boolean searchNode(Graph g, Node s, Node l){
        HashSet<Node> visitedNodes = new HashSet<>();
        Queue<Node>  queue = new LinkedList<>();
        ((LinkedList<Node>) queue).push(s);
        visitedNodes.add(s);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(l.equals(current)){
                return true;
            }
            for(Node n: current.getAdjacent()){
                if(!visitedNodes.contains(n)){
                    visitedNodes.add(n);
                    queue.add(n);
                }
            }
        }
        return false;
    }
}
