package samkaj;

import java.util.Random;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class App {
  // Small change
  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder()
                      .include(App.class.getSimpleName())
                      .forks(1)
                      .build();

    new Runner(opt).run();
  }

  @Benchmark
  public void sortStuff() {
    int[] stuff = generateRandomArray(10000);
    Sorter sorter = new Sorter();
    int[] sortedStuff = sorter.sort(stuff);
  }

  public int[] generateRandomArray(int amount) {
    int[] randoms = new int[amount - 1];
    Random r = new Random(1337);
    for (int i = 0; i < randoms.length - 1; i++) {
      randoms[i] = r.nextInt();
    }
    return randoms;
  }
}
