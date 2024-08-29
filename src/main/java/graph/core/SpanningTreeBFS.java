import java.util.*;

public class SpanningTreeBFS {
  private Graph originalGraph;
  private Graph spanningTree;
  private Set<String> visited;

  public SpanningTreeBFS(Graph graph) {
    this.originalGraph = graph;
    this.spanningTree = new Graph();
    this.visited = new HashSet<>();
  }

  public Graph createSpanningTree() throws Exception {
    if (originalGraph.getVertices().isEmpty()) {
      return spanningTree;
    }

    String startVertex = originalGraph.getVertices().get(0).getLabel();
    bfs(startVertex);

    return spanningTree;
  }
}
