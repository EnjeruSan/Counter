package ru.sbt.mipt.multiprocessor_prog.counters.counters;

public class SynchronizedCounter implements ICounter {
    private int counter = 0;

    public synchronized int getCounter() {
        counter++;
        return counter;
    }
}
