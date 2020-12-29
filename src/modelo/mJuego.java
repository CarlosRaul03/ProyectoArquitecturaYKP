
package modelo;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class mJuego {
    public int idJuego;
    public mJugador P1;
    public mJugador P2;
    
    public mJuego(){};
    
    public mJuego(int idJuego, mJugador P1, mJugador P2) {
        this.idJuego = idJuego;
        this.P1 = P1;
        this.P2 = P2;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public mJugador getP1() {
        return P1;
    }

    public void setP1(mJugador P1) {
        this.P1 = P1;
    }

    public mJugador getP2() {
        return P2;
    }

    public void setP2(mJugador P2) {
        this.P2 = P2;
    }
    
    public void crearJuego(){
       this.idJuego=100;
       String nombreJ1=JOptionPane.showInputDialog("Ingrese nombre del Jugador 1",this);
       this.P1.setNombre(nombreJ1);
       String nombreJ2=JOptionPane.showInputDialog("Ingrese nombre del Jugador 1",this);
       this.P2.setNombre(nombreJ2);
       
    }
    
}
