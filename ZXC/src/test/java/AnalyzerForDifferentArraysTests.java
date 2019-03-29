import analyzer.AnalyzerOfSortingMethods;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnalyzerForDifferentArraysTests extends Assert{
    private AnalyzerOfSortingMethods analyzer;
    @Before
    public void setUp(){
        final int[] array = {2,5,1,5,6};
        analyzer = new AnalyzerOfSortingMethods(array);
    }
    @Test(timeout = 1000)
    public void testGetDataSetTimeout(){
        analyzer.getDataSet();
    }
    @Test
    public void testDataSetIsNotEmpty(){
        boolean actual = analyzer.getDataSet().isEmpty();
        assertFalse(actual);
    }
}
