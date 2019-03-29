package Functions;
/**
 * @author <p>
Gritsenko
 * </p>
 * <p>Used in {@link sorters.MergeSorter}</p>
 **/
public class Merger {
    public static int[] Merger(int[] array1, int[] array2){
        int length = array1.length + array2.length;
        int[] array = new int[length];

        int p1,p2,p;
        p1=p2=p=0;
        while(p<length){
            if(p1<array1.length && p2<array2.length) {
                if (array1[p1] < array2[p2]) {
                    array[p] = array1[p1];
                    p1++;
                }
                else {
                    array[p] = array2[p2];
                    p2++;
                }
            }
            else{
                if (p2 == array2.length) {
                    array[p] = array1[p1];
                    p1++;
                }
                else {
                    array[p] = array2[p2];
                    p2++;
                }
            }
            p++;
        }


        return array;
    }
}
