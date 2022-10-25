package lab6;

import java.util.Scanner;

public class TranslatorUtil {

    private static final Translator translator = new Translator();

    public static void fillTranslator() {
        translator.addTranslation("word", "слово");
        translator.addTranslation("apple", "яблоко");
        translator.addTranslation("code", "код");
        translator.addTranslation("car", "машина");
        translator.addTranslation("he", "он");
        translator.addTranslation("she", "она");
        translator.addTranslation("it", "оно");
        translator.addTranslation("go", "идти");
        translator.addTranslation("eat", "кушать");
        translator.addTranslation("work", "работать");
        translator.addTranslation("green", "зеленый");
        translator.addTranslation("red", "красный");
        translator.addTranslation("blue", "синий");
        translator.addTranslation("white", "белый");

        System.out.println("Added! Try to translate");
    }

    public static void manageAddingWord() {
        Scanner scanner = new Scanner(System.in);
        String original, translation;

        System.out.print("Original + Translation: ");
        original = scanner.next();
        translation = scanner.next();

        System.out.println(original + " " + translation);
        translator.addTranslation(original, translation);
        System.out.println("Added! Try to translate");
    }

    public static String manageInputMenu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static String manageInputSentence() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void manageTranslationMenu() {
        String input;
        boolean flag = true;
        System.out.println("[Translator] enter 'console' to enter sentence from console OR 'auto' to auto generate sentence to translate");

        do {
            input = manageInputMenu();

            switch (input) {
                case "console" -> manageConsoleTranslate();
                case "auto" -> manageTranslate();
                default -> flag = false;
            }
        } while (flag);

    }

    private static void manageTranslate() {
        String sentence = "he eat green apple";
        String[] words = sentence.split(" ");
        String translatedSentence = "";

        for (String word : words) {
            if (translator.translate(word) == null) {
                translatedSentence += word + " ";
            } else {
                translatedSentence += translator.translate(word) + " ";
            }
        }

        System.out.println(translatedSentence);
    }

    private static void manageConsoleTranslate() {
        String input = TranslatorUtil.manageInputSentence();
        String[] words = input.split(" ");
        String translatedSentence = "";

        for (String word : words) {
            if (translator.translate(word) == null) {
                translatedSentence += word + " ";
            } else {
                translatedSentence += translator.translate(word) + " ";
            }
        }

        System.out.println(translatedSentence);
    }

}
