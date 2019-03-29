import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionsTests extends Assert {
    final int[] array1 = {1,2,3};
    final int[] array2 = {4,5,6};
    @Before
    public void setUp(){
        }
    @Test(timeout = 100)
    public void testTimeoutMerge(){
        Functions.Merger.Merger(array1,array2);
    }
}
