package sorters;

public class SwapSorter extends AbstractSorter {
    public void sort(){
        Integer[] array = getSortedArray();
        int temp,minVal,minInd;
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
