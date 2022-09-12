import java.util.Arrays;

public class Lab7 {
    public static void main(String[] args) {
        String[] strings = {"1", "12", "123", "12346666"};
        Arrays.stream(getStringsLessThanAvg(strings)).forEach(System.out::println);
    }

    private static String[] getStringsLessThanAvg(String[] strings) {
        int sumLength = 0;
        for (String s : strings) {
            sumLength += s.length();
        }
        int avg = sumLength / strings.length;

        return Arrays.stream(strings)
                .filter(s -> s.length() < avg)
                .toArray(String[]::new);
    }
}
