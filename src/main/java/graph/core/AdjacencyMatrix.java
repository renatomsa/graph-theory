import java.util.*;

public class AdjacencyMatrix {
  private int[][] matrix;
  private List<Vertex> vertices;
  private int verticesQty;

  public AdjacencyMatrix(List<Vertex> vertices) {
    this.vertices = vertices;
    this.verticesQty = vertices.size();
    matrix = new int[verticesQty][verticesQty];
    initMatrix();
  }

  private void initMatrix() {
    for (int i=0; i<matrix.length; i++) {
      for (int j=0; j<matrix[i].length; j++) {
        matrix[i][j] = 0;
      }
    }
  }

  public void addEdge(int initialVertexIdx, int finalVertexIdx) {
    Vertex initialVertex = vertices.get(initialVertexIdx);
    Vertex finalVertexIdx = vertices.get(finalVertexIdx);
    if (initialVertexIdx == finalVertexIdx) {
      matrix[initialVertexIdx][finalVertexIdx] = 1;
      initialVertex.addDegree();
    } else {
      matrix[initialVertexIdx][finalVertexIdx] = 1;
      initialVertex.addDegree();
      matrix[finallVertexIdx][initialVertexVertexIdx] = 1;
      finalVertex.addDegree();
    }
  }

  public List<Vertex> getAdjacencies(int vertexIdx) {
    int line = vertexIdx;
    List<Vertex> adjacencies = new ArrayList<>();
    for (int j=0; j<vertices.size(); j++) {
      if (matrix[line][j] == 1) {
        Vertex vertice = vertices.get(j);
        adjacencies.add(vertice);
      }
    }
    return adjacencies;
  }
}
