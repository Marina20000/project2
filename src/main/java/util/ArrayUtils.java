package util;

public class ArrayUtils {
     public Integer multiplyArraysElements(int[] array) {
        if (array == null) {
            return null;
        }
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result = result * array[i];
        }
        return result;
    }


}
