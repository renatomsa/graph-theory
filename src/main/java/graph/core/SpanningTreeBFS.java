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

  private void bfs(String startVertexLabel) throws Exception {
    Queue<String> queue = new LinkedList<>();
    queue.offer(startVertexLabel);
    visited.add(startVertexLabel);
    spanningTree.AddVertex(startVertexLabel);

    while (!queue.isEmpty()) {
        String currentVertexLabel = queue.poll();
        List<Vertex> adjacencies = originalGraph.getAdjacenciess(currentVertexLabel);

        for (Vertex adjacentVertex : adjacencies) {
            String adjacentLabel = adjacentVertex.getLabel();
            if (!visited.contains(adjacentLabel)) {
                visited.add(adjacentLabel);
                queue.offer(adjacentLabel);
                spanningTree.AddVertex(adjacentLabel);
                spanningTree.connectVertices(currentVertexLabel, adjacentLabel);
            }
        }
    }
  }
}
