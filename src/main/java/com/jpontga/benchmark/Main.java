package com.jpontga.benchmark;

import org.perfidix.*;
import org.perfidix.ouput.*;
import org.perfidix.result.*;

public class Main {

	/**
	 * <p>
	 * Execute to run BenchMark. See {@link com.jpontga.benchmark.Test} to modify benchmark.
	 * </p>
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {

		final Benchmark benchmark = new Benchmark();
		
		benchmark.add(Test.class);
		
		System.out.println("Running benchmark...");
		
		final BenchmarkResult benchmarkResult = benchmark.run();
		
		System.out.println("Benchmarck done!");
		System.out.println();
		
		new TabularSummaryOutput().visitBenchmark(benchmarkResult);
		
	}

}
