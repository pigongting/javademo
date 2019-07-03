public class SuperMan implements Fly,Fight{

  @Override
  public void fight() {
    System.out.println("SuperMan fight");
  }

  @Override
  public void fly() {
    System.out.println("SuperMan fly");
  }

}