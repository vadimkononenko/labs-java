import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    public static void main(String[] args) {
        String[] strings = {"sdfsdf", "ddddd", "eeeee", "123546sdfsdfsdf"};
        for (String s : getStringsLessThanAvg(strings)) {
            System.out.println(s);
        }
    }

    private static String[] getStringsLessThanAvg(String[] strings) {

        List<String> resStrings = new ArrayList<>();
        String[] resultStrings;

        int sumLength = 0;
        for (String s : strings) {
            sumLength += s.length();
        }

        int avg = sumLength / strings.length;
        for (String s : strings) {
            if (s.length() <= avg) resStrings.add(s);
        }

        resultStrings = new String[resStrings.size()];
        for (int i = 0; i < resStrings.size(); i++) {
            resultStrings[i] = resStrings.get(i);
        }

        return resultStrings;
    }
}
