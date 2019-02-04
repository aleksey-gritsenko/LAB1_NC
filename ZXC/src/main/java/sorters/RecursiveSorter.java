package sorters;

import java.util.Arrays;

public class RecursiveSorter extends AbstractSorter {
    @Override
    public void sort() {
        Integer[] array = getSortedArray();
        Arrays.sort(array,1,array.length);
    }
}
