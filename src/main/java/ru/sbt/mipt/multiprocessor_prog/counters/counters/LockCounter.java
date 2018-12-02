package ru.sbt.mipt.multiprocessor_prog.counters.counters;

import java.util.concurrent.locks.ReentrantLock;

// https://github.com/takipi/counters-benchmark/blob/master/src/main/java/com/takipi/tests/counters/implementations/OptimisticStamped.java
// но в нашем случае нет смысла разделять read/write

public class LockCounter implements ICounter {
    private int counter = 0;
    private ReentrantLock counterLock = new ReentrantLock(true);

    public int getCounter(){
        counterLock.lock();
        try {
            return ++counter;
        }
        finally {
            counterLock.unlock();
        }

    }
}
