package rocks.zipcode.quiz4.fundamentals;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
      int middle = str.length()/2;
        return str.substring(0,middle) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(middle + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {

        int middle = str.length()/2;
        return str.substring(0,middle) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(middle + 1);
    }

    public static Boolean isIsogram(String str) {
        int length = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for(int i = 0; i < length - 1; i++){
            if (arr[i] == arr[i +1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        String [] splitString = str.split("");
        String result = "";
        for (String s :splitString){
            if (Character.isUpperCase(s.charAt(0))){
                result += s.toLowerCase();
            } else {
                result +=s.toUpperCase();
            }
        }
        return result;
    }
}