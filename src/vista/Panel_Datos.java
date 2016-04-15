
package vista;

import controlador.Controlador;
import java.security.Principal;
import modelo.Metodos;



/**
 *
 * @author roy
 */
public class Panel_Datos extends javax.swing.JPanel {

   Metodos metodos;
   Controlador controlador;
    
    public Panel_Datos() {
        initComponents();
        metodos=new Metodos();
        
       
        
    }
    /* Metodo donde se carga la poscion donde se guarda los Texfield*/

   public String[] cargarDatos()
   {
       String[]informacion=new String[5];
       informacion[0]=this.txt_NumeroPrestamo.getText();
       informacion[1]=this.txt_NombreUsuario.getText();
       informacion[2]=this.txt_CedulaUsuario.getText();
       informacion[3]=this.txt_CodigoLibro.getText();
       return informacion;
  }
   
   //Metodo que devuelve la informacion guardad en el texfield de numeroPrestamo
   
   public String getNumeroPrestamo()
   {
       return this.txt_NumeroPrestamo.getText();
   }
   
   
   // metodo que define lo que hay en esa posicion del arreglo a cada texfield
   public void mostrarInformacion(String[] arreglo)
   {
       this.txt_NumeroPrestamo.setText(arreglo[0]);
       this.txt_NombreUsuario.setText(arreglo[1]);
       this.txt_CedulaUsuario.setText(arreglo[2]);
       this.txt_CodigoLibro.setText(arreglo[3]);
   }
   
   //metodo que limpia los campos de los texfield
   public void limpiar()
   {
       this.txt_NumeroPrestamo.setText("");
       this.txt_NombreUsuario.setText("");
       this.txt_CedulaUsuario.setText("");
       this.txt_CodigoLibro.setText("");
   }
   
   
   //metodo que activa y desactiva los texfield de modo inicio
   public void inicio()
   {
       this.txt_CedulaUsuario.setEnabled(false);
       this.txt_CodigoLibro.setEnabled(false);
       this.txt_NombreUsuario.setEnabled(false);
       this.txt_NumeroPrestamo.setEnabled(true);
   }
   
   //metodo que activa y desactiva los texfield si no existe el elemento
   public void noExiste()
   {
       this.txt_CedulaUsuario.setEnabled(true);
       this.txt_CodigoLibro.setEnabled(true);
       this.txt_NombreUsuario.setEnabled(true);
       this.txt_NumeroPrestamo.setEnabled(true);
   }
   
   //metodo que activa y desactiva los texfield si existe el elemento
   public void existe()
   {
       this.txt_CedulaUsuario.setEnabled(true);
       this.txt_CodigoLibro.setEnabled(true);
       this.txt_NombreUsuario.setEnabled(true);
       this.txt_NumeroPrestamo.setEnabled(false);
   }
   
   
   //metodo que asigna al texfield numeroCodigo el codigo
   public void llenarCodigo()
   {
       this.txt_NumeroPrestamo.setText(metodos.devolverCodigo());
   }
   
   
   
   
   
   
   
   
   
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NumeroPrestamo = new javax.swing.JTextField();
        txt_NombreUsuario = new javax.swing.JTextField();
        txt_CedulaUsuario = new javax.swing.JTextField();
        txt_CodigoLibro = new javax.swing.JTextField();

        jLabel1.setText("Numero de Prestamo:");

        jLabel2.setText("Nombre del Usuario:");

        jLabel3.setText("Cedula del Usuario:");

        jLabel4.setText("ISBN del Libro");

        txt_NumeroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_NumeroPrestamoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_NumeroPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txt_NombreUsuario)
                    .addComponent(txt_CedulaUsuario)
                    .addComponent(txt_CodigoLibro))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_CedulaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NumeroPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroPrestamoKeyPressed
       if(evt.getKeyCode()==10)
       {
          // controlador.buscar();
       }
    }//GEN-LAST:event_txt_NumeroPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_CedulaUsuario;
    private javax.swing.JTextField txt_CodigoLibro;
    private javax.swing.JTextField txt_NombreUsuario;
    private javax.swing.JTextField txt_NumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
