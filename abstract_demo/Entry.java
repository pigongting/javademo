public class Entry {

  public static void main(String[] args) {
    Shape [] shapes = {new Circle(), new Triangle(), new Square()};
    for (Shape shape : shapes) {
      shape.draw();
    }
  }

}