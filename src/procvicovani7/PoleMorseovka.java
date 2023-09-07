package procvicovani7;

import java.util.Arrays;
import java.util.Scanner;

public class PoleMorseovka {

    public static void main(String[] args) {
        zakodujText();
        dekodujMorseovku();
    }

    public static void zakodujText() {
        System.out.println("Zadej text");
        Scanner sc = new Scanner(System.in);
        String puvodniZprava = sc.nextLine().toLowerCase();
        System.out.printf("Původní zpráva: %s\n", puvodniZprava);
        String[] zakodovanaZprava = new String[puvodniZprava.length()];
        String[] abecedniZnaky = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..", " "};
        for (int j = 0; j < puvodniZprava.length(); j++) {
            String pismenoAbeceda = new String(new char[]{puvodniZprava.charAt(j)});
            String znakMorse = null;
            for (int i = 0; i < abecedniZnaky.length; i++) {
                if (pismenoAbeceda.equals(abecedniZnaky[i])) {
                    znakMorse = morseovyZnaky[i];
                }
            }
            zakodovanaZprava[j] = znakMorse;
        }
        System.out.printf("Zakodovana zpráva: %s\n", Arrays.toString(zakodovanaZprava));
        // jiny zpusob tisku:
        for (String a : zakodovanaZprava) {
            System.out.print(a + " ");
        }
    }


    public static void dekodujMorseovku() {
        System.out.println("Zadej kod morseovky");
        Scanner sc = new Scanner(System.in);
//        String puvodniZprava = sc.nextLine();
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
                if (morseovyZnaky[i].equals(pismenoMorse)) {
                    index = i;
                }
            }
            if (index >= 0) { // znak nalezen
                pismenoAbeceda = abecedniZnaky.charAt(index);
            }
            dekodovanaZprava += pismenoAbeceda;
        }
        System.out.printf("Dekodovana zpráva: %s\n", dekodovanaZprava);
    }



}
