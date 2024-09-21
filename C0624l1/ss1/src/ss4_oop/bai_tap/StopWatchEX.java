package ss4_oop.bai_tap;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Scanner;

public class StopWatchEX {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int a = 0;
        for (int i = 0; i < 100000000; i++) {
            a++;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime() + ", " + stopWatch.getEndTime() + ", " + stopWatch.getElapsedTime());
    }
}
