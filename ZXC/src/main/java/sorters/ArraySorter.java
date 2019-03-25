package sorters;

import java.util.Arrays;
/**
 * @author <p>
Gritsenko
 * </p>
 **/
public class ArraySorter extends AbstractSorter {
    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
