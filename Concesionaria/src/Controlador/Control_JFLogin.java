package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
public class Control_JFLogin {
    VistaLogin login;
    Connection cn;
    public Control_JFLogin( final Connection cn){
        login = new VistaLogin();
        this.login.bttIniciarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                String usuario = Control_JFLogin.this.login.txtNombreUsuario.getText();
                String contrasenia = Control_JFLogin.this.login.txtContraseniaLogin.getText();
                if(!usuario.isEmpty()){
                    if(usuario.equals("admin@carshop") && contrasenia.equals("123456")){
                        Control_JFConfiguracionBDD configBDD = new Control_JFConfiguracionBDD(cn);
                        
                        login.dispose();
                    }
                    else{
                        
                    }
                }
            }
        });
    }
}
