/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortvisualiser.algorithms;

import sortvisualiser.SortArray;

/**
 *
 * @author petko
 */
public interface ISortAlgorithm {
    public String getName();

    public long getDelay();

    public void setDelay(long delay);

    public void runSort(SortArray array);
}
