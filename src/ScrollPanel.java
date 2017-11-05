import java.awt.event.AdjustmentEvent;
import javax.swing.JScrollPane;

public class ScrollPanel extends JScrollPane{

    public ScrollPanel() {
        
    }
    public void eventoScroll(){
        getHorizontalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            repaint();  
        });
        getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            repaint();
        });
    } 
}
