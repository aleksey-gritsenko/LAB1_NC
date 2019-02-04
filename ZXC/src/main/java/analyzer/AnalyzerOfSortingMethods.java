package analyzer;

import sorters.*;

public class AnalyzerOfSortingMethods {
    private Integer[] array;

    public AnalyzerOfSortingMethods(Integer[] array){
        this.array = array;
    }
    // must be revorked with Reflection API
    public long testMethod1Part1(){
        long start = System.nanoTime();
        BubbleUpSorter sorter = new BubbleUpSorter();
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod1Part2(){
        long start = System.nanoTime();
        BubbleDownSorter sorter = new BubbleDownSorter();
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod2(){
        long start = System.nanoTime();
        SwapSorter sorter = new SwapSorter();
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod3(){
        long start = System.nanoTime();
        ArraySorter sorter = new ArraySorter();
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod4Part1(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(0);
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod4Part2(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(1);
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod4Part3(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(2);
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
    public long testMethod4Part4(){
        long start = System.nanoTime();
        MergeSorter sorter = new MergeSorter();
        sorter.setType(3);
        sorter.setSortedArray(array);
        sorter.sort();
        return (System.nanoTime() - start);
    }
}
