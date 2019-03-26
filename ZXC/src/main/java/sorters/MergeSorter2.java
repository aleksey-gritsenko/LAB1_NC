package sorters;

/**
 * @author <p>
Gritsenko
 * </p>
 *<p>Uses {@link Functions.Merger} to merge parts of array during mergesort,<br>
 *     realizes one of the sorting algorithms</p>
 **/
public class MergeSorter2 extends MergeSorter{
    public void sort(int[] array){
        BubbleDownSorter sorter = new BubbleDownSorter();

        int N = (int)(Math.log(array.length)/Math.log(2));
        int length1 = array.length/N;
        int length2 = array.length%N;
        int length;
        int[] tempArray;
        int[] mergeArray = new int[0];
        for(int i =0;i<=N;i++){
            length = (i<N)?length1:length2;
            tempArray = new int[length];
            for(int j = 0;j<length;j++){
                tempArray[j] = array[j+i*length1];
            }
            sorter.sort(tempArray);
            if(i == 0){
                mergeArray = tempArray.clone();
            }else{
                mergeArray = Functions.Merger.Merger(mergeArray,tempArray);
            }
        }
        for(int i =0;i<array.length;i++) {
            array[i] = mergeArray[i];
        }
    }

}
