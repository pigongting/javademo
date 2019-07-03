public class Circle extends Shape {

  @Override
  public void draw() {
    System.out.println("Circle draw");
  }

  @Override
  public void erase() {
    System.out.println("Circle erase");
  }

  @Override
  public void calculateArea() {
    System.out.println("Circle calculateArea");
  }

  @Override
  public void calculatePerimeter() {
    System.out.println("Circle calculatePerimeter");
  }

}