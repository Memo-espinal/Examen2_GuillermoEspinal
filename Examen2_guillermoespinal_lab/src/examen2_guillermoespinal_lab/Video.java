/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_guillermoespinal_lab;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Video  implements Serializable {
    //: Tendran nombre, tiempo de reproducción, numero de likes, numero de dislikes, comentarios y subtítulos. 
    private String nombre;
    private int tiempo;
    private int likes;
    private int dislikes;
    private ArrayList<String> comentarios= new ArrayList();
    private ArrayList<String>subtitulos = new ArrayList<>();
    
    private static final long SerialVersionUID=777L;

    public Video() {
    }

    public Video(String nombre, int tiempo, int likes, int dislikes) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }
    public void addComentarios(String coment){
        this.comentarios.add(coment);
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }
    public void addSubtitulos(String sub){
        this.subtitulos.add(sub);
    }

    @Override
    public String toString() {
        return "Video{" + "nombre=" + nombre + ", tiempo=" + tiempo + ", likes=" + likes + ", dislikes=" + dislikes + ", comentarios=" + comentarios + ", subtitulos=" + subtitulos + '}';
    }
    
    
}
