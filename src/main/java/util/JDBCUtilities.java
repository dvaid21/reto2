package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.io.File;
public class JDBCUtilities {
    
    private static final String UBICACION_BD= "D:/MISION_TIC/Ciclo2/rETOS/ProyectosConstruccion.db";//Ruta absoluta
    //private static final String UBICACION_BD= "D:\\MISION_TIC\\Ciclo2\\rETOS";//Ruta absoluta

    public static Connection getConnection() throws SQLException{
        String url="jdbc:sqlite:" + JDBCUtilities.UBICACION_BD; //API:DRIVER
        return DriverManager.getConnection(url);

    }
    
    public static boolean estaVacia(){
        File archivo = new File(JDBCUtilities.UBICACION_BD);
        return archivo.length() == 0;
    }
}
