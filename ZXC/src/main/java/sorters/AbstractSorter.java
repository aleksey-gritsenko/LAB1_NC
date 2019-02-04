package sorters;

public abstract class AbstractSorter{
    private Integer[] sortedArray;
    public AbstractSorter(){
    }

    public void setSortedArray(Integer[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public Integer[] getSortedArray() {
        return sortedArray;
    }
    public abstract void sort();
}