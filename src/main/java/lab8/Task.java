package lab8;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Task implements Callable<Integer> {
    final int points;

    public Task(int points){
        this.points = points;
    }

    @Override
    public Integer call() {
        int insidePoints = 0;
        int prec = 1000000;
        for( int i=0 ; i < points ; ++i){
            double x = (double) ThreadLocalRandom.current().nextInt(prec + 1)/(double)prec;
            double y = (double)ThreadLocalRandom.current().nextInt(prec + 1)/(double)prec;
            if( (x*x + y*y) <= 1){
                ++insidePoints;
            }
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " running and Inside points are " + insidePoints);
        return insidePoints;
    }
}
