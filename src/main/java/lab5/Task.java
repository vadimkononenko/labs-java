package lab5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/vadimkononenko/Desktop/task5.txt";
        maxWords(filePath);
    }

    private static void maxWords(String path) throws IOException {
        List<String> lines = new ArrayList<>();

        File file = new File(path);
        try (FileReader fr = new FileReader(file)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                while((line = br.readLine()) != null){
                    lines.add(line.trim());
                }
            }
        }

        int indexRes = 0;
        long biggest = lines.get(indexRes).chars().filter(c -> c == ' ').count();
        for (int i = 1; i < lines.size(); i++) {
            long countOfSpaces = lines.get(i).chars().filter(c -> c == ' ').count();
            if (biggest < countOfSpaces) {
                indexRes = i;
                biggest = countOfSpaces;
            }
        }

        System.out.println(lines.get(indexRes));
    }
}
