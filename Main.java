public class Main {
  public static void main(String[] args) {
    WordMatch game3 = new WordMatch("mississippi");
    System.out.println(game3.scoreGuess("i"));
    System.out.println(game3.scoreGuess("iss"));
    System.out.println(game3.scoreGuess("issipp"));
    System.out.println(game3.scoreGuess("mississippi"));

    WordMatch game2 = new WordMatch("aaaabb");
    System.out.println(game2.scoreGuess("a"));
    System.out.println(game2.scoreGuess("aa"));
    System.out.println(game2.scoreGuess("aaa"));
    System.out.println(game2.scoreGuess("aabb"));
    System.out.println(game2.scoreGuess("c"));

    WordMatch game = new WordMatch("concatenation");
    System.out.println(game.scoreGuess("ten"));
    System.out.println(game.scoreGuess("nation"));
    System.out.println(game.findBetterGuess("ten", "nation"));
    System.out.println(game.scoreGuess("con"));
    System.out.println(game.scoreGuess("cat"));
    System.out.println(game.findBetterGuess("con", "cat"));
  }
}
