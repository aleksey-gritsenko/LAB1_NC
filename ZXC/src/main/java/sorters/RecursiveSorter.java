package sorters;

import java.util.Arrays;

public class RecursiveSorter extends AbstractSorter {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array,1,array.length);
    }
}
