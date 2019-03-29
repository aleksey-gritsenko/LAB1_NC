import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorters.MergeSorter1;
import sorters.MergeSorter2;
import sorters.MergeSorter3;
import sorters.MergeSorter4;

public class MergeSorterTests extends Assert{
    MergeSorter1 sorter1 = new MergeSorter1();
    MergeSorter2 sorter2 = new MergeSorter2();
    MergeSorter3 sorter3 = new MergeSorter3();
    MergeSorter4 sorter4 = new MergeSorter4();
    final int[] array = {2,5,1,5,6};
    @Before
    public void setUp(){
    }
    @Test(timeout = 100)
    public void testTimeoutSort1(){
        sorter1.sort(array);
    }
    @Test
    public void testSort1(){
        int[] array = {1,5,2,4,3};
        sorter1.sort(array);
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                assertFalse(true);
            }
        }
    }
    @Test(timeout = 100)
    public void testTimeoutSort2(){
        sorter2.sort(array);
    }
    @Test
    public void testSort2(){
        int[] array = {1,5,2,4,3};
        sorter2.sort(array);
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                assertFalse(true);
            }
        }
    }
    @Test(timeout = 100)
    public void testTimeoutSort3(){
        sorter3.sort(array);
    }
    @Test
    public void testSort3(){
        int[] array = {1,5,2,4,3};
        sorter3.sort(array);
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                assertFalse(true);
            }
        }
    }
    @Test(timeout = 100)
    public void testTimeoutSort4(){
        sorter4.sort(array);
    }
    @Test
    public void testSort4(){
        int[] array = {1,5,2,4,3};
        sorter4.sort(array);
        for (int i = 1;i<array.length;i++){
            if (array[i]<array[i-1]){
                assertFalse(true);
            }
        }
    }
    @Test
    public void testExeptionSort1() throws NullPointerException{
        int[] array = {};
        try{
            array = null;
            sorter1.sort(array);
            Assert.fail("Expected IOExeption");
        }
        catch (NullPointerException thrown){
            Assert.assertNotEquals("",thrown.getMessage());
        }
    }
    @Test
    public void testExeptionSort2() throws NullPointerException{
        int[] array = {};
        try{
            array = null;
            sorter2.sort(array);
            Assert.fail("Expected IOExeption");
        }
        catch (NullPointerException thrown){
            Assert.assertNotEquals("",thrown.getMessage());
        }
    }
    @Test
    public void testExeptionSort3() throws NullPointerException{
        int[] array = {};
        try{
            array = null;
            sorter3.sort(array);
            Assert.fail("Expected IOExeption");
        }
        catch (NullPointerException thrown){
            Assert.assertNotEquals("",thrown.getMessage());
        }
    }
    @Test
    public void testExeptionSort4() throws NullPointerException{
        int[] array = {};
        try{
            array = null;
            sorter4.sort(array);
            Assert.fail("Expected IOExeption");
        }
        catch (NullPointerException thrown){
            Assert.assertNotEquals("",thrown.getMessage());
        }
    }

}
