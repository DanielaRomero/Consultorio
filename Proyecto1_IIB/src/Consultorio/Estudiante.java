package Consultorio;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Estudiante implements Entidad{
    String nombre;
    String apellido;
    String semestre;
    String cedula;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    @Override
    public void insertar() throws SQLException {
        String sql = "INSERT INTO estudiante VALUES(" +
                "'" + cedula + "'," +
                "'" + nombre + "'," +
                "'" + apellido + "'," +
                "'" + semestre + "')";
        Statement sentencia = Conectar.conn.createStatement();
        sentencia.executeUpdate(sql);
    }

    @Override
    public void borrar(String cedula) throws SQLException {
        Statement sentencia = Conectar.conn.createStatement();
        String sql = "DELETE FROM estudiante WHERE CEDULA ='" + cedula + "'";
        sentencia.executeUpdate(sql);
    }

    @Override
    public void cambiar() throws SQLException {
        Statement sentencia = Conectar.conn.createStatement();
        String sql = "UPDATE estudiante SET nombre ='"
                + nombre + "'," 
                + "apellido ='"  + apellido + "',"
                + "semestre ='" + semestre + "'"
                + " WHERE CEDULA = '" + cedula + "'";
                
        sentencia.executeUpdate(sql);
    }

    @Override
    public void mostrarEnTabla(JTable tabla) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Semestre");
        String sql = "SELECT * FROM estudiante";
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
