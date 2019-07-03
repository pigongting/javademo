public class Triangle extends Shape {

  @Override
  public void draw() {
    System.out.println("Triangle draw");
  }

  @Override
  public void erase() {
    System.out.println("Triangle erase");
  }

  @Override
  public void calculateArea() {
    System.out.println("Triangle calculateArea");
  }

  @Override
  public void calculatePerimeter() {
    System.out.println("Triangle calculatePerimeter");
  }

}