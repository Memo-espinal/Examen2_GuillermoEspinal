
package examen2_guillermoespinal_lab;

import java.io.Serializable;
import java.util.ArrayList;

public class Canal implements Serializable{
    //: Contendrán numero de suscriptores, nombre, categoría, numero de vídeos,
    //cantidad de likes y una lista de vídeos propios.
    private ArrayList<Usuarios> subscriptores = new ArrayList<>();
    private String nombre;
    private String categoria;
   // private ArrayList<Video> videos = new ArrayList<Video>();
    private int likes;
    private int videos;
     private ArrayList<Video> vudeos_propios = new ArrayList<Video>();
     
     private static final long SerialVersionUID=777L;

    public Canal() {
    }

    public Canal(String nombre, String categoria, int likes) {
        this.nombre = nombre;
        setCategoria(categoria);
        this.likes = likes;
    }

    public ArrayList<Usuarios> getSubscriptores() {
        return subscriptores;
    }

    public void setSubscriptores(ArrayList<Usuarios> subscriptores) {
        this.subscriptores = subscriptores;
    }
    
    public void addSubcriptores(Usuarios sub){
        this.subscriptores.add(sub);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria.equals("Juegos")) {
            this.categoria= "Juegos";
        }else if (categoria.equals("Entretenimiento")){
            this.categoria= "Entretenimiento";
        }else if (categoria.equals("Deportes")){
            this.categoria= "Deportes";
        }
        //this.categoria = categoria;
    }

    /* public ArrayList<Video> getVideos() {
    return videos;
    }
    
    public void setVideos(ArrayList<Video> videos) {
    this.videos = videos;
    }*/

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Video> getVudeos_propios() {
        return vudeos_propios;
    }

    public void setVudeos_propios(ArrayList<Video> vudeos_propios) {
        this.vudeos_propios = vudeos_propios;
    }
    public void addVideos_propios(Video prop){
        this.vudeos_propios.add(prop);
    }

    @Override
    public String toString() {
        return nombre +"-Categoria: "+ categoria  ;//"Canal{" + "subscriptores=" + subscriptores + ", nombre=" + nombre + ", categoria=" + categoria + ", videos=" + videos + ", likes=" + likes + ", vudeos_propios=" + vudeos_propios + '}';
    }
    
     
     
    
}
