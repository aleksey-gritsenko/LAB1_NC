package fillers;

import java.util.Random;
//class for creating arrays
public class Generator {
    private Integer[] Array;
    private int maxStep,range;
    public Generator(int length, int maxStep, int range) {
        this.maxStep = maxStep;
        this.range = range;
        if (length > 0) {
            Array = new Integer[length];
        } else {
            System.out.println("Try another length");
            Array = new Integer[0];
        }
    }
    //method 1 Sorted arraya
    public Integer[] createSortedArray(){
        final Random random = new Random();
        Array[0]  = random.nextInt(maxStep);
        for(int i=1;i<Array.length;i++){
            Array[i] = Array[i-1] + random.nextInt(maxStep);
        }
        return Array.clone();
    }
    //method 2 Sorted array with X
    public Integer[] createSortedArrayWithX(){
        final Random random = new Random();
        Array = this.createSortedArray();
        Array[Array.length-1] = random.nextInt(range);
        return Array.clone();
    }
    //method 3 Backsorted array
    public Integer[] createBacksortedArray(){
        final Random random = new Random();
        Array[0] = maxStep*Array.length;
        for(int i=1;i<Array.length;i++){
            Array[i] = Array[i-1] - random.nextInt(maxStep);
        }
        return Array.clone();
    }
    //method 4 Unsorted array
    public Integer[] createUnsortedArray(){
        final Random random = new Random();
        for(int i=0;i<Array.length;i++){
            Array[i] = random.nextInt(range);
        }
        return Array.clone();
    }
}
