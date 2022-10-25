package lab6;

import java.util.HashMap;

public class Translator {

    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.addTranslation("word", "слово");
        translator.addTranslation("car", "машина");
        translator.addTranslation("code", "код");

        System.out.println(translator.translate("word"));
        System.out.println(translator.translate("car"));
        System.out.println(translator.translate("code"));
    }

    private final HashMap<String, String> dict = new HashMap<>();

    public void addTranslation(String original, String translation) {
        dict.put(original, translation);
    }

    public String translate(String original) {
        return dict.get(original);
    }
}
