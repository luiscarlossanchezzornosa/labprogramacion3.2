package proy2;

import java.awt.ComponentOrientation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import javax.crypto.spec.PSource;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paule
 */
public class plan2 extends javax.swing.JFrame {
    DefaultTableModel modelo;
     int dato1=1, dato2=2,dato3=3,dato4=4,bandera=0,banderas=0,l;
   metodos mt=new metodos();
   entrada pla2=new entrada();
    Sustitucion sus1 = new Sustitucion ();
    /**
     * Creates new form plan2
     */
    public plan2() {
       initComponents();
       this.setLocationRelativeTo(null);
       modelo=new DefaultTableModel();
       modelo.addColumn("nombre");
       modelo.addColumn("edad");
       modelo.addColumn("cedula");  
       datos.setModel(modelo);
       grupo1.add(rbmagesort);
       grupo1.add(rbburbuja);
       grupo2.add(rbedad);
       grupo2.add(rbcedula);
       
    }
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        grupo2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbburbuja = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jbingresar = new javax.swing.JButton();
        rbedad = new javax.swing.JRadioButton();
        jbbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbmagesort = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        rbcedula = new javax.swing.JRadioButton();
        EntradaPalabra = new javax.swing.JTextField();
        BtnCorrer = new javax.swing.JButton();
        PalabraIntercambiada = new javax.swing.JLabel();
        TamArreglo = new javax.swing.JTextField();
        Btncorrer2 = new javax.swing.JButton();
        Arreglo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 79, 180));

        rbburbuja.setText("burbuja");
        rbburbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbburbujaActionPerformed(evt);
            }
        });

        jLabel5.setText("caracteristicas");
        jLabel5.setOpaque(true);

        jbingresar.setText("ingresar");
        jbingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbingresarActionPerformed(evt);
            }
        });

        rbedad.setText("edad");
        rbedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbedadActionPerformed(evt);
            }
        });

        jbbuscar.setText("buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("nombre");
        jLabel1.setOpaque(true);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("edad");
        jLabel2.setOpaque(true);

        jLabel3.setText("cedula");
        jLabel3.setOpaque(true);

        jLabel4.setText("metodo");
        jLabel4.setOpaque(true);

        rbmagesort.setText("magesort");
        rbmagesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmagesortActionPerformed(evt);
            }
        });

        datos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "edad", "cedula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        datos.getTableHeader().setResizingAllowed(false);
        datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(datos);

        rbcedula.setText("cedula");
        rbcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcedulaActionPerformed(evt);
            }
        });

        EntradaPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaPalabraActionPerformed(evt);
            }
        });

        BtnCorrer.setText("run");
        BtnCorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCorrerActionPerformed(evt);
            }
        });

        PalabraIntercambiada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TamArreglo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Btncorrer2.setText("run");
        Btncorrer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btncorrer2ActionPerformed(evt);
            }
        });

        Arreglo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Ejercicios");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setText("3.2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("3.4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbmagesort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnombre)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtedad)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcedula)
                    .addComponent(rbburbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PalabraIntercambiada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaPalabra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCorrer)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TamArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btncorrer2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Arreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnCorrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PalabraIntercambiada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Arreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TamArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btncorrer2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbmagesort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbburbuja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbedad)
                        .addGap(7, 7, 7)
                        .addComponent(rbcedula)
                        .addGap(12, 12, 12)
                        .addComponent(jbbuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1236, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbingresarActionPerformed
      String[]info=new String[3];
      info[0]=txtnombre.getText();
      info[1]=txtedad.getText();
      info[2]=txtcedula.getText();
      modelo.addRow(info);
      this.txtnombre.setText("");
      this.txtedad.setText("");
      this.txtcedula.setText("");
    }//GEN-LAST:event_jbingresarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void rbmagesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmagesortActionPerformed
    this.bandera=1
    
    ;
    }//GEN-LAST:event_rbmagesortActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
Vector data1 = modelo.getDataVector();
Vector row = (Vector) data1.elementAt(1);
int mColIndex =1;
List colData = new ArrayList(datos.getRowCount());
for (int i = 0; i < datos.getRowCount(); i++) {
row = (Vector) data1.elementAt(i);
colData.add(row.get(mColIndex));
}
Vector data2 = modelo.getDataVector();
Vector row1 = (Vector) data2.elementAt(1);
int mColIndex2 =2;
List colData2 = new ArrayList(datos.getRowCount());
for (int i = 0; i < datos.getRowCount(); i++) {
row = (Vector) data1.elementAt(i);
colData2.add(row.get(mColIndex2));
}


        switch(this.dato1){
        case 1:
        {
        if (this.bandera==1 && this.banderas==3){ 
       mt.margersort((Integer.parseInt(datos.getModel().getValueAt(0, 1).toString())));  
   
        }
         modelo.removeRow(dato1);
        {
            break;
        }
        }
    }
        switch(this.dato2){
        case 2:
 {
        if (this.bandera==1 && this.banderas==4){
            
             mt.margersort((Integer.parseInt(datos.getModel().getValueAt(0, 2).toString())));
           
   
        }
        modelo.removeRow(dato2);
        {
        break;
        }
        }
        }
   switch(this.dato3)
        {   
        case 3:
        {
            
        if (this.bandera==2 && this.banderas==3){
         //modelo.getDataVector().elementAt(1);
            mt.burbuja((Integer.parseInt(datos.getModel().getValueAt(0, 1).toString())));
   
        }
        modelo.removeRow(dato3);
        {
        break;
        }
        }
        }
   switch(this.dato4){
        case 4:
        {
        if (this.bandera==2 && this.banderas==4){
         //modelo.getDataVector().elementAt(2);
            mt.burbuja((Integer.parseInt(datos.getModel().getValueAt(0, 2).toString())));
   
        }
        modelo.removeRow(dato4);
        {
        break;
        }
        }
        }    
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void rbburbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbburbujaActionPerformed
    this.bandera=2
    ;
    }//GEN-LAST:event_rbburbujaActionPerformed

    private void rbedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbedadActionPerformed
    this.banderas=3
    ;
    }//GEN-LAST:event_rbedadActionPerformed

    private void rbcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcedulaActionPerformed
   this.banderas=4
    ;
    }//GEN-LAST:event_rbcedulaActionPerformed

    private void EntradaPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaPalabraActionPerformed

    private void BtnCorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCorrerActionPerformed

        String word=EntradaPalabra.getText();

        sus1.sust(word);

        PalabraIntercambiada.setText(sus1.palabra);
    }//GEN-LAST:event_BtnCorrerActionPerformed

    private void Btncorrer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btncorrer2ActionPerformed

    }//GEN-LAST:event_Btncorrer2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(plan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(plan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(plan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(plan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new plan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Arreglo;
    private javax.swing.JButton BtnCorrer;
    private javax.swing.JButton Btncorrer2;
    private javax.swing.JTextField EntradaPalabra;
    private javax.swing.JLabel PalabraIntercambiada;
    public static javax.swing.JTextField TamArreglo;
    public javax.swing.JTable datos;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.ButtonGroup grupo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbingresar;
    private javax.swing.JRadioButton rbburbuja;
    private javax.swing.JRadioButton rbcedula;
    private javax.swing.JRadioButton rbedad;
    private javax.swing.JRadioButton rbmagesort;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}