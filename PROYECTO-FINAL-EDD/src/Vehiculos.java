
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
public class Vehiculos extends javax.swing.JInternalFrame {

    public String user;
    String anio = " ", cilindrada = " ", capacidadPasajeros = " ", precioAlq = " ";
    String numeroPlaca = " ", marca = " ", modelo = " ", color = " ", tipoDeCombustible = " ", extras = " ", estado = " ", posicion = "1";
    boolean editar = false;
    private int auxPosicion = 1;

    clsGestionVehiculo cls = new clsGestionVehiculo();

    DefaultTableModel modelo1 = new DefaultTableModel();
    private int contador = 0;
    public int buscar;

    public Vehiculos() {
        initComponents();
        CargarInterfaz(); //Sirven para la tabla
        CargarDatos(); //Sirven para la tabla
        setTitle("Agregar, Consultar, Modificar y Editar Vehiculos");
    }

    public Vehiculos(String user, clsGestionVehiculo cls) {
        initComponents();
        this.cls = cls;
    }

    public static LinkedList contenedor = new LinkedList();

    public void CargarInterfaz() {
        String datos[][] = {};
        String columna[] = {"Placa", "Año"};
        modelo1 = new DefaultTableModel(datos, columna);
        Tabla.setModel(modelo1);
    }

    public void CargarDatos() {

        clsNodoVehiculos vehiculo;

        for (int i = 0; i < Vehiculos.contenedor.size(); i++) {

            vehiculo = (clsNodoVehiculos) Vehiculos.contenedor.get(i);
            modelo1.insertRow(contador, new Object[]{});
            modelo1.setValueAt(vehiculo.getDato().getNumeroPlaca(), contador, 0);
            modelo1.setValueAt(vehiculo.getDato().getAnio(), contador, 1);
            
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtCombustible = new javax.swing.JTextField();
        txtPasajeros = new javax.swing.JTextField();
        txtExtras = new javax.swing.JTextField();
        txtCilindrada = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Año");

        jLabel5.setText("Color");

        jLabel6.setText("Cilindrada");

        jLabel7.setText("Combustible");

        jLabel8.setText("Pasajeros");

        jLabel9.setText("Precio");

        jLabel10.setText("Extras");

        jLabel11.setText("Estado");

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carro.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asking.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAnio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(38, 38, 38)
                                    .addComponent(txtCilindrada))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCombustible, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPasajeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void agregar() {
        numeroPlaca = txtPlaca.getText(); 
        anio = (txtAnio.getText());
        cilindrada = (txtCilindrada.getText());
        capacidadPasajeros = (txtPasajeros.getText());
        precioAlq = (txtPrecio.getText());
        marca = txtMarca.getText();
        modelo = txtModelo.getText();
        color = txtColor.getText();
        tipoDeCombustible = txtCombustible.getText();
        extras = txtExtras.getText();
        estado = txtEstado.getText();

        
        clsVehiculos v = new clsVehiculos(numeroPlaca, anio, cilindrada, capacidadPasajeros, precioAlq, marca, modelo, color, tipoDeCombustible, extras, estado);
        cls.registrar(v);

        
        auxPosicion++;
        posicion = Integer.toString(auxPosicion);

        String[] info = new String[5];
        info[0] = txtPlaca.getText();
        info[1] = txtAnio.getText();
        
        txtPlaca.setText("");
        txtCilindrada.setText("");
        txtExtras.setText("");
        txtEstado.setText("");
        txtCombustible.setText("");
        txtAnio.setText("");
        txtColor.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtPasajeros.setText("");
        txtPrecio.setText("");

        modelo1.addRow(info);

        JOptionPane.showMessageDialog(null, "Vehiculo registrado correctamente", "Cliente Registrado", JOptionPane.INFORMATION_MESSAGE);
        limpiar();

    }

    public void consultar() {
        try {
            String placa = txtPlaca.getText();
            boolean pase = true;
            if (pase == true) {  //" ".equals(cedula,
                String datos = cls.consultar(placa);
                String[] parts = datos.split(",");
                String part1 = parts[0]; // placa
                String part2 = parts[1]; // anio
                String part3 = parts[2]; // cilindarada
                String part4 = parts[3]; // pasajeros
                String part5 = parts[4]; // precioAlq
                String part6 = parts[5]; // marca
                String part7 = parts[6]; // modelo
                String part8 = parts[7]; // color
                String part9 = parts[8]; // combustible
                String part10 = parts[9]; // extras
                String part11 = parts[10]; // estado
                // Se ponen los datos en los respectivos campos

                txtPlaca.setText(part1);
                txtAnio.setText(part2);
                txtCilindrada.setText(part3);
                txtPasajeros.setText(part4);
                txtPrecio.setText(part5);
                txtMarca.setText(part6);
                txtModelo.setText(part7);
                txtColor.setText(part8);
                txtCombustible.setText(part9);
                txtExtras.setText(part10);
                txtEstado.setText(part11);

                editar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, los datos no fueron encontrados", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error, debe consultar a través de la placa", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Error, la lista está vacía", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarDatos() {
        txtPlaca.setEnabled(false);
        if (!nulos()) {
            //numeroPlaca = txtPlaca.getText(); //Pide datos
            anio = (txtAnio.getText());
            cilindrada = (txtCilindrada.getText());
            capacidadPasajeros = (txtPasajeros.getText());
            precioAlq = (txtPrecio.getText());
            marca = txtMarca.getText();
            modelo = txtModelo.getText();
            color = txtColor.getText();
            tipoDeCombustible = txtCombustible.getText();
            extras = txtExtras.getText();
            estado = txtEstado.getText();

            if (editar) {

                clsVehiculos v = new clsVehiculos(numeroPlaca, anio, cilindrada, capacidadPasajeros, precioAlq, marca, modelo, color, tipoDeCombustible, extras, estado);
                cls.modificarVehiculo(v);

                int filas = 0;

                String[] datos = new String[11];
                datos[0] = txtPlaca.getText();
                datos[1] = txtAnio.getText();
                datos[2] = txtCilindrada.getText();
                datos[3] = txtPasajeros.getText();
                datos[4] = txtPrecio.getText();
                datos[5] = txtMarca.getText();
                datos[6] = txtModelo.getText();
                datos[7] = txtColor.getText();
                datos[8] = txtCombustible.getText();
                datos[9] = txtExtras.getText();
                datos[10] = txtEstado.getText();

                for (int i = 0; i < Tabla.getColumnCount(); i++) {
                    modelo1.setValueAt(datos[i], filas, i);
                }

            }
        }
        txtPlaca.setEnabled(true);
    }

    public void borrarDatos() {
        try {

            
            numeroPlaca = txtPlaca.getText();
            cls.removerEnPosicion(numeroPlaca);
            CargarInterfaz(); //Sirven para la tabla
            CargarDatos(); //Sirven para la tabla
            JOptionPane.showMessageDialog(null, "Propietario borrado correctamente", "Propietario borrado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar el propietario", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }

        txtPlaca.setText("");
        txtCilindrada.setText("");
        txtExtras.setText("");
        txtEstado.setText("");
        txtCombustible.setText("");
        txtAnio.setText("");
        txtColor.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtPasajeros.setText("");
        txtPrecio.setText("");
    }


    
    public boolean nulos() {
        if (!numeroPlaca.equals("") || !(anio).equals(" ") || !(cilindrada).equals(" ")
                || !(capacidadPasajeros).equals(" ") || !(precioAlq).equals(" ")
                || !marca.equals("") || !modelo.equals("") || !color.equals("") || !tipoDeCombustible.equals("") || !extras.equals("") || !estado.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void limpiar() {
        txtPlaca.setText("");
        txtCilindrada.setText("");
        txtExtras.setText("");
        txtEstado.setText("");
        txtCombustible.setText("");
        txtAnio.setText("");
        txtColor.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtPasajeros.setText("");
        txtPrecio.setText("");
    }


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtPlaca.setText("");
        txtCilindrada.setText("");
        txtExtras.setText("");
        txtEstado.setText("");
        txtCombustible.setText("");
        txtAnio.setText("");
        txtColor.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtPasajeros.setText("");
        txtPrecio.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        editarDatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        borrarDatos();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCilindrada;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCombustible;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtExtras;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPasajeros;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
