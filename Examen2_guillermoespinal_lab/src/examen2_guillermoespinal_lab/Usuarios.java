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
public class Usuarios implements Serializable{
    
    //Tendrán nombre, edad, correo, usuario, un canal, 
    //contraseña, canales a los que esta suscrito, una playlist de vídeos favoritos.
    private String nombre;
    private int edad ;
    private String correo ;
    private String usuario;
    private Canal canal;
    private String contra;
    private ArrayList<Canal> suscripciones = new ArrayList();
    private ArrayList<Video> videos_fav = new ArrayList();
    
    private static final long SerialVersionUID=777L;

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String correo, String usuario, Canal canal, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.usuario = usuario;
        this.canal = canal;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Canal> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(ArrayList<Canal> suscripciones) {
        this.suscripciones = suscripciones;
    }
    public void addSubscripciones(Canal sub){
        this.suscripciones.add(sub);
    }

    public ArrayList<Video> getVideos_fav() {
        return videos_fav;
    }

    public void setVideos_fav(ArrayList<Video> videos_fav) {
        this.videos_fav = videos_fav;
    }
    public void addVideo_fav (Video video ){
        this.videos_fav.add(video);
        
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", usuario=" + usuario + ", canal=" + canal + ", contra=" + contra + ", suscripciones=" + suscripciones + ", videos_fav=" + videos_fav + '}';
    }
    
    
}
