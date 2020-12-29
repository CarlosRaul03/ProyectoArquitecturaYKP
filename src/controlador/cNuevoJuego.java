
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;


public class cNuevoJuego implements ActionListener {
    private vJuego vJuego;
    private vMenuCargarPartida vMenuCargarPartida;
    private vMenuPrincipal vMenuPrincipal;
    private vMenuNuevaPartida vMenuNuevaPartida;
    private mJuego juego;

    public cNuevoJuego(vJuego vJuego, mJuego juego) {
        this.vJuego = vJuego;
        this.juego = juego;
    }
    
    

    public void ingresoJugador(){
        String Jugador1=JOptionPane.showInputDialog("Ingrese el nombre del jugador1",this);
        vJuego.lbJugador1.setText(Jugador1);
        String Jugador2=JOptionPane.showInputDialog("Ingrese el nombre del jugador2",this);
        vJuego.lbJugador2.setText(Jugador2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
