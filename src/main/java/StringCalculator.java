    import static java.lang.Integer.parseInt;
    import java.util.ArrayList;
    import java.util.List;

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author kevin.seewer
     */
    public class StringCalculator {

        public static int add(String text){
                    if(text.equals("")){
                            return 0;
                    }
                    else{
                        String delimiter = ",";
                        if(text.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(text.charAt(2));
				text = text.substring(4);
                    }
                        
                    String numList[] = splitNumbers(text, delimiter +"|\n");
                        int total = 0;
                        String negatif = "";
                        for ( String number : numList){if(parseInt(number) < 0){
        		if(negatif.equals(""))
        			negatif = number;
        		else
        			negatif += ("," + number);
}
                            if(parseInt(number)<1000) {
                               
                              total += parseInt(number);
                            }
                        }
                        if(!negatif.equals("")){
			throw new IllegalArgumentException("Les négatifs ne sont pas acceptés: " + negatif);
}
                            return total;
                    }
        }

    
     private static String[] splitNumbers(String numbers, String delimiteur) {
        return numbers.split(delimiteur);
       }
}


   


