    import static java.lang.Integer.parseInt;

    /**
     *
     * @author kevin.seewer
     */
    public class StringCalculator {

     public static int add(String text) {
      if (text.equals("")) {
       return 0;
      } else {
       String delimiter = ",";
       if (text.matches("//(.*)\n(.*)")) {
        delimiter = Character.toString(text.charAt(2));
        text = text.substring(4);
       }

       String numList[] = splitNumbers(text, delimiter + "|\n");
       return sum(numList);
      }
     }

     // Pourquoi faire une méthode pour une seule ligne?
     private static String[] splitNumbers(String numbers, String delimiteur) {
      return numbers.split(delimiteur);
     }


     private static int sum(String[] numList) {

      int total = 0;
      String negatif = "";
      for (String number: numList) {
       if (parseInt(number) < 0) {
        if (negatif.equals(""))
         negatif = number;
        else
         negatif += ("," + number);
       }
       if (parseInt(number) < 1000) {

        total += parseInt(number);
       }
      }
      if (!negatif.equals("")) {
       throw new IllegalArgumentException("Les n�gatifs ne sont pas accept�s: " + negatif);
      }
      return total;

     }
    }