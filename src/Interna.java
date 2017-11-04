import java.awt.Dimension;

public class Interna extends javax.swing.JInternalFrame {
   
   
    public Interna() {
        initComponents();
       
    }
    
    public void addImage(Imagen img){
        panelImagen1.setImagen(img);
        changeSize(img);
    }
    
    public void changeSize(Imagen img){
        panelImagen1.setPreferredSize(new Dimension((int)img.getWidth(),(int)img.getHeigth()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel1 = new ScrollPanel();
        panelImagen1 = new PanelImagen();

        javax.swing.GroupLayout panelImagen1Layout = new javax.swing.GroupLayout(panelImagen1);
        panelImagen1.setLayout(panelImagen1Layout);
        panelImagen1Layout.setHorizontalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        panelImagen1Layout.setVerticalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        scrollPanel1.setViewportView(panelImagen1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PanelImagen panelImagen1;
    private ScrollPanel scrollPanel1;
    // End of variables declaration//GEN-END:variables
}
