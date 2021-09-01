import util.JDBCUtilities;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        //Manejo del error
        try(Connection conexion = JDBCUtilities.getConnection()){
            if(JDBCUtilities.estaVacia()){
                System.out.println("Se encuentra vacía!");
            }else{
                System.out.println("No está vacía, BD encontrada");
            }
            //Iniciaríamos nuestra aplicación
            //Llamado al menú de inicio de la vista/view
        }catch(SQLException e){
            System.err.println("Error iniciando conexión: "+e);
        }
    }
}
