package rocks.zipcode.quiz4.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

       return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> middle = new ArrayList<String>(Arrays.asList(values));
        middle.remove(getMiddleElement(values));

        String[] finalArray = middle.toArray(new String[middle.size()]);
        return finalArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> lastelement = new ArrayList<String>(Arrays.asList(values));
        lastelement.remove(values.length-1);
        String[] lastremoved = lastelement.toArray(new String[lastelement.size()]);
        return lastremoved;
    }


}