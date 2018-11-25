package ru.sbt.mipt.multiprocessor_prog.counters.counters;

import java.util.concurrent.locks.ReentrantLock;

public class LockCounter implements ICounter {
    private int counter = 0;
    private ReentrantLock counterLock = new ReentrantLock(true);

    public int getCounter(){
        counterLock.lock();
        try {
            counter++;
        }
        finally {
            counterLock.unlock();
        }
        return counter;
    }
}