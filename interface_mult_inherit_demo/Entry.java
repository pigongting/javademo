public class Entry {

  public static void main(String[] args) {
    SuperMan sm = new SuperMan();
    fly(sm);
    fight(sm);
  }

  private static void fly(Fly f){
    f.fly();
  }

  private static void fight(Fight f){
    f.fight();
  }

}