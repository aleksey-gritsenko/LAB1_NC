import analyzer.AnalyzerForDifferentArrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnalyzerOfSortingMethodsTests extends Assert {    private AnalyzerForDifferentArrays analyzer;
    @Before
    public void setUp(){
        final int length = 10;
        final int maxStep = 5;
        final int range = 10;
        analyzer = new AnalyzerForDifferentArrays(length,maxStep,range);
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
