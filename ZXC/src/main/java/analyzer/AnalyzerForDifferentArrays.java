package analyzer;

import fillers.Filler;
import fillers.Generator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static fillers.Generator.*;
/**
 * @author <p>
Gritsenko
 * </p>
 * @see Generator
 **/
public class AnalyzerForDifferentArrays {
    private int length;
    private int maxStep;
    private int range;
    long[] data;

    public AnalyzerForDifferentArrays(int length,int maxStep,int range){
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
                    tempData = analyzer.getDataSet();
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
}
