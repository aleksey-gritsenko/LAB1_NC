package output;

import analyzer.AnalyzerForDifferentArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/**
 * @author <p>
Gritsenko
 * </p>
 **/
public class Output {
    private int length,maxStep,range;
    public Output(int length,int maxStep,int range){
        this.length = length;
        this.maxStep = maxStep;
        this.range = range;
    }
    private void printInformationForArrayType(ArrayList<Long> data){
        int number = 0;
        for (long temp:data) {
            System.out.print("Time of method ");
            System.out.print(number);
            System.out.print(" :");
            System.out.println(temp);
            number++;

        }
    }
    public void printInformation(){
        AnalyzerForDifferentArrays analyzer = new AnalyzerForDifferentArrays(length,maxStep,range);
        //rework with Reflection API
        int number = 0;
        ArrayList<ArrayList<Long>> data = analyzer.getDataSet();
        for (ArrayList<Long> tempData :data){
            System.out.print("\n\nInformation for array type ");
            System.out.print(number);
            System.out.print(" :\n");
            number++;
            printInformationForArrayType(tempData);
        }
        //System.out.println("\n\nInformation for sorted array:\n");
        //analyzer.getDataSet();
        //printInformationForArrayType(analyzer.testForArray1());
        //System.out.println("\n\nInformation for sorted array with random element:\n");
       // printInformationForArrayType(analyzer.testForArray2());
        //System.out.println("\n\nInformation for backsorted array:\n");
       // printInformationForArrayType(analyzer.testForArray3());
        //System.out.println("\n\nInformation for unsorted array:\n");
       // printInformationForArrayType(analyzer.testForArray4());
    }
}
