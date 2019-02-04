package analyzer;

import fillers.Generator;

import static fillers.Generator.*;

public class AnalyzerForDifferentArrays {
    private int length;
    private int maxStep;
    private int range;
    long[] data;

    public AnalyzerForDifferentArrays(int length,int maxStep,int range){
        // get information how many sort methods there are (will be reworked with Reflection API)
        this.length = length;
        this.maxStep = maxStep;
        this.range = range;
        data = new long[8];
    }
    // must be revorked with Reflection API
    public long[] testForArray1(){
        Integer[] testArray = createSortedArray(length, maxStep, range);
        AnalyzerOfSortingMethods analyzer = new AnalyzerOfSortingMethods(testArray);
        data[0] = analyzer.testMethod1Part1();
        data[1] = analyzer.testMethod1Part2();
        data[2] = analyzer.testMethod2();
        data[3] = analyzer.testMethod3();
        data[4] = analyzer.testMethod4Part1();
        data[5] = analyzer.testMethod4Part2();
        data[6] = analyzer.testMethod4Part3();
        data[7] = analyzer.testMethod4Part4();
        return data.clone();
    }
    public long[] testForArray2(){
        Integer[] testArray = createSortedArrayWithX(length, maxStep, range);
        AnalyzerOfSortingMethods analyzer = new AnalyzerOfSortingMethods(testArray);
        data[0] = analyzer.testMethod1Part1();
        data[1] = analyzer.testMethod1Part2();
        data[2] = analyzer.testMethod2();
        data[3] = analyzer.testMethod3();
        data[4] = analyzer.testMethod4Part1();
        data[5] = analyzer.testMethod4Part2();
        data[6] = analyzer.testMethod4Part3();
        data[7] = analyzer.testMethod4Part4();
        return data.clone();
    }
    public long[] testForArray3(){
        Integer[] testArray = createBacksortedArray(length, maxStep, range);
        AnalyzerOfSortingMethods analyzer = new AnalyzerOfSortingMethods(testArray);
        data[0] = analyzer.testMethod1Part1();
        data[1] = analyzer.testMethod1Part2();
        data[2] = analyzer.testMethod2();
        data[3] = analyzer.testMethod3();
        data[4] = analyzer.testMethod4Part1();
        data[5] = analyzer.testMethod4Part2();
        data[6] = analyzer.testMethod4Part3();
        data[7] = analyzer.testMethod4Part4();
        return data.clone();
    }
    public long[] testForArray4(){
        Integer[] testArray = createUnsortedArray(length, maxStep, range);
        AnalyzerOfSortingMethods analyzer = new AnalyzerOfSortingMethods(testArray);
        data[0] = analyzer.testMethod1Part1();
        data[1] = analyzer.testMethod1Part2();
        data[2] = analyzer.testMethod2();
        data[3] = analyzer.testMethod3();
        data[4] = analyzer.testMethod4Part1();
        data[5] = analyzer.testMethod4Part2();
        data[6] = analyzer.testMethod4Part3();
        data[7] = analyzer.testMethod4Part4();
        return data.clone();
    }

}
