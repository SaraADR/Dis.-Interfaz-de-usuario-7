
import boofcv.alg.filter.binary.GThresholdImageOps;
import boofcv.core.image.ConvertImage;
import boofcv.gui.binary.VisualizeBinaryData;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.struct.image.GrayU8;
import boofcv.struct.image.Planar;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Imagen {
    private double imageHeight;
    private double imageWidth;
    private BufferedImage imgUmbral;

    public Imagen(double imageHeight, double imageWidth, BufferedImage imgUmbral) {
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imgUmbral = imgUmbral;
    }


    public Imagen(File f) {
        try {
            this.imgUmbral = ImageIO.read(f);
            this.imageHeight=imgUmbral.getHeight();
            this.imageWidth=imgUmbral.getWidth();
            
        } catch (IOException ex) {
            Logger.getLogger(Imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public BufferedImage getBufferedImage(){
        return imgUmbral;
    }
    public double getHeigth(){
        return imageHeight;
    }
    public double getWidth(){
        return imageWidth;
    }
    
  
    
    public void umbralizar(int umbral) {
        // convierte la imagen en color BufferedImage en formato de la librería BoofCV
        Planar<GrayU8> imagenColor = ConvertBufferedImage.convertFromPlanar(imgUmbral,null, true, GrayU8.class);
        
        // crea dos imágenes en niveles de grises
        GrayU8 imagenGris = new GrayU8(imgUmbral.getWidth(), imgUmbral.getHeight());
        GrayU8 imagenUmbralizada = new GrayU8(imgUmbral.getWidth(), imgUmbral.getHeight());
        // Convierte a niveles de gris la imagen de entrada
        ConvertImage.average(imagenColor,imagenGris);
        // umbraliza la imagen: 
        // ‐ píxeles con nivel de gris > umbral se ponen a 1
        // ‐ píxeles con nivel de gris <= umbra se ponen a 0
        GThresholdImageOps.threshold(imagenGris, imagenUmbralizada, umbral, false);
        // se devuelve la imagen umbralizada en formato BufferedImage
        imgUmbral = VisualizeBinaryData.renderBinary(imagenUmbralizada, false, null);
    }
}
