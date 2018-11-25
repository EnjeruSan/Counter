package ru.sbt.mipt.multiprocessor_prog.counters;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {
    private static final int warmupIterations = 2;
    private static final int measurementIterations = 10;
    private static final int forks = 1;


    public static void main(String[] args) throws RunnerException {
        OptionsBuilder optionsBuilder = new OptionsBuilder();

        optionsBuilder.warmupIterations(warmupIterations)
                .include(Benchmarks.class.getSimpleName())
                .measurementIterations(measurementIterations)
                .forks(forks)
                .resultFormat(ResultFormatType.CSV)
                .result("Counters_result.csv")
                .build()
        ;


        new Runner(optionsBuilder.build()).run();
    }
}
