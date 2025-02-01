package Paquete;

import java.util.logging.Level;

public class Caminante implements Runnable {

    PanelSnake panel;
    boolean estado=true;
    
    public Caminante(PanelSnake panel){
        this.panel=panel;
    }
    
    @Override
    public void run() {
        while(estado){
            panel.avanzar();
            panel.repaint();
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Caminante.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void parar(){
        this.estado=false;
    }
    
}
