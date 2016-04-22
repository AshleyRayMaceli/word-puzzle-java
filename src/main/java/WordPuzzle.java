import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String words = request.queryParams("words");
      String convertWordPuzzle = convertWordPuzzle(words);

      model.put("words", words);
      model.put("convertWordPuzzle", convertWordPuzzle);
      model.put("words", request.queryParams("words"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

    public static String convertWordPuzzle(String input) {

      input = input.toLowerCase();
      String[] wordsToConvert = input.split("");
      String convertedWords = "";

      for (Integer index = 0; index < wordsToConvert.length; index++) {
        if ( (wordsToConvert[index].equals("a")) || (wordsToConvert[index].equals("e")) || (wordsToConvert[index].equals("i")) || (wordsToConvert[index].equals("o")) || (wordsToConvert[index].equals("u")) ){
          convertedWords += "-";
        } else {
          convertedWords += wordsToConvert[index];
        }
      }

      return convertedWords;
    }
}




// HashMap<Object, Object> vowelsList = new HashMap<Object, Object>();
// vowelsList.put("a", "-");
// vowelsList.put("e", "-");
// vowelsList.put("i", "-");
// vowelsList.put("o", "-");
// vowelsList.put("u", "-");
//
// String[] wordsToConvert = input.split("");
// String convertedWords = "";
//
// for ( Integer index = 0; index < wordsToConvert.length; index++ ) {
//   if ( wordsToConvert.equals(vowelsList.containsValue("-")) ) {
//     convertedWords += wordsToConvert[index];
//   } else {
//       for ( Object key : vowelsList.keySet() ) {
//         if (key.equals(wordsToConvert[index])) {
//           convertedWords += vowelsList.get(wordsToConvert[index]);
//         }
//       }
//     }
//   }
