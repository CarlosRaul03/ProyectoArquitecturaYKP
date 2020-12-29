
import controlador.cDominios;
import controlador.cNuevoJuego;
import modelo.mJuego;
import vista.vJuego;


public class main {
    public static void main(String[] args) {
        /*cDominios cInterfaces = new cDominios();
        cInterfaces.cargarMenuPrincipal();*/
        
        
        vJuego vJuego1=new vJuego();
        mJuego juego01=new mJuego(0,null ,null);

        cNuevoJuego cNuevoJuego1=new cNuevoJuego(vJuego1, juego01);
        cNuevoJuego1.ingresoJugador();
        vJuego1.setVisible(true);
    
        
    }
}
