package fillers;

import java.util.Random;
//class for creating arrays
public class Generator {
    private static Integer[] Array;
    //method 1 Sorted arraya
    public static Integer[] createSortedArray(int length, int maxStep, int range){
        if (length > 0) {
            Array = new Integer[length];
        } else {
            System.out.println("Try another length");
            Array = new Integer[0];
        }
        final Random random = new Random();
        Array[0]  = random.nextInt(maxStep);
        for(int i=1;i<Array.length;i++){
            Array[i] = Array[i-1] + random.nextInt(maxStep);
        }
        return Array.clone();
    }
    //method 2 Sorted array with X
    public static Integer[] createSortedArrayWithX(int length, int maxStep, int range){
        if (length > 0) {
            Array = new Integer[length];
        } else {
            System.out.println("Try another length");
            Array = new Integer[0];
        }
        final Random random = new Random();
        Array = createSortedArray(length,maxStep,range);
        Array[Array.length-1] = random.nextInt(range);
        return Array.clone();
    }
    //method 3 Backsorted array
    public static Integer[] createBacksortedArray(int length, int maxStep, int range){
        if (length > 0) {
            Array = new Integer[length];
        } else {
            System.out.println("Try another length");
            Array = new Integer[0];
        }
        final Random random = new Random();
        Array[0] = maxStep*Array.length;
        for(int i=1;i<Array.length;i++){
            Array[i] = Array[i-1] - random.nextInt(maxStep);
        }
        return Array.clone();
    }
    //method 4 Unsorted array
    public static Integer[] createUnsortedArray(int length, int maxStep, int range){
        if (length > 0) {
            Array = new Integer[length];
        } else {
            System.out.println("Try another length");
            Array = new Integer[0];
        }
        final Random random = new Random();
        for(int i=0;i<Array.length;i++){
            Array[i] = random.nextInt(range);
        }
        return Array.clone();
    }
}
