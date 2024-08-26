public class Graph {
  private int maxVerticesQty;
  private boolean isMaxVerticesQtyDef;
  private int currVerticesQty = 0;
  private Map<String, Integer> labelsToIndex = new HashMap<String, Integer>();
  private List<Vertex> vertices = new ArrayList<Vertex();

  public Graph() {
    maxVerticesQty = 10;
  }

  public Graph(int verticesQty) {
    if (verticesQty <= 0) {
      throw new IllegalArgumentException("Max ammount of vertices must be greater or equal to 1")
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
}
