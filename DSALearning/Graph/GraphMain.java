package DSALearning.Graph;

public class GraphMain {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.removeEdge("B", "A");
        myGraph.removeVertex("B");
        myGraph.printGraph();
    }
}
