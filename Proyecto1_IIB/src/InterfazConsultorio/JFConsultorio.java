package InterfazConsultorio;

import Consultorio.Cita;
import Consultorio.Medico;
import com.mysql.jdbc.MysqlDataTruncation;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Consultorio.Estudiante;

/**
 *
 * @author Hp
 */
public class JFConsultorio extends javax.swing.JFrame {
    Medico medico;
    Estudiante estudiante;
    Cita cita;
    public JFConsultorio() {
        initComponents();
        medico = new Medico();
        estudiante = new Estudiante();
        cita = new Cita();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jTPEntidades = new javax.swing.JTabbedPane();
        jPEstudiante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jTFNombreEstudiante = new javax.swing.JTextField();
        jTFApellidoEstudiante = new javax.swing.JTextField();
        jTFSemestre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEstudiante = new javax.swing.JTable();
        jPMedico = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTF_IDMedico = new javax.swing.JTextField();
        jTFNombreMedico = new javax.swing.JTextField();
        jTFApellidoMedico = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaMedico = new javax.swing.JTable();
        jPCita = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaCita = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFCodigoCita = new javax.swing.JTextField();
        jTFIdCita = new javax.swing.JTextField();
        jTFCedulaCita = new javax.swing.JTextField();
        jTFTurnoCita = new javax.swing.JTextField();
        jTFFechaCita = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFHoraCita = new javax.swing.JTextField();
        jBInsertar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBCambiar = new javax.swing.JButton();
        jBVisualizar = new javax.swing.JButton();
        jBBorrarCampos = new javax.swing.JButton();

        setResizable(false);

        jPEstudiante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPEstudianteFocusGained(evt);
            }
        });

        jLabel1.setText("Cédula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Semestre");

        jTFCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCedulaActionPerformed(evt);
            }
        });

        jTFNombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreEstudianteActionPerformed(evt);
            }
        });

        jTFApellidoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidoEstudianteActionPerformed(evt);
            }
        });

        jTablaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Semestre"
            }
        ));
        jScrollPane1.setViewportView(jTablaEstudiante);

        javax.swing.GroupLayout jPEstudianteLayout = new javax.swing.GroupLayout(jPEstudiante);
        jPEstudiante.setLayout(jPEstudianteLayout);
        jPEstudianteLayout.setHorizontalGroup(
            jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEstudianteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(32, 32, 32)
                .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFCedula)
                    .addComponent(jTFNombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTFApellidoEstudiante)
                    .addComponent(jTFSemestre))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPEstudianteLayout.setVerticalGroup(
            jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEstudianteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEstudianteLayout.createSequentialGroup()
                        .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTPEntidades.addTab("Estudiante", jPEstudiante);

        jLabel5.setText("ID");

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellido");

        jTF_IDMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_IDMedicoActionPerformed(evt);
            }
        });

        jTFNombreMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreMedicoActionPerformed(evt);
            }
        });

        jTablaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Medico", "Nombre", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(jTablaMedico);

        javax.swing.GroupLayout jPMedicoLayout = new javax.swing.GroupLayout(jPMedico);
        jPMedico.setLayout(jPMedicoLayout);
        jPMedicoLayout.setHorizontalGroup(
            jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMedicoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTF_IDMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jTFNombreMedico)
                    .addComponent(jTFApellidoMedico))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPMedicoLayout.setVerticalGroup(
            jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMedicoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTF_IDMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFApellidoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPMedicoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPEntidades.addTab("Médico", jPMedico);

        jTablaCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Cita", "ID Medico", "Cedula", "Turno", "Fecha", "Hora Inicio"
            }
        ));
        jScrollPane3.setViewportView(jTablaCita);

        jLabel8.setText("Codigo");

        jLabel9.setText("ID Médico");

        jLabel10.setText("Cédula Estudiante");

        jLabel11.setText("Turno");

        jLabel12.setText("Fecha");

        jTFCodigoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoCitaActionPerformed(evt);
            }
        });

        jTFIdCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdCitaActionPerformed(evt);
            }
        });

        jTFCedulaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCedulaCitaActionPerformed(evt);
            }
        });

        jTFTurnoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTurnoCitaActionPerformed(evt);
            }
        });

        jTFFechaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaCitaActionPerformed(evt);
            }
        });

        jLabel13.setText("Hora de Inicio");

        jTFHoraCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHoraCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCitaLayout = new javax.swing.GroupLayout(jPCita);
        jPCita.setLayout(jPCitaLayout);
        jPCitaLayout.setHorizontalGroup(
            jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPCitaLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCitaLayout.createSequentialGroup()
                            .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPCitaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(25, 25, 25)))
                .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFFechaCita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jTFTurnoCita, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCedulaCita, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFIdCita, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFHoraCita)
                    .addComponent(jTFCodigoCita, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPCitaLayout.setVerticalGroup(
            jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCitaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPCitaLayout.createSequentialGroup()
                        .addComponent(jTFCodigoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCedulaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTurnoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(jPCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTFHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCitaLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTPEntidades.addTab("Cita", jPCita);

        jBInsertar.setText("Insertar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBCambiar.setText("Cambiar");
        jBCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCambiarActionPerformed(evt);
            }
        });

        jBVisualizar.setText("Visualizar");
        jBVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarActionPerformed(evt);
            }
        });

        jBBorrarCampos.setText("Borrar Campos");
        jBBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPEntidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCambiar)
                    .addComponent(jBInsertar)
                    .addComponent(jBBorrar)
                    .addComponent(jBVisualizar)
                    .addComponent(jBBorrarCampos))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jBInsertar)
                        .addGap(27, 27, 27)
                        .addComponent(jBBorrar)
                        .addGap(28, 28, 28)
                        .addComponent(jBCambiar)
                        .addGap(33, 33, 33)
                        .addComponent(jBVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBorrarCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTPEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPEstudianteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPEstudianteFocusGained
        
    }//GEN-LAST:event_jPEstudianteFocusGained

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed
        int entidadSeleccionada = jTPEntidades.getSelectedIndex();
        switch (entidadSeleccionada){
            case 0: // Si se se esta usando Estudiante
                estudiante.setCedula(jTFCedula.getText());
                estudiante.setNombre(jTFNombreEstudiante.getText());
                estudiante.setApellido(jTFApellidoEstudiante.getText());
                estudiante.setSemestre(jTFSemestre.getText());
                try{
                    estudiante.insertar();
                    JOptionPane.showMessageDialog(null,"Registro insertado exitosamente");
                    estudiante.mostrarEnTabla(jTablaEstudiante);
                    
                }catch(SQLException e){
                    e.printStackTrace();
                    if(e instanceof MySQLIntegrityConstraintViolationException)
                        JOptionPane.showMessageDialog(null, "La Cedula ingresada ya existe");
                    if (e instanceof MysqlDataTruncation)
                        JOptionPane.showMessageDialog(null, "Se ha excedido el tamaño máximo de un dato", "Exceso de caracteres", JOptionPane.ERROR_MESSAGE);
                        
                }
                break;
                
            case 1: // Si se esta usando Medico
                medico.setId(jTF_IDMedico.getText());
                medico.setNombre(jTFNombreMedico.getText());
                medico.setApellido(jTFApellidoMedico.getText());
                try{
                    medico.insertar();
                    JOptionPane.showMessageDialog(null, "Registro insertado existosamente");
                    medico.mostrarEnTabla(jTablaMedico);
                }catch(SQLException e){
                    e.printStackTrace();
                    
                    if(e instanceof MySQLIntegrityConstraintViolationException)
                        JOptionPane.showMessageDialog(null, "La ID ingresada ya existe");
                    if (e instanceof MysqlDataTruncation)
                        JOptionPane.showMessageDialog(null, "Se ha excedido el tamaño máximo de un dato", "Exceso de caracteres", JOptionPane.ERROR_MESSAGE);
                        }
                break;
                
            case 2: // Si se esta usando Cita 
                cita.setCodigo(jTFCodigoCita.getText());
                cita.setId(jTFIdCita.getText());
                cita.setCedula(jTFCedulaCita.getText());
                cita.setTurno(jTFTurnoCita.getText());
                cita.setFecha(jTFFechaCita.getText());
                cita.setHoraInicio(jTFHoraCita.getText());
                
                try{
                    cita.insertar();
                    JOptionPane.showMessageDialog(null, "Registro insertado existosamente");
                    cita.mostrarEnTabla(jTablaCita);
                }catch(SQLException e){
                    e.printStackTrace();
                    
                    if(e instanceof MySQLIntegrityConstraintViolationException)
                        JOptionPane.showMessageDialog(null, "La ID ingresada ya existe");
                    if (e instanceof MysqlDataTruncation)
                        JOptionPane.showMessageDialog(null, "Se ha excedido el tamaño máximo de un dato", "Exceso de caracteres", JOptionPane.ERROR_MESSAGE);
                        }
                break;
        }
    }//GEN-LAST:event_jBInsertarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int entidadSeleccionada = jTPEntidades.getSelectedIndex();
        switch (entidadSeleccionada) {
            case 0: // Si se se esta usando Estudiante
                try{
                    estudiante.borrar(jTFCedula.getText());
                    JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                    estudiante.mostrarEnTabla(jTablaEstudiante);
                }catch(SQLException e){
                    e.printStackTrace();
                    if(e instanceof MySQLIntegrityConstraintViolationException){
                        JOptionPane.showMessageDialog(null, "Se esta violando una restricción de integridad de la base de datos", "Violación de integridad", JOptionPane.ERROR_MESSAGE);
                    }                    
                }
                break;
                
            case 1: // Si se esta usando Medico
                try{
                    medico.borrar(jTF_IDMedico.getText());
                    JOptionPane.showMessageDialog(null, "Registro eliminado existosamente");
                    medico.mostrarEnTabla(jTablaMedico);
                    
                }catch(SQLException e){
                    e.printStackTrace();
                    if(e instanceof MySQLIntegrityConstraintViolationException){
                        JOptionPane.showMessageDialog(null, "Se esta violando una restricción de integridad de la base de datos", "Violación de integridad", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
            case 2: // Si se esta usando Cita 
                try{
                    cita.borrar(jTFCodigoCita.getText());
                    JOptionPane.showMessageDialog(null, "Registro eliminado existosamente");
                    cita.mostrarEnTabla(jTablaCita);
                    
                }catch(SQLException e){
                    e.printStackTrace();
                    if(e instanceof MySQLIntegrityConstraintViolationException){
                        JOptionPane.showMessageDialog(null, "Se esa violando una restricción de integridad de la base de datos", "Violación de integridad", JOptionPane.ERROR_MESSAGE);
                    }                    
                }
                break;
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCambiarActionPerformed
        int entidadSeleccionada = jTPEntidades.getSelectedIndex();
        switch (entidadSeleccionada) {
            case 0: // Si se se esta usando Estudiante
                estudiante.setCedula(jTFCedula.getText());
                estudiante.setNombre(jTFNombreEstudiante.getText());
                estudiante.setApellido(jTFApellidoEstudiante.getText());
                estudiante.setSemestre(jTFSemestre.getText());
                
                try{
                    estudiante.cambiar();
                    JOptionPane.showMessageDialog(null, "Registro actualizado");
                    estudiante.mostrarEnTabla(jTablaEstudiante);
                }catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            case 1: // Si se esta usando Medico
                medico.setId(jTF_IDMedico.getText());
                medico.setNombre(jTFNombreMedico.getText());
                medico.setApellido(jTFApellidoMedico.getText());
                
                try{
                    medico.cambiar();
                    JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
                    medico.mostrarEnTabla(jTablaMedico);
                }catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            case 2: // Si se esta usando Cita 
                cita.setId(jTFIdCita.getText());
                cita.setCodigo(jTFCodigoCita.getText());
                cita.setFecha(jTFFechaCita.getText());
                cita.setCedula(jTFCedulaCita.getText());
                cita.setHoraInicio(jTFHoraCita.getText());
                cita.setTurno(jTFTurnoCita.getText());
                
                try{
                    cita.cambiar();
                    JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
                    cita.mostrarEnTabla(jTablaCita);
                }catch(SQLException e){
                    e.printStackTrace();
                }
                break;
                
        }
    }//GEN-LAST:event_jBCambiarActionPerformed

    private void jBVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarActionPerformed
        int entidadSeleccionada = jTPEntidades.getSelectedIndex();
        switch (entidadSeleccionada) {
            case 0: // Si se se esta usando Estudiante
                try {
                    estudiante.mostrarEnTabla(jTablaEstudiante);
                    
                }catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            case 1: // Si se esta usando Medico
                try{
                    medico.mostrarEnTabla(jTablaMedico);
                }catch(SQLException e){
                    e.printStackTrace();
                }
            case 2: // Si se esta usando Cita 
                try{
                    cita.mostrarEnTabla(jTablaCita);
                }catch(SQLException e){
                    e.printStackTrace();
                }
                break;
              
        }   
    }//GEN-LAST:event_jBVisualizarActionPerformed

    private void jTF_IDMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_IDMedicoActionPerformed
        jTFNombreMedico.requestFocus();
    }//GEN-LAST:event_jTF_IDMedicoActionPerformed

    private void jTFNombreMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreMedicoActionPerformed
        jTFApellidoMedico.requestFocus();
    }//GEN-LAST:event_jTFNombreMedicoActionPerformed

    private void jTFCodigoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoCitaActionPerformed
        jTFIdCita.requestFocus();
    }//GEN-LAST:event_jTFCodigoCitaActionPerformed

    private void jBBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarCamposActionPerformed
        int entidadSeleccionada = jTPEntidades.getSelectedIndex();
        switch(entidadSeleccionada){
            case 0:
                jTFCedula.setText("");
                jTFApellidoEstudiante.setText("");
                jTFNombreEstudiante.setText("");
                jTFSemestre.setText("");
                break;
            case 1:
                jTF_IDMedico.setText("");
                jTFNombreMedico.setText("");
                jTFApellidoMedico.setText("");
                break;
            case 2:
                jTFCodigoCita.setText("");
                jTFIdCita.setText("");
                jTFCedulaCita.setText("");
                jTFTurnoCita.setText("");
                jTFFechaCita.setText("");
                jTFHoraCita.setText("");
                break;
        }
    }//GEN-LAST:event_jBBorrarCamposActionPerformed

    private void jTFCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCedulaActionPerformed
        jTFNombreEstudiante.requestFocus();
    }//GEN-LAST:event_jTFCedulaActionPerformed

    private void jTFNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreEstudianteActionPerformed
        jTFApellidoEstudiante.requestFocus();
    }//GEN-LAST:event_jTFNombreEstudianteActionPerformed

    private void jTFApellidoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidoEstudianteActionPerformed
        jTFSemestre.requestFocus();
    }//GEN-LAST:event_jTFApellidoEstudianteActionPerformed

    private void jTFIdCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdCitaActionPerformed
        jTFCedulaCita.requestFocus();
    }//GEN-LAST:event_jTFIdCitaActionPerformed

    private void jTFCedulaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCedulaCitaActionPerformed
       jTFTurnoCita.requestFocus();
    }//GEN-LAST:event_jTFCedulaCitaActionPerformed

    private void jTFTurnoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTurnoCitaActionPerformed
        jTFFechaCita.requestFocus();
    }//GEN-LAST:event_jTFTurnoCitaActionPerformed

    private void jTFHoraCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHoraCitaActionPerformed

    }//GEN-LAST:event_jTFHoraCitaActionPerformed

    private void jTFFechaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaCitaActionPerformed
        jTFHoraCita.requestFocus();
    }//GEN-LAST:event_jTFFechaCitaActionPerformed

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
            java.util.logging.Logger.getLogger(JFConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConsultorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFConsultorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBorrarCampos;
    private javax.swing.JButton jBCambiar;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPCita;
    private javax.swing.JPanel jPEstudiante;
    private javax.swing.JPanel jPMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTFApellidoEstudiante;
    private javax.swing.JTextField jTFApellidoMedico;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFCedulaCita;
    private javax.swing.JTextField jTFCodigoCita;
    private javax.swing.JTextField jTFFechaCita;
    private javax.swing.JTextField jTFHoraCita;
    private javax.swing.JTextField jTFIdCita;
    private javax.swing.JTextField jTFNombreEstudiante;
    private javax.swing.JTextField jTFNombreMedico;
    private javax.swing.JTextField jTFSemestre;
    private javax.swing.JTextField jTFTurnoCita;
    private javax.swing.JTextField jTF_IDMedico;
    private javax.swing.JTabbedPane jTPEntidades;
    private javax.swing.JTable jTablaCita;
    private javax.swing.JTable jTablaEstudiante;
    private javax.swing.JTable jTablaMedico;
    // End of variables declaration//GEN-END:variables
}
