public abstract class Shape {
  
  private String name;
  
  public abstract void draw();
  
  public abstract void erase();
  
  public abstract void calculateArea();
  
  public abstract void calculatePerimeter();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}