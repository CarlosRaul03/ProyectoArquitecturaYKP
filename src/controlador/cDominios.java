/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.vMenuNuevaPartida;
import vista.vMenuPrincipal;

/**
 *
 * @author karls
 */
public class cDominios {
    
    
    static vMenuNuevaPartida ui;
    
    public static void cargarMenuPrincipal(){
        vMenuPrincipal ui = new vMenuPrincipal();
        ui.setVisible(true);
    }
    
    public static void cargarMenuPartida(){
        if (ui == null) {
            ui = new vMenuNuevaPartida();
        }//sigleton
        ui.setVisible(true);
    }
}
