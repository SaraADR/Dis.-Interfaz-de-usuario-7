import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelImagen extends JPanel{
   

    private Imagen img;  

    public void setImagen(Imagen i){
        this.img=i; 
    }

    @Override
    public void paintComponent(Graphics g){
        try{
            g.drawImage(img.getBufferedImage(), 0, 0, null);
        }catch (NullPointerException ex) {}   
    }
    
}

  

