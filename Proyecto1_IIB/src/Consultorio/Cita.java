package Consultorio;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class Cita implements Entidad{
    String codigo;
    String cedula;
    String id;
    String fecha;
    String turno;
    String horaInicio;
    
   
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTurno(String truno) {
        this.turno = truno;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    @Override
    public void insertar() throws SQLException {
         String sql = "INSERT INTO cita VALUES(" +
                "'" + cedula + "'," +
                "'" + id + "'," +
                "'" + codigo + "'," +
                "'" + turno + "'," +
                "'" + fecha + "'," +
                "'" + horaInicio + "')";
        Statement sentencia = Conectar.conn.createStatement();
        sentencia.executeUpdate(sql);
        
    }
    @Override
    public void borrar(String codigo) throws SQLException {
        Statement sentencia = Conectar.conn.createStatement();
        String sql = "DELETE FROM cita WHERE codigo_cita ='" + codigo + "'";
        sentencia.executeUpdate(sql);
    }

    @Override
    public void cambiar() throws SQLException {
        Statement sentencia = Conectar.conn.createStatement();
        String sql = "UPDATE cita SET cedula ="
                + "'" + cedula + "'," 
                + "id_medico =" + "'" + id + "'," 
                + "turno =" + "'" + turno + "'," 
                + "fecha =" + "'" + fecha + "',"
                + "hora_inicio =" + "'" + horaInicio + "'" 
                + " WHERE codigo_cita = '" + codigo + "'";
        sentencia.executeUpdate(sql); 
        
    }

    @Override
    public void mostrarEnTabla(JTable tabla) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Cedula");
        modelo.addColumn("ID Medico");
        modelo.addColumn("Codigo Cita");
        modelo.addColumn("Turno");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora Inicio");
        String sql = "SELECT * FROM cita";
        Statement sentencia = Conectar.conn.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        ResultSetMetaData rsMd = resultado.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            while(resultado.next()){
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i = 0; i < cantidadColumnas; i++){
                    filas[i] = resultado.getObject(i+1);
                }
                modelo.addRow(filas);
            }
        
    }
        
}
