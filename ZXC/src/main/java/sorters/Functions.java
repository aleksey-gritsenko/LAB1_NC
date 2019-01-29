package sorters;

public class Functions {
    public static Integer[] Merger(Integer[] array1, Integer[] array2){
        int length = array1.length + array2.length;
        Integer[] array = new Integer[length];

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
    public static void sort(Integer[] A, int left, int right){
        int s = A[(left+right)/2-1];
        int i = left;
        int j = right;
        int temp;
        while (i<=j){
            while (A[i-1]<s && i<=j)
                i++;
            while (A[j-1]>s && i<=j)
                j--;
            if(i<=j){
                temp = A[i-1];
                A[i-1] = A[j-1];
                A[j-1] = temp;
                i++;
                j--;
            }
        }
        if(left<j)
            sort(A,left,j);
        if(i<right)
            sort(A,i,right);
    }

}
