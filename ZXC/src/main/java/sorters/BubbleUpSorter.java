package sorters;

public class BubbleUpSorter extends BubbleSort {
    public void sort(){
        Integer[] array = getSortedArray();
        while (flag == true){
            flag = false;
            for(int i =0;i<array.length-1;i++){
                if(array[i] > array[i+1]){
                    flag = true;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
