package lab6;

import java.util.HashMap;

public class Translator {

    private final HashMap<String, String> dict = new HashMap<>();

    public void addTranslation(String original, String translation) {
        dict.put(original, translation);
    }

    public String translate(String original) {
        return dict.get(original);
    }
}
