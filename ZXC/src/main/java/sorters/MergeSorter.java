package sorters;
/**
 * @author <p>
    Gritsenko
 * </p>
 *<p>Uses {@link Functions.Merger} to merge parts of array during mergesort,<br>
 *     realizes one of the sorting algorithms</p>
 **/
public class MergeSorter extends AbstractSorter {
    private int type;
    private int maxTypeNumber = 4;
    public void setType(int type) {
        if((type < maxTypeNumber)&&(type>=0))
        this.type = type;
    }
    public void sort(int[] array){
        BubbleUpSorter sorter1 = new BubbleUpSorter();
        BubbleDownSorter sorter2 = new BubbleDownSorter();
        SwapSorter sorter3 = new SwapSorter();
        ArraySorter sorter4 = new ArraySorter();

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
            switch (type){
                case 0:
                    sorter1.sort(tempArray);
                    break;
                case 1:
                    sorter2.sort(tempArray);
                    break;
                case 2:
                    sorter3.sort(tempArray);
                    break;
                default:
                    sorter4.sort(tempArray);
                    break;
            }

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
