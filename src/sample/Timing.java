package sample;

import java.util.TimerTask;
import java.util.Timer;

public class Timing{
    int seconds = 0;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            seconds++;
            System.out.println(seconds);
        }
    };

    public void start() {
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public int getSeconds(){
        return seconds;
    }

}