import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorters.SwapSorter;

public class SwapSorterTests extends Assert {
    SwapSorter sorter = new SwapSorter();
    final int[] array = {2,5,1,5,6};
    @Before
    public void setUp(){
    }
    @Test(timeout = 100)
    public void testTimeoutSort(){
        sorter.sort(array);
    }
    @Test
    public void testSort(){
        int[] array = {1,5,2,4,3};
        sorter.sort(array);
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                assertFalse(true);
            }
        }
    }

}
