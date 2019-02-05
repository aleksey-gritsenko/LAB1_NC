package fillers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Random;

//class for creating arrays
public class Generator {
    private static int[] Array;
    //method 1 Sorted array
    @Filler(name = "Sorted")
    public static int[] createSortedArray(int length, int maxStep, int range){
        if (length > 0) {
            Array = new int[length];
        } else {
            System.out.println("Try another length");
            Array = new int[0];
        }
        final Random random = new Random();
        Array[0]  = random.nextInt(maxStep);
        for(int i=1;i<Array.length;i++){
            Array[i] = Array[i-1] + random.nextInt(maxStep);
        }
        return Array.clone();
    }
    //method 2 Sorted array with X
    @Filler(name = "Sorted_with_X")
    public static int[] createSortedArrayWithX(int length, int maxStep, int range){
        if (length > 0) {
            Array = new int[length];
        } else {
            System.out.println("Try another length");
            Array = new int[0];
        }
        final Random random = new Random();
        Array = createSortedArray(length,maxStep,range);
        Array[Array.length-1] = random.nextInt(range);
        return Array.clone();
    }
    //method 3 Backsorted array
    @Filler(name = "Backsorted")
    public static int[] createBacksortedArray(int length, int maxStep, int range){
        if (length > 0) {
            Array = new int[length];
        } else {
            System.out.println("Try another length");
            Array = new int[0];
        }
        final Random random = new Random();
        Array[0] = maxStep*Array.length;
        for(int i=1;i<Array.length;i++){
            Array[i] = Array[i-1] - random.nextInt(maxStep);
        }
        return Array.clone();
    }
    //method 4 Unsorted array
    @Filler(name = "Unsorted")
    public static int[] createUnsortedArray(int length, int maxStep, int range){
        if (length > 0) {
            Array = new int[length];
        } else {
            System.out.println("Try another length");
            Array = new int[0];
        }
        final Random random = new Random();
        for(int i=0;i<Array.length;i++){
            Array[i] = random.nextInt(range);
        }
        return Array.clone();
    }
}
