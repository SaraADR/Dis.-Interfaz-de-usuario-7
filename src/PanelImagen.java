

import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelImagen extends JPanel{
   
    private double panelHeight; 
    private double panelWidth;
    private Imagen img;  

    public void setImagen(Imagen i){
        this.img=i;
    }

    @Override
    public void paintComponent(Graphics g){
        panelHeight = this.getSize().getHeight();
        panelWidth = this.getSize().getWidth();  
        try{
            
            g.drawImage(img.getBufferedImage(), 0, 0, null);
            repaint();
        }catch (NullPointerException ex) {}   
    }
    
}

  

