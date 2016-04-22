import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
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
      WordPuzzle newWordPuzzle = new WordPuzzle();
      String convertWordPuzzle = newWordPuzzle.convertWordPuzzle(words);

      model.put("words", words);
      model.put("convertWordPuzzle", convertWordPuzzle);
      model.put("words", request.queryParams("words"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
