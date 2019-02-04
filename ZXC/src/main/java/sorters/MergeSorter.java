package sorters;

public class MergeSorter extends AbstractSorter {
    private int type;
    private int maxTypeNumber = 4;
    public void setType(int type) {
        if((type < maxTypeNumber)&&(type>=0))
        this.type = type;
    }
    public void sort(){
        Integer[] array = getSortedArray();
        int N = (int)(Math.log(array.length)/Math.log(2));
        int length1 = array.length/N;
        int length2 = array.length%N;
        int length;
        Integer[] tempArray;
        Integer[] mergeArray = new Integer[0];
        for(int i =0;i<=N;i++){
            length = (i<N)?length1:length2;
            tempArray = new Integer[length];
            for(int j = 0;j<length;j++){
                tempArray[j] = array[j+i*length1];
            }
            switch (type){
                case 0:
                {BubbleUpSorter sorter = new BubbleUpSorter();
                    sorter.setSortedArray(tempArray);
                    sorter.sort();
                    break;
                }
                case 1:
                {BubbleDownSorter sorter = new BubbleDownSorter();
                    sorter.setSortedArray(tempArray);
                    sorter.sort();
                    break;
                }
                case 2:
                {SwapSorter sorter = new SwapSorter();
                    sorter.setSortedArray(tempArray);
                    sorter.sort();
                    break;
                }
                default:
                {ArraySorter sorter = new ArraySorter();
                    sorter.setSortedArray(tempArray);
                    sorter.sort();
                    break;
                }
            }

            if(i == 0){
                mergeArray = tempArray.clone();
            }else{
                mergeArray = Functions.Merger(mergeArray,tempArray);
            }
        }
        for(int i =0;i<array.length;i++) {
            array[i] = mergeArray[i];
        }
    }

}
