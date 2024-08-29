import java.util.*;

public class Graph {
  private int maxVerticesQty;
  private boolean isMaxVerticesQtyDef;
  private int currVerticesQty = 0;
  private Map<String, Integer> labelsToIndex = new HashMap<String, Integer>();
  private List<Vertex> vertices = new ArrayList<Vertex>();

  public Graph() {
    maxVerticesQty = 10;
  }

  public Graph(int verticesQty) {
    if (verticesQty <= 0) {
      throw new IllegalArgumentException("Number of vertices must be greater or equal to 1")
    }

    maxVerticesQty = verticesQty;
    isMaxVerticesQtyDef = true;
  }

  public AddVertex(String label) throws Exception {
    if (currVerticesQty <= maxVerticesQty - 1) {
      Vertex newVertex = new Vertex(label);
      this.vertices.add(newVertex);
      this.labelsToIndex.put(label, currVerticesQty);
      currVerticesQty++;
    }
  }

  public List<Vertex> getVertices() {
    return this.vertices;
  }

  public Vertex getVertex(String label) {
    this.existsOrThrow(label);
    int idx = this.labelsToIndex.get(label);
    return this.vertices.get(idx);
  }

  public void connectVertices(String labelInitialVertex, String labelFinalVertex) throws Exception {
    if (!this.existVertex(labelInitialVertex) || !this.existVertex(labelFinalVertex)) {
      throw new Exception("Both vertices must exist in order to connect them!")
    }
    createAdjacencyMatrix();
    int finalVertexIdx = this.labelsToIndex.get(labelInitialVertex);
    int initialVertexIdx = this.labelsToIndex.get(labelInitialVertex);
  }

  public List<Vertice> getAdjacenciess(String vertex) {
    this.existsOrThrow(vertex);
    int vertexIdx = this.labelsToIndex.get(vertex);
    return this.AdjacencyMatrix.getAdjacencies(vertexIdx);
  }

  private boolean existsOrThrow(String vertex) {
    if(!existVertex(vertex)) {
    throw new IllegalArgumentException("Vertex does not exist");
    }
    return true;
  }

  private boolean existVertex(String vertexLabel) {
    int idx = this.labelsToIndex.get(vertexLabel);
    return this.vertices.get(idx) != null ? true : false;
  }

  private void createAdjacencyMatrix() {

    if(this.AdjacencyMatrix == null){
    this.AdjacencyMatrix = new AdjacencyMatrix(new
    ArrayList<Vertex>(this.vertices));
    }
  }
}
