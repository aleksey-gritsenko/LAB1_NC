package analyzer;


import org.reflections.Reflections;
import sorters.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Set;
/**
 * @author <p>
Gritsenko
 * </p>
 **/
public class AnalyzerOfSortingMethods {
    private int[] array;

    public AnalyzerOfSortingMethods(int[] array){
        this.array = array;
    }
    public ArrayList<Long> getDataSet(){
        ArrayList<Long> data = new ArrayList<Long>();
        Reflections reflections = new Reflections("sorters");
        Set<Class<? extends AbstractSorter>> subTypeSorters = reflections.getSubTypesOf(AbstractSorter.class);
        Constructor constructor;
        int[] intArrayExample = new int[10];

        for (Class sorterClass:subTypeSorters){
            if ( Modifier.isAbstract(sorterClass.getModifiers())){}
            else{
                try {
                    constructor = sorterClass.getConstructor(null);
                    Object newObject = constructor.newInstance();
                    Object[] params = {array.clone()};
                    Class[] paramTypes = {intArrayExample.getClass()};
                    Method sortMethod = sorterClass.getMethod("sort",paramTypes);
                    long start = System.nanoTime();
                    sortMethod.invoke(newObject,params);
                    data.add(System.nanoTime() - start);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }
}
