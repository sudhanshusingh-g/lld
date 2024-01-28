package code.mergeSort;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Runner {
    public static void main(String[] args) throws Exception {
        List<Integer> values = List.of(
                10, 9, 8, 7, 1, 2, 3, 4);

        ExecutorService executor = Executors.newCachedThreadPool();
        MergeSorter sorter = new MergeSorter(values, executor);
        Future<List<Integer>> sortedValues = executor.submit(sorter);
        System.out.println(sortedValues.get());
    }
}
