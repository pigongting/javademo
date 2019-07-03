public class Square extends Shape {

  @Override
  public void draw() {
    System.out.println("Square draw");
  }

  @Override
  public void erase() {
    System.out.println("Square erase");
  }

  @Override
  public void calculateArea() {
    System.out.println("Square calculateArea");
  }

  @Override
  public void calculatePerimeter() {
    System.out.println("Square calculatePerimeter");
  }

}