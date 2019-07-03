public class Entry {

  public static void main(String[] args) {
    Move [] move = {new Animal(), new Human(), new Car()};
    for (Move m : move) {
      m.move();
    }
  }

}