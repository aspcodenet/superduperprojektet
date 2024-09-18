public class String6 {
    public static void runExercise(){
        // Gör ett program där användaren får mata in en mening t ex ”Detta är min text
//  som jag matar in”. Programmet skall räkna ut hur många ord meningen består av
// och meddela användaren om detta.
            String theText = "hej jag heter stefan";

            int antalSpaces = 0;

            for(int i = 0; i < theText.length(); i++){
                if(theText.charAt(i) == ' ')
                    antalSpaces++;
            }
            System.out.println(antalSpaces+1);



    }

}
