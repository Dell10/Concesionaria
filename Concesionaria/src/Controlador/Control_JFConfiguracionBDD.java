package Controlador;
import Modelo.*;
import Vista.*;
import java.sql.*;
public class Control_JFConfiguracionBDD {
    VistaConfiguracionBDD vistaConfig;
    Connection cn;
    ModeloConfiguracion modelConfig;
    public Control_JFConfiguracionBDD(Connection cn){
        this.vistaConfig = new VistaConfiguracionBDD();
        this.cn = cn;
    }
}