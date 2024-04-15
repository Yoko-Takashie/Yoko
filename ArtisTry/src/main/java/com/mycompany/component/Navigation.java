
package com.mycompany.component;
import net.miginfocom.swing.MigLayout;
import java.awt.Graphics;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.Graphics2D;

public class Navigation extends javax.swing.JPanel {

    private MigLayout layout;
    
    public Navigation() {
        initComponents();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        GradientPaint gra = new GradientPaint(0, 0, new Color(0, 87, 0), 0, getHeight(), new Color(37, 181, 37));
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
