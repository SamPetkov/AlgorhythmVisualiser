/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortvisualiser.screens;
import static sortvisualiser.MainApp.WIN_HEIGHT;
import static sortvisualiser.MainApp.WIN_WIDTH;

import java.awt.Dimension;

import javax.swing.JPanel;

import sortvisualiser.MainApp;
/**
 *
 * @author petko
 */
public abstract class Screen extends JPanel {
    protected MainApp app;
    
    public Screen(MainApp app) {
        this.app = app;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIN_WIDTH, WIN_HEIGHT);
    }
    
    public abstract void onOpen();
}

