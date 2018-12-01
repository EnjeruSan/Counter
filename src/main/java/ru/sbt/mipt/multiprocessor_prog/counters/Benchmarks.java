package ru.sbt.mipt.multiprocessor_prog.counters;

import org.openjdk.jmh.annotations.*;
import ru.sbt.mipt.multiprocessor_prog.counters.counters.ConcurrentCounter;
import ru.sbt.mipt.multiprocessor_prog.counters.counters.InternetCounter;
import ru.sbt.mipt.multiprocessor_prog.counters.counters.LockCounter;
import ru.sbt.mipt.multiprocessor_prog.counters.counters.SynchronizedCounter;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class Benchmarks {

    private ConcurrentCounter concurrentCounter = new ConcurrentCounter();
    private SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
    private InternetCounter internetCounter = new InternetCounter();
    private LockCounter lockCounter = new LockCounter();

// Synchronized //
    @Benchmark
    @Threads(1)
    public int syn1() {
        int result  = synchronizedCounter.getCounter();
        return result;
}

    @Benchmark
    @Threads(2)
    public int syn2() {
        int result  = synchronizedCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(4)
    public int syn4() {
        int result  = synchronizedCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(8)
    public int syn8() {
        int result  = synchronizedCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(16)
    public int syn16() {
        int result  = synchronizedCounter.getCounter();
        return result;
    }

    // Concurrent //
    @Benchmark
    @Threads(1)
    public int concurrent1() {
        int result = concurrentCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(2)
    public int concurrent2() {
        int result = concurrentCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(4)
    public int concurrent4() {
        int result = concurrentCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(8)
    public int concurrent8() {
        int result = concurrentCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(16)
    public int concurrent16() {
        int result = concurrentCounter.getCounter();
        return result;
    }

    // Internet //
    @Benchmark
    @Threads(1)
    public int internet1() {
        int result  = internetCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(2)
    public int internet2() {
        int result  = internetCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(4)
    public int internet4() {
        int result  = internetCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(8)
    public int internet8() {
        int result  = internetCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(16)
    public int internet16() {
        int result  = internetCounter.getCounter();
        return result;
    }

    // Locked //
    @Benchmark
    @Threads(1)
    public int locked1() {
        int result = lockCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(2)
    public int locked2() {
        int result = lockCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(4)
    public int locked4() {
        int result = lockCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(8)
    public int locked8() {
        int result = lockCounter.getCounter();
        return result;
    }

    @Benchmark
    @Threads(16)
    public int locked16() {
        int result = lockCounter.getCounter();
        return result;
    }
}
