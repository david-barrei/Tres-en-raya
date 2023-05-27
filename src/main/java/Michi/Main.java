
package Michi;

import Controlador.CtControlador;
import Modelo.ClsModelo;
import Vista.FrmInterfaz;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        FrmInterfaz vInterfaz = new FrmInterfaz();
        ClsModelo vModelo = new ClsModelo();
        CtControlador vControlador = new CtControlador(vInterfaz, vModelo);
        vControlador.inicioInterfaz();
        vInterfaz.setVisible(true);
        vInterfaz.setSize(450,450);
        
        
        
    }
    
}
