package Principal;

import Modelo.*;
import Vistas.*;
     

public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.getConnection(); 
        
        //DatosModeloDB datosModeloDB = new DatosModeloDB();
        //datosModeloDB.getDepartamentosEmpresa("844000282");
        //datosModeloDB.pruebaFunciones();
        
        Login login = new Login();
        login.setVisible(true);
        
    }
    
}
