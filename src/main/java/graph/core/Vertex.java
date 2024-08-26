public class Vertex {
  private int degree;
  private String label;

  public Vertex(String label) throws Exception {
    boolean isLabelNullOrBlank = label == null || label != null && "".equals(label.trim());
    if (isLabelNullOrBlank) {
      throw new Exception ("Vertex must have a label!")
    }
    this.label = label;
  }

  public String getLabel() {
    return this.label;
  }
}
