package sorters;

public class BubbleDownSorter extends AbstractSorter {
    public void sort(){
        boolean flag = true;
        int temp;
        Integer[] array = getSortedArray();
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
