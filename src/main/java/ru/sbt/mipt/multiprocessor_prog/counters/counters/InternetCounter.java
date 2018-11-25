package ru.sbt.mipt.multiprocessor_prog.counters.counters;

import java.util.concurrent.atomic.AtomicInteger;

public class InternetCounter implements ICounter {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getCounter() {
        int currentValue, newValue;
        do {
            currentValue = this.counter.get();
            newValue = currentValue + 1;
        } while (!this.counter.compareAndSet(currentValue, newValue));
        return newValue;
    }
}
