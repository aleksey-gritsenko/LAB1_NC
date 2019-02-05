package analyzer;

import sorters.*;

public class AnalyzerOfSortingMethods {
    private int[] array;

    public AnalyzerOfSortingMethods(int[] array){
        this.array = array;
    }
    // must be revorked with Reflection API
    public long testMethod1Part1(){
        long start = System.nanoTime();
        BubbleUpSorter sorter = new BubbleUpSorter();
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod1Part2(){
        long start = System.nanoTime();
        BubbleDownSorter sorter = new BubbleDownSorter();
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod2(){
        long start = System.nanoTime();
        SwapSorter sorter = new SwapSorter();
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod3(){
        long start = System.nanoTime();
        ArraySorter sorter = new ArraySorter();
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod4Part1(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(0);
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod4Part2(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(1);
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod4Part3(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(2);
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
    public long testMethod4Part4(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(3);
        sorter.sort(array.clone());
        return (System.nanoTime() - start);
    }
}
