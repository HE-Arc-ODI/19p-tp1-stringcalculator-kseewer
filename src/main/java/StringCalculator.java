import static java.lang.Integer.parseInt;

/**
 * @author kevin.seewer
 */
public class StringCalculator {

  public static int add(String text) {
    if (text.equals("")) {
      return 0;
    } else {

      String delimiter = ",";

      if (text.startsWith("//[")) {
        delimiter = text.substring(2, text.indexOf("\n"));
        //Coding horror
        delimiter = delimiter.replace("[", "");
        delimiter = delimiter.replace("]", "|");
        //TODO: extract method to manage meta character
        delimiter = delimiter.replace("*", "\\*");
        delimiter = delimiter.substring(0, delimiter.length() - 1);
        text = text.substring(text.indexOf("\n") + 1);
      } else if (text.startsWith("//")) {
        delimiter = text.substring(2, text.indexOf("\n"));
        text = text.substring(text.indexOf("\n") + 1);
      }

      String numList[] = text.split(delimiter);
      return sum(numList, delimiter);
    }
  }

  private static String[] splitNumbers(String numbers, String delimiteur) {
    return numbers.split(delimiteur);
  }


  private static int sum(String[] numList, String delimiter) {

    int total = 0;
    String negatif = "";
    for (int i = 0; i < numList.length; i++) {

      if (parseInt(numList[i]) < 0) {
        if (negatif.equals("")) {
          negatif = numList[i];
        } else {
          negatif += ("," + numList[i]);
        }
      }
      if (parseInt(numList[i]) <= 1000) {

        total += parseInt(numList[i]);
      }
    }
    if (!negatif.equals("")) {
      throw new IllegalArgumentException("Les négatifs ne sont pas acceptés: " + negatif);
    }
    return total;

  }
}