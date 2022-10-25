package lab6;

public class TranslatorMain {

    public static void main(String[] args) {
        boolean flag = true;
        String input;

        do {
            System.out.println("Enter:\n'console' to enter word from console ");
            System.out.println("'auto' to fill words auto ");
            System.out.println("'translator' to translate sentence");
            input = TranslatorUtil.manageInputMenu();

            switch (input) {
                case "console" -> TranslatorUtil.manageAddingWord();
                case "auto" -> TranslatorUtil.fillTranslator();
                case "translator" -> TranslatorUtil.manageTranslationMenu();
                case "q" -> flag = false;
            }
        } while (flag);
    }

}
