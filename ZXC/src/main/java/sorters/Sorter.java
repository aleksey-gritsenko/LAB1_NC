package sorters;

import java.util.Arrays;

public class Sorter {
    //here must be five methods of sorting an array
    static public void bubbleSortUp(Integer[] array){
        boolean flag = true;
        int temp;
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
    static public void bubbleSortDown(Integer[] array){
        boolean flag = true;
        int temp;
        while (flag == true){
            flag = false;
            for(int i =array.length-1;i>0;i--){
                if(array[i] < array[i-1]){
                    flag = true;
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
        }
    }
    static public void swapSort(Integer[] array){
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
    static public void mergeSort(Integer[] array, int type){
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
                    bubbleSortUp(tempArray);
                    break;
                case 1:
                    bubbleSortDown(tempArray);
                    break;
                case 2:
                    swapSort(tempArray);
                    break;
                case 3:
                    arraySort(tempArray);
                    break;
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
    static public void recursiveSort(Integer[] array){
        Functions.sort(array,1,array.length);
    }
    static public void arraySort(Integer[] array){
        Arrays.sort(array);
    }
}
