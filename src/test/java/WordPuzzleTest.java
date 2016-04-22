import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WordPuzzleTest {
  @Test
  public void convertWordPuzzle_returnWordWithoutVowels_String() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String expected = "lynx";
    assertEquals(expected, WordPuzzle.convertWordPuzzle("lynx"));
  }
}
