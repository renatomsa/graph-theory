import java.util.*;

public class SpanningTreeDFS {
  private Graph originalGraph;
  private Graph spanningTree;
  private Set<String> visited;

  public SpanningTreeDFS(Graph graph) {
    this.originalGraph = graph;
    this.spanningTree = new Graph();
    this.visited = new HashSet<>();
  }
}
