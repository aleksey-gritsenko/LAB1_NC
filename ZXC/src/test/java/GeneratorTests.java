import fillers.Generator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeneratorTests extends Assert {
    private int length;
    private int maxStep;
    private int range;

    @Before
    public void setUp(){
        length = 10;
        maxStep = 5;
        range = 10;
    }
    @Test(timeout = 100)
    public void testTimeoutcreteSortedArray(){
        Generator.createSortedArray(length,maxStep,range);
    }

    @Test(timeout = 100)
    public void testTimeoutcreteSortedArrayWithX(){
        Generator.createSortedArrayWithX(length,maxStep,range);
    }

    @Test(timeout = 100)
    public void testTimeoutcreteBackSortedArray(){
        Generator.createBacksortedArray(length,maxStep,range);
    }

    @Test(timeout = 100)
    public void testTimeoutcreteUnsortedArray(){
        Generator.createUnsortedArray(length,maxStep,range);
    }
}
