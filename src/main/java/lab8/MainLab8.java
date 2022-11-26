package lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainLab8 {
    public static void main(String[] args) {
        int totalPoints = 1000000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of Threads : ");
        int threadsCount = scan.nextInt();

        int eachThreadPoints = totalPoints / threadsCount;
        ExecutorService pool = Executors.newFixedThreadPool(threadsCount);
        List<Future<Integer>> results = new ArrayList<>(threadsCount);
        for (int i = 0; i < threadsCount; i++) {
            Future<Integer> insidePointsThr = pool.submit(new Task(eachThreadPoints));
            results.add(insidePointsThr);
        }
        int insidePoints = results.stream().mapToInt(MainLab8::getFutureResult).sum();

        System.out.println("Number of inside points :" + insidePoints);
        System.out.println("Pi/4 = " + (double) insidePoints / (double) totalPoints);
        System.out.println("Pi   = " + 4 * (double) insidePoints / (double) totalPoints);

        pool.shutdown();
    }

    private static int getFutureResult(Future<Integer> f) {
        try {
            return f.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
