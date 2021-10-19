/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortvisualiser.Utill;

/**
 *
 * @author petko
 */
import sortvisualiser.SortArray;

public class Util {
    public static int findMaxValueIndex(SortArray array, int upToIndex) {
        int maxIndex = 0;
        for (int i = 0; i < upToIndex; i++) {
            if (array.getValue(i) > array.getValue(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
