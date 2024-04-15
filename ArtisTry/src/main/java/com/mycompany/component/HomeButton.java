/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.component;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HomeButton {
    
    public static ImageIcon scaleImg (String path, int width, int height){
        
        return new ImageIcon (new ImageIcon(path).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
    
}
