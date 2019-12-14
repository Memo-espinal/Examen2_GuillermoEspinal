
package examen2_guillermoespinal_lab;

import java.awt.TextArea;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;


public class Hilovideo extends Thread{
    private boolean vive;
    private boolean avanzar;
    private JProgressBar barra;
    private Video video;
    private JTextArea ta;

    public Hilovideo() {
    }

    public Hilovideo(JProgressBar barra,Video video,JTextArea ta) {
        this.ta=ta;
        this.barra = barra;
        this.video= video;
        this.vive=true;
        this.avanzar=true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
  public void run(){
      int cont =0;
        while (vive) {            
            if (avanzar) {
                barra.setMaximum(video.getTiempo());
                if (barra.getValue()==barra.getMaximum()) {
                    JOptionPane.showMessageDialog(null, "Termino el video");
                    vive=false;
                }
                if (barra.getValue()<barra.getMaximum()) {
                    barra.setValue(barra.getValue()+1);
                    
                    if (barra.getValue()%10==0) {
                        ta.append(video.getSubtitulos().get(cont)+"\n");
                        cont++;
                    }
                    
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
  }
    
}
