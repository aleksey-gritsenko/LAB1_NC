package sorters;
/**
 * @author <p>
Gritsenko
 * </p>
 * @see BubbleUpSorter
 **/
public class BubbleDownSorter extends BubbleSort {
    public void sort(int[] array){
        while (flag == true){
            flag = false;
            for(int i = array.length-1;i>0;i--){
                if(array[i] < array[i-1]){
                    flag = true;
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
        }
    }
}
