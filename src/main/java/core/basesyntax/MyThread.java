package core.basesyntax;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private final long duration;

    public MyThread() {
        this.duration = Math.round(1 + Math.random() * 4) * 100;
    }

    @Override
    public String call() throws InterruptedException {
        Thread.sleep(duration);
        return String.format("Task duration was %d ms, execution finished at %s",
                duration,
                LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSS"))
        );
    }
}
