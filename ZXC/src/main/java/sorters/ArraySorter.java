package sorters;

import java.util.Arrays;

public class ArraySorter extends AbstractSorter {
    @Override
    public void sort() {
        Integer[] array = getSortedArray();
        Arrays.sort(array);
    }
}
