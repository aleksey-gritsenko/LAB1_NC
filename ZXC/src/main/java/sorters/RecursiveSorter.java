package sorters;

import java.util.Arrays;
/**
 * @author <p>
Gritsenko
 * </p>
 **/
public class RecursiveSorter extends AbstractSorter {
    @Override
    public void sort(int[] array) throws NullPointerException {
        Arrays.sort(array,1,array.length);
    }
}
