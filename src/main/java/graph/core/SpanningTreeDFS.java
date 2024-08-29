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

  public Graph createSpanningTree() throws Exception {
    if (originalGraph.getVertices().isEmpty()) {
      return spanningTree;
    }

    String startVertex = originalGraph.getVertices().get(0).getLabel();
    dfs(startVertex);

    return spanningTree;
  }

  private void dfs(String currentVertexLabel) throws Exception {
    visited.add(currentVertexLabel);
    spanningTree.AddVertex(currentVertexLabel);

    List<Vertex> adjacencies = originalGraph.getAdjacenciess(currentVertexLabel);
    for (Vertex adjacentVertex : adjacencies) {
      String adjacentLabel = adjacentVertex.getLabel();
      if (!visited.contains(adjacentLabel)) {
        spanningTree.AddVertex(adjacentLabel);
        spanningTree.connectVertices(currentVertexLabel, adjacentLabel);
        dfs(adjacentLabel);
      }
    }
  }
}
