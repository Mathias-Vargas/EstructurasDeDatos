
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Jeffrey Mojica S
 */
public class Alquiler extends javax.swing.JInternalFrame {

    public String user;
    int placa = 0, cantDias = 0, pasajeros = 0;
    String cedula = " ", marca = " ", extras = " ", estado = " ", posicion = "1";
    boolean editar = false;
    private int auxPosicion = 1;

    clsGestionAlquiler cls = new clsGestionAlquiler();
    Vehiculos ve = new Vehiculos();
    Clientes cl = new Clientes();

    DefaultTableModel modelo1 = new DefaultTableModel();
    private int contador = 0;
    public int buscar;

    public Alquiler() {
        initComponents();
        CargarInterfaz(); //Sirven para la tabla
        CargarDatos(); //Sirven para la tabla
        setTitle("Solictar Alquileres");

    }

    public Alquiler(clsGestionAlquiler cls) {
        initComponents();
        this.cls = cls;
    }

    public static LinkedList contenedor = new LinkedList();

    public void CargarInterfaz() {
        String datos[][] = {};
        String columna[] = {"Cedula", "Placa", "Dias", "Psajeros", "Marca", "Extras", "Estado"};
        modelo1 = new DefaultTableModel(datos, columna);
        Tabla.setModel(modelo1);
    }

    public void CargarDatos() {

        clsNodoAlquiler alquiler;

        for (int i = 0; i < Alquiler.contenedor.size(); i++) {

            alquiler = (clsNodoAlquiler) Alquiler.contenedor.get(i);
            modelo1.insertRow(contador, new Object[]{});
            modelo1.setValueAt(alquiler.getDato().getId(), contador, 0);
            modelo1.setValueAt(alquiler.getDato().getPlaca(), contador, 1);
            modelo1.setValueAt(alquiler.getDato().getCantDias(), contador, 2);
            modelo1.setValueAt(alquiler.getDato().getPasajeros(), contador, 3);
            modelo1.setValueAt(alquiler.getDato().getMarca(), contador, 4);
            modelo1.setValueAt(alquiler.getDato().getExtras(), contador, 5);
            modelo1.setValueAt(alquiler.getDato().getEstado(), contador, 6);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        jtxtDias = new javax.swing.JTextField();
        jtxtPlaca = new javax.swing.JTextField();
        jtxtPasajeros = new javax.swing.JTextField();
        jtxtExtras = new javax.swing.JTextField();
        jtxtEstado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jtxtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Cedula");

        jLabel8.setText("Pasajeros");

        jLabel10.setText("Extras");

        jLabel11.setText("Estado");

        jtxtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEstadoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Pantalla");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel4.setText("Dias");

        jButton5.setText("Solicitud");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Dias");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asigna Vehiculos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Monto Superior");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Devolucion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carro.png"))); // NOI18N

        jButton6.setText("Consultar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtxtExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jtxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(45, 45, 45)
                            .addComponent(jtxtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jtxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)
                                    .addComponent(jButton5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4)
                                    .addComponent(btnLimpiar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(146, 146, 146))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtxtExtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void solicitud() {
        cedula = jtxtCedula.getText();
        placa = Integer.parseInt(jtxtPlaca.getText()); //Pide datos
        cantDias = Integer.parseInt(jtxtDias.getText());
        pasajeros = Integer.parseInt(jtxtPasajeros.getText());
        marca = jtxtMarca.getText();
        extras = jtxtExtras.getText();
        estado = jtxtEstado.getText();

        clsAtributosAlquiler a = new clsAtributosAlquiler(cedula, placa, cantDias, pasajeros, marca, extras, estado);
        cls.solicitudAlquiler(a);

        auxPosicion++;
        posicion = Integer.toString(auxPosicion);

        String[] info = new String[8];
        info[0] = jtxtCedula.getText();
        info[1] = jtxtPlaca.getText();
        info[2] = jtxtDias.getText();
        info[3] = jtxtPasajeros.getText();
        info[4] = jtxtMarca.getText();
        info[5] = jtxtExtras.getText();
        info[6] = jtxtEstado.getText();

        jtxtCedula.setText("");
        jtxtPlaca.setText("");
        jtxtDias.setText("");
        jtxtPasajeros.setText("");
        jtxtMarca.setText("");
        jtxtExtras.setText("");
        jtxtEstado.setText("");

        modelo1.addRow(info);
        JOptionPane.showMessageDialog(null, "Solicitud registrado correctamente", "Alquiler Registrado", JOptionPane.INFORMATION_MESSAGE);

    }

 public void consultar() {
     //jtxtCedula.setText(cedula);
     jtxtCedula.setText(cedula);
                jtxtPlaca.setText(Integer.toString(placa));
                jtxtDias.setText(Integer.toString(cantDias));
                jtxtPasajeros.setText(Integer.toString(pasajeros));
                jtxtMarca.setText(marca);
                jtxtExtras.setText(extras);
                jtxtEstado.setText(estado);
//        try {
//            String placa = jtxtPlaca.getText();
//            boolean pase = true;
//            if (pase == true) {  //" ".equals(cedula,
//                String datos = cls.consultar(placa);
//                String[] parts = datos.split(",");
//                String part1 = parts[0]; // jtxtCedula
//                String part2 = parts[1]; // jtxtPlaca
//                String part3 = parts[2]; // jtxtDias
//                String part4 = parts[3]; // jtxtPasajeros
//                String part5 = parts[4]; // jtxtMarca
//                String part6 = parts[5]; // jtxtExtras
//                String part7 = parts[6]; // jtxtEstado
//
//                // Se ponen los datos en los respectivos campos
//                jtxtCedula.setText(part1);
//                jtxtPlaca.setText(part2);
//                jtxtDias.setText(part3);
//                jtxtPasajeros.setText(part4);
//                jtxtMarca.setText(part5);
//                jtxtExtras.setText(part6);
//                jtxtEstado.setText(part7);
//
//                editar = true;
//                
//                
//                JOptionPane.showMessageDialog(null, part1 + " " + part2 + " " + part3 + " " + part4 + " " + part5 + " " + part6 + " " + part7 + " ");
//            } else {
//                JOptionPane.showMessageDialog(null, "Error, los datos no fueron encontrados", "Error Datos", JOptionPane.ERROR_MESSAGE);
//            }
//        } catch (NullPointerException ex) {
//            JOptionPane.showMessageDialog(null, "Error, debe consultar a través de la placa", "Error encontrado", JOptionPane.ERROR_MESSAGE);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            JOptionPane.showMessageDialog(null, "Error, la lista está vacía", "Error encontrado", JOptionPane.ERROR_MESSAGE);
//        }
    }

    public void dias() {
        cls.cantidadDiasS(Integer.toString(cantDias));
        cl.CargarInterfaz();
        cl.CargarDatos();
        JOptionPane.showMessageDialog(null, "Su cantidad de dias ha sido revisada, puede verificar los cambios en su perfil", "VERIFICACION DIAS", JOptionPane.INFORMATION_MESSAGE);

    }

    public void asignaVehiculos() {

        clsAtributosAlquiler a = new clsAtributosAlquiler(cedula, placa, cantDias, pasajeros, marca, extras, estado);
        cls.asignaVehiculos(a);
        ve.CargarInterfaz();
        ve.CargarDatos();
        JOptionPane.showMessageDialog(null, "Vehiculo asignado", "ASIGNACION DE VEHICULO", JOptionPane.INFORMATION_MESSAGE);

    }

    public void montoSuperior() {

        cls.montoSuperior(cedula);
        cl.CargarInterfaz();
        cl.CargarDatos();
        JOptionPane.showMessageDialog(null, "Verficacion de monto realizada, puede verificar los cambios en su perfil", "VERIFICACION DE MONTO", JOptionPane.INFORMATION_MESSAGE);

    }

    public void devolucionVehiculo() {

        cls.devolucionVehiculo(cedula, placa);
        ve.CargarInterfaz();
        ve.CargarDatos();
        JOptionPane.showMessageDialog(null, "Devolucion realizada exitosamente", "DEVOLUCION DE VEHICULO", JOptionPane.INFORMATION_MESSAGE);

    }


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jtxtCedula.setText("");
        jtxtPlaca.setText("");
        jtxtDias.setText("");
        jtxtPasajeros.setText("");
        jtxtMarca.setText("");
        jtxtExtras.setText("");
        jtxtEstado.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEstadoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        solicitud();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dias();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        asignaVehiculos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        montoSuperior();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        devolucionVehiculo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   consultar();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtDias;
    private javax.swing.JTextField jtxtEstado;
    private javax.swing.JTextField jtxtExtras;
    private javax.swing.JTextField jtxtMarca;
    private javax.swing.JTextField jtxtPasajeros;
    private javax.swing.JTextField jtxtPlaca;
    // End of variables declaration//GEN-END:variables
}
