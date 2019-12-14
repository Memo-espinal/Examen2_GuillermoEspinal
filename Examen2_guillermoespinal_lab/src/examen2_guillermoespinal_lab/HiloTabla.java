
package examen2_guillermoespinal_lab;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class HiloTabla  extends Thread{
    private JTable tabla ;
    private JProgressBar barra;
    private JTextArea ta ;
    private boolean vive;
    private boolean avanzar ;
    private ArrayList<Video>videos = new ArrayList<>();

    public HiloTabla(JTable tabla, JProgressBar barra, JTextArea ta,ArrayList<Video>videos) {
        this.videos=videos;
        this.tabla = tabla;
        this.barra = barra;
        this.ta = ta;
        vive=true;
        avanzar=true;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTextArea getTa() {
        return ta;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
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
    
    @Override
    public void run (){
        int cont=0;
        while (vive) {            
            if (avanzar) {
                for (int i = 0; i < videos.size(); i++) {
                    
                     barra.setMaximum(videos.get(i).getTiempo());
                     if (barra.getValue()==barra.getMaximum()) {
                        Object[] newrow ={videos.get(i).getNombre(),videos.get(i).getCanal(),videos.get(i).getTiempo()};
                         DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
                         modelo.addRow(newrow);
                         tabla.setModel(modelo);
                    }
                if (barra.getValue()<barra.getMaximum()) {
                    barra.setValue(barra.getValue()+1);
                    
                    if (barra.getValue()%10==0) {
                        ta.append(videos.get(i).getSubtitulos().get(cont)+"\n");
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
     
    
}
