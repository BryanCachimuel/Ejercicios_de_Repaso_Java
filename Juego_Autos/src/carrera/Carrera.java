package carrera;

import static java.lang.Math.random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Carrera extends Thread {

    // creamos las variables
    private JLabel etiqueta;
    private frmCarrera auto;

    //constructor
    public Carrera(JLabel etiqueta, frmCarrera auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }

    @Override
    public void run() {

        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;

        while (true) {
            try {
                sleep((int) (Math.random() * 1000));
                auto1 = auto.getPrimerAuto().getLocation().x;
                auto2 = auto.getSegundoAuto().getLocation().x;
                auto3 = auto.getTercerAuto().getLocation().x;

                if (auto1 < auto.getFinal().getLocation().x - 125 && auto2 < auto.getFinal().getLocation().x - 125 && auto3 < auto.getFinal().getLocation().x - 125) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    auto.repaint();
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if(etiqueta.getLocation().x >= auto.getFinal().getLocation().x - 125){
            if(auto1 > auto2 && auto1 > auto3){
                JOptionPane.showMessageDialog(null, "El Ganador es el Primer Auto");
            }
            else if(auto2 > auto1 && auto2 > auto1){
                JOptionPane.showMessageDialog(null, "El Ganador es el Segundo Auto");
            }
            else if(auto3 > auto1 && auto3 > auto2){
                JOptionPane.showMessageDialog(null, "El Ganador es el Tercer Auto");
            }
            else{
                JOptionPane.showMessageDialog(null, "Los Autos quedaron Empatados");
            }
        }
    }

}
