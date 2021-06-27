import java.util.Arrays;

public class PoleMorseovka {

    //  seznamime se s metodami tridy Arrays = substring(), compareTo(), split(), join()
    public static void main(String[] args) {
//        vytiskniCastTextu();
//        porovnejSlovaPodleAbecedy("ahoj","nazdar");
        dekodujMorseovku();
        zakodujText();
    }

    //substring
    public static void vytiskniCastTextu() {
        String text = "Tak tedy nevim, co by se dalo vytisknout. ";
        System.out.println(text.substring(15, 30));
    }

    // porovna dva retezce podle abecedy / vraci o kolik jsou slova od sebe
    public static void porovnejSlovaPodleAbecedy(String slovo1, String slovo2) {
        System.out.println(slovo1.compareTo(slovo2));
        System.out.println("ahoj".compareTo("ahoj"));
    }


    public static void dekodujMorseovku() {
        String puvodniZprava = ".--. .-. --- --. .-. .- -- --- ...- .- -. ..  -- .  -... .- ...- ..";
        System.out.printf("Původní zpráva: %s\n", puvodniZprava);
        String dekodovanaZprava = "";
        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz ";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..", " "};
        String[] znaky = puvodniZprava.split(" ");
        for (String pismenoMorse : znaky) {
            char pismenoAbeceda = ' ';
            int index = -1;
            for (int i = 0; i < morseovyZnaky.length; i++) {
                if (morseovyZnaky[i].equals(pismenoMorse))
                    index = i;
            }
            if (index >= 0) { // znak nalezen
                pismenoAbeceda = abecedniZnaky.charAt(index);
            }
            dekodovanaZprava += pismenoAbeceda;
        }
        System.out.printf("Dekodovana zpráva: %s\n", dekodovanaZprava);
    }


    public static void zakodujText() {
        String puvodniZprava = "programovani me bavi";
        System.out.printf("Původní zpráva: %s\n", puvodniZprava);
        String[] zakodovanaZprava = new String[puvodniZprava.length()];
        String[] abecedniZnaky = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..", " "};
        for (int j = 0; j < puvodniZprava.length(); j++) {
            String pismenoAbeceda = new String(new char[] {puvodniZprava.charAt(j)});
            String znakMorse = null;
            for (int i = 0; i < abecedniZnaky.length; i++) {
                if (pismenoAbeceda.equals(abecedniZnaky[i])) {
                    znakMorse = morseovyZnaky[i];
                //    break;
                }
            }
//            if (znakMorse != null) {
                zakodovanaZprava[j] = znakMorse;
//            }
        }
        System.out.printf("Zakodovana zpráva: %s\n", Arrays.toString(zakodovanaZprava));
        // jiny zpusob tisku:
        for (String a: zakodovanaZprava) {
            System.out.print(a + " ");
        }
    }

}
