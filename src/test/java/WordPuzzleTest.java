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

  @Test
  public void convertWordPuzzle_returnWordWithVowels_String() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String expected = "--d--";
    assertEquals(expected, WordPuzzle.convertWordPuzzle("audio"));
  }

  @Test
  public void convertWordPuzzle_returnMultipleWordWithVowels_String() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String expected = "h-ll- w-rld";
    assertEquals(expected, WordPuzzle.convertWordPuzzle("hello world"));
  }

  @Test
  public void convertWordPuzzle_returnMultipleWordWithVowelsInLowerCase_String() {
    WordPuzzle wordPuzzle = new WordPuzzle();
    String expected = "h-y th-r-";
    assertEquals(expected, WordPuzzle.convertWordPuzzle("HEY THERE"));
  }
}
