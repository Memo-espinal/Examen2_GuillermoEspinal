
package examen2_guillermoespinal_lab;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPlaylist {
     private ArrayList<playlist> playlists = new ArrayList();
    private File archivo = null;

    public adminPlaylist(String path) {
        this.archivo= new File(path);
    }

    public ArrayList<playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<playlist> playlists) {
        this.playlists = playlists;
    }
    public void addPlaylist(playlist playlist){
        this.playlists.add(playlist);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminPlaylist{" + "playlists=" + playlists + ", archivo=" + archivo + '}';
    }
    public void cargarArchivo() {
        try {            
            playlists = new ArrayList();
            playlist temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (playlist) objeto.readObject()) != null) {
                        playlists.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (playlist t : playlists) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
}
