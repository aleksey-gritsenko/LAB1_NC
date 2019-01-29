package analyzer;

import sorters.Sorter;

public class AnalyzerOfSortingMethods {
    private Integer[] array;

    public AnalyzerOfSortingMethods(Integer[] array){
        this.array = array;
    }
    // must be revorked with Reflection API
    public long testMethod1Part1(){
        long start = System.nanoTime();
        Sorter.bubbleSortUp(array);
        return (System.nanoTime() - start);
    }
    public long testMethod1Part2(){
        long start = System.nanoTime();
        Sorter.bubbleSortDown(array);
        return (System.nanoTime() - start);
    }
    public long testMethod2(){
        long start = System.nanoTime();
        Sorter.swapSort(array);
        return (System.nanoTime() - start);
    }
    public long testMethod3(){
        long start = System.nanoTime();
        Sorter.arraySort(array);
        return (System.nanoTime() - start);
    }
    public long testMethod4Part1(){
        long start = System.nanoTime();
        Sorter.mergeSort(array,0);
        return (System.nanoTime() - start);
    }
    public long testMethod4Part2(){
        long start = System.nanoTime();
        Sorter.mergeSort(array,1);
        return (System.nanoTime() - start);
    }
    public long testMethod4Part3(){
        long start = System.nanoTime();
        Sorter.mergeSort(array,2);
        return (System.nanoTime() - start);
    }
    public long testMethod4Part4(){
        long start = System.nanoTime();
        Sorter.mergeSort(array,3);
        return (System.nanoTime() - start);
    }
}
