import output.Output;

public class Main {
    public static void main(String[] args){
        int length = 100;
        int maxStep = 10;
        int range = length*maxStep;
        Output output = new Output(length,maxStep,range);
        output.printInformation();
    }
}