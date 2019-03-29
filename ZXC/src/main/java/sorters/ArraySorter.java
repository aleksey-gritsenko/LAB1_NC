package sorters;

import java.io.IOException;
import java.util.Arrays;
/**
 * @author <p>
Gritsenko
 * </p>
 **/
public class ArraySorter extends AbstractSorter {
    @Override
    public void sort(int[] array)  throws NullPointerException{
        Arrays.sort(array);
    }
}
