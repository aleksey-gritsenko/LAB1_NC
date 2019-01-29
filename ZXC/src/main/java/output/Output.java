package output;

import analyzer.AnalyzerForDifferentArrays;

public class Output {
    private int length,maxStep,range;
    public Output(int length,int maxStep,int range){
        this.length = length;
        this.maxStep = maxStep;
        this.range = range;
    }
    private void printInformationForArrayType(long[] data){
        for (int i =0 ;i<data.length;i++){
            System.out.print("Time of method ");
            System.out.print(i);
            System.out.print(" :");
            System.out.println(data[i]);
        }
    }
    public void printInformation(){
        AnalyzerForDifferentArrays analyzer = new AnalyzerForDifferentArrays(length,maxStep,range);
        //rework with Reflection API
        System.out.println("\n\nInformation for sorted array:\n");
        printInformationForArrayType(analyzer.testForArray1());
        System.out.println("\n\nInformation for sorted array with random element:\n");
        printInformationForArrayType(analyzer.testForArray2());
        System.out.println("\n\nInformation for backsorted array:\n");
        printInformationForArrayType(analyzer.testForArray3());
        System.out.println("\n\nInformation for unsorted array:\n");
        printInformationForArrayType(analyzer.testForArray4());
    }
}
