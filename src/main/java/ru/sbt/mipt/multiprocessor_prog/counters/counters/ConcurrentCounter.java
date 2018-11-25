package ru.sbt.mipt.multiprocessor_prog.counters.counters;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentCounter implements ICounter{
    private AtomicInteger counter = new AtomicInteger(0);

    public int getCounter() {
        return counter.incrementAndGet();
    }
}
