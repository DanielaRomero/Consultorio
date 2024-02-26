package Consultorio;

import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Hp
 */
public interface Entidad {
    void insertar() throws SQLException;
    void borrar(String id) throws SQLException;
    void cambiar() throws SQLException;
    void mostrarEnTabla(JTable tabla) throws SQLException;
}
