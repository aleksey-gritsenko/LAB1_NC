package analyzer;

import fillers.Filler;
import fillers.Generator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

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
    public ArrayList<ArrayList<Long>> getDataSet(){
        int[] testArray;
        boolean flag;
        ArrayList<ArrayList<Long>> data  = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> tempData = new ArrayList<Long>();
        Class classObjectOfGenerator = Generator.class;
        Method[] methods = classObjectOfGenerator.getMethods();
        Annotation[] annotations;
        Object[] params  = {length,maxStep,range};
        AnalyzerOfSortingMethods analyzer;
        for(Method method : methods){
            flag = false;
            annotations = method.getAnnotations();
            for(Annotation annotation : annotations ){
                if(annotation instanceof Filler){
                    flag = true;
                }
            }
            if (flag){
                method.setAccessible(true);
                try {
                    testArray = (int[])method.invoke(null,params);
                    analyzer = new AnalyzerOfSortingMethods(testArray);
//rework with Reflection
                    tempData.add(analyzer.testMethod1Part1());
                    tempData.add(analyzer.testMethod1Part2());
                    tempData.add(analyzer.testMethod2());
                    tempData.add(analyzer.testMethod3());
                    tempData.add(analyzer.testMethod4Part1());
                    tempData.add(analyzer.testMethod4Part2());
                    tempData.add(analyzer.testMethod4Part3());
                    tempData.add(analyzer.testMethod4Part4());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                data.add((ArrayList<Long>)tempData.clone());
                tempData.clear();
            }
        }
        return data;
    }
    // must be revorked with Reflection API
 /*   public long[] testForArray1(){
        int[] testArray = createSortedArray(length, maxStep, range);
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
        int[] testArray = createSortedArrayWithX(length, maxStep, range);
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
        int[] testArray = createBacksortedArray(length, maxStep, range);
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
        int[] testArray = createUnsortedArray(length, maxStep, range);
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
    }*/

}
