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
public class Medico implements Entidad{
    String id;
    String nombre;
    String apellido;
    
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public void insertar() throws SQLException{
        String sql = "INSERT INTO medico VALUES(" +
                "'" + id + "'," +
                "'" + nombre + "'," +
                "'" + apellido + "')";
        Statement sentencia = Conectar.conn.createStatement();
        sentencia.executeUpdate(sql);
        
    }
    
    @Override
    public void mostrarEnTabla(JTable tabla) throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("ID Medico");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        String sql = "SELECT * FROM medico";
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
    
    @Override
    public void borrar(String id) throws SQLException{
        Statement sentencia = Conectar.conn.createStatement();
        String sql = "DELETE FROM medico WHERE ID_Medico ='" + id + "'";
        sentencia.executeUpdate(sql);
    }
    
    @Override
    public void cambiar() throws SQLException{
        Statement sentencia = Conectar.conn.createStatement();
        String sql = "UPDATE medico SET nombre ="
                + "'" + nombre + "'," 
                + "apellido =" + "'" + apellido + "'" 
                + " WHERE id_medico = '" + id + "'";
        sentencia.executeUpdate(sql);     
    }
    
    
    
}
