package com.mycompany.component;

import java.awt.Font;
import java.io.File;
import javax.swing.JLabel;

public class ArtisTryTitle extends JLabel {
    
    public ArtisTryTitle(float fontSize) {
        this(fontSize, "java/com/yoko/fonts/moglandemo.regular.ttf");
    }

    public ArtisTryTitle(float fontSize, String fontFilePath) {
        try {
            File fontStyle = new File(fontFilePath);
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(Font.BOLD, fontSize);
            this.setFont(font);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
