
package vista;

import controlador.Controlador;

/**
 *
 * @author roy
 */
public class Panel_Botones extends javax.swing.JPanel {

    
    public Panel_Botones() {
        initComponents();
    }

   public void agregarEventos(Controlador controlador)
   {
       this.btn_Agregar.addActionListener(controlador);
       this.btn_Buscar.addActionListener(controlador);
       this.btn_Modificar.addActionListener(controlador);
       this.btn_Eliminar.addActionListener(controlador);
   }
   
   public void inicio()
   {
       this.btn_Agregar.setEnabled(false);
       this.btn_Buscar.setEnabled(true);
       this.btn_Modificar.setEnabled(false);
       this.btn_Eliminar.setEnabled(false);
   }
   
   
   public void existe()
   {
       this.btn_Agregar.setEnabled(false);
       this.btn_Buscar.setEnabled(false);
       this.btn_Modificar.setEnabled(true);
       this.btn_Eliminar.setEnabled(true);
   }
   
   public void noExiste()
   {
       this.btn_Agregar.setEnabled(true);
       this.btn_Buscar.setEnabled(false);
       this.btn_Modificar.setEnabled(false);
       this.btn_Eliminar.setEnabled(false);
   }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Agregar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        btn_Agregar.setText("Agregar");

        btn_Buscar.setText("Buscar");

        btn_Modificar.setText("Modificar");

        btn_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Buscar)
                .addGap(20, 20, 20)
                .addComponent(btn_Modificar)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
