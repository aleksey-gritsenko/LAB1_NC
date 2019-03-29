import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorters.RecursiveSorter;

public class RecursiveSorterTests extends Assert {
    RecursiveSorter sorter = new RecursiveSorter();
    final int[] array = {2,5,1,5,6};
    @Before
    public void setUp(){
    }
    @Test(timeout = 100)
    public void testTimeoutSort(){
        try{
            sorter.sort(array);
        }
        catch (NullPointerException thrown){
        }
    }
    @Test
    public void testSort(){
        int[] array = {1,5,2,4,3};
        try{
            sorter.sort(array);
        }
        catch (NullPointerException thrown){
        }
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                assertFalse(true);
            }
        }
    }
    @Test
    public void testExeptionSort() throws NullPointerException{
        int[] array = {};
        try{
            array = null;
            sorter.sort(array);
            Assert.fail("Expected IOExeption");
        }
        catch (NullPointerException thrown){
            Assert.assertNotEquals("",thrown.getMessage());
        }
    }

}
