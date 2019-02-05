package sorters;

public class SwapSorter extends AbstractSorter {
    private int temp;
    private int minVal;
    private int minInd;
    public void sort(int[] array){
        for(int p =0;p<array.length-1;p++){
            minVal = array[p];
            minInd = p;
            for(int i = p+1;i<array.length;i++){
                if(array[i]<minVal){
                    minInd = i;
                    minVal = array[i];
                }
            }
            if(minInd != p){
                temp = array[p];
                array[p] = array[minInd];
                array[minInd] = temp;
            }
        }
    }
}
