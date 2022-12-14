
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
public class Clientes extends javax.swing.JInternalFrame {

    //Variables
    public String user;
    String cedulaCliente = " ", nombre = " ", nacimiento = " ", correo = " ", 
     categorias = " ", posicion = "1";
    boolean editar = false;
    private int auxPosicion = 1;

//Instancia
    clsGestionCliente cls = new clsGestionCliente();

    DefaultTableModel modelo = new DefaultTableModel();
    private int contador = 0;
    public int buscar;

//Constructor
    public Clientes() {
        initComponents();
        CargarInterfaz(); //Sirven para la tabla
        CargarDatos(); //Sirven para la tabla
        setTitle("Agregar, Consultar, Modificar y Editar Clientes");

    }
//Constructor

    public Clientes(String user, clsGestionCliente cls) {
        initComponents();
        this.cls = cls;
    }

    public static LinkedList contenedor = new LinkedList();

//Carga la interfaz con sus respectivos datos
    public void CargarInterfaz() {
        String datos[][] = {};
        String columna[] = {"Cedula", "Nombre"};
        modelo = new DefaultTableModel(datos, columna);
        Tabla.setModel(modelo);
    }

    public void CargarDatos() {

        clsNodoCliente cliente;

        for (int i = 0; i < Clientes.contenedor.size(); i++) {
//Hace get para obtener los datos
            cliente = (clsNodoCliente) Clientes.contenedor.get(i);
            modelo.insertRow(contador, new Object[]{});
            modelo.setValueAt(cliente.getDato().getCedula(), contador, 0);
            modelo.setValueAt(cliente.getDato().getNombre(), contador, 1);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jtxtId = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtCorreo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtborn = new javax.swing.JTextField();
        jtxtCategorias = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jtxtIds = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jtxtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtIdKeyTyped(evt);
            }
        });

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Nacimiento");

        jLabel4.setText("Correo");

        jLabel5.setText("Categorias");

        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
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
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/96.png"))); // NOI18N

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete.png"))); // NOI18N
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asking.png"))); // NOI18N
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/edit.png"))); // NOI18N
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton1.setText("Alquileres");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtCategorias)
                                    .addComponent(jtxtCorreo)
                                    .addComponent(jtxtborn, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtIds, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtIds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtborn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultar))
                            .addComponent(btnEditar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {
        jtxtIds.setText("");
        jtxtNombre.setText("");
        jtxtborn.setText("");
        jtxtCorreo.setText("");
        jtxtCategorias.setText("");
    }

    public void agregar() {
        //Pide datos
        cedulaCliente = jtxtIds.getText(); 
        nombre = jtxtNombre.getText();
        nacimiento = jtxtborn.getText();
        correo = jtxtCorreo.getText();
        categorias = jtxtCategorias.getText();
        boolean pase = true;

        if (pase == true) {
           //Llama al metodo y si le pasan los datos por parametros
            cls.registrarCliente(new clsCliente(cedulaCliente, nombre, 
            nacimiento, correo, categorias));
            auxPosicion++;
            posicion = Integer.toString(auxPosicion);

            // Agrega los datos a la tabla
            String[] info = new String[5];
            info[0] = jtxtIds.getText();
            info[1] = jtxtNombre.getText();

           //Limpia los campos
            jtxtIds.setText("");
            jtxtNombre.setText("");
            jtxtborn.setText("");
            jtxtCorreo.setText("");
            jtxtCategorias.setText("");

           // Agrega los datos a la tabla
            modelo.addRow(info);

            JOptionPane.showMessageDialog(null, "Usuario registrado "
     + "correctamente", "Cliente Registrado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error, hay algunos datos con "
 + " formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultar() {
        try {
            clsCliente c = new clsCliente();
            //Pide el dato
            String cedula = (jtxtIds.getText());
            boolean pase = true;
            if (pase == true) {  
                 //Llama al metodo y lo pasa por parametros
                String datos = cls.buscarCliente(cedula);
                String[] parts = datos.split(",");
                String part1 = parts[0]; // cedula
                String part2 = parts[1]; // nombre
                String part3 = parts[2]; // nacimiento
                String part4 = parts[3]; // correo
                String part5 = parts[4]; // categoria
                // Se ponen los datos en los respectivos campos
                jtxtIds.setText(part1);
                jtxtNombre.setText(part2);
                jtxtborn.setText(part3);
                jtxtCorreo.setText(part4);
                jtxtCategorias.setText(part5);
                editar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, los datos no fueron "
        + "encontrados", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Error, debe consultar a trav??s"
        + " de la cedula", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Error, la lista est?? vac??a",
                 "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void borrarDatos() {
        try {
            String borrarDato = cedulaCliente;
           //Llama al metodo y si le pasan los datos por parametros
            if (cls.search(borrarDato)) {
                JOptionPane.showMessageDialog(null, "Cliente borrado correctamente",
             "Cliente borrado", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Tiene un alquier asociado", 
               "Error encontrado", JOptionPane.ERROR_MESSAGE);
            }
           //Seleccione la tabla y borre
            int filaSelec = Tabla.getSelectedRow();
            if (filaSelec >= 0) {
                modelo.removeRow(filaSelec);
            } else {

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe hacer una consulta y"
 + " luego si lo desea puede borrar el Cliente", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarDatos() {

        if (!nulos()) {
            //Pide datos
            //cedulaCliente = jtxtId.getText();
            nombre = jtxtNombre.getText();
            nacimiento = jtxtborn.getText();
            correo = jtxtCorreo.getText();
            categorias = jtxtCategorias.getText();
            if (editar) {
                //Llama al metodo y si le pasan los datos por parametros
                if (cls.editarCliente(cedulaCliente, nombre, nacimiento, correo,
                categorias) == true) {
                    int filas = 0;
                 // Se ponen los datos en los respectivos campos
                    String[] datos = new String[5];
                    datos[0] = jtxtIds.getText();
                    datos[1] = jtxtNombre.getText();
                    datos[2] = jtxtborn.getText();
                    datos[3] = jtxtCorreo.getText();
                    datos[4] = jtxtCategorias.getText();

                    for (int i = 0; i < Tabla.getColumnCount(); i++) {
                        modelo.setValueAt(datos[i], filas, i);
                    }

                    JOptionPane.showMessageDialog(null, "El Cliente ha sido editado"
 + "       correctamente", "Cliente Editado", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, el Cliente no"
 + "  fue editado correctamente", "Error Modificaci??n", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public boolean nulos() {
        if (!cedulaCliente.equals("") || !nombre.equals("") || !nacimiento.equals("") || !correo.equals("") || !categorias.equals("")) {
            return false;
        } else {
            return true;
        }
    }


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jtxtIds.setText("");
        jtxtNombre.setText("");
        jtxtborn.setText("");
        jtxtCorreo.setText("");
        jtxtCategorias.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        borrarDatos();
        CargarInterfaz(); //Sirven para la tabla
        CargarDatos();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarDatos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtxtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIdKeyTyped

    }//GEN-LAST:event_jtxtIdKeyTyped

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped

    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cls.InfoAlquileres(cedulaCliente);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void borrarDatoTabla() {

    }

    public void borrarTabla() {

    }

    public void actualiza() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtxtCategorias;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtIds;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtborn;
    // End of variables declaration//GEN-END:variables
}
