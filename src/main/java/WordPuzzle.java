public class WordPuzzle {
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
