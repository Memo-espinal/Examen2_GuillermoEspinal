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
public class playlist implements Serializable{
   // Una lista de vídeos y un tiempo de duración que sera la suma del tiempo de duración de todos los vídeos.
    private ArrayList<Video> videos = new ArrayList<>();
    private int sumatiempo;
    
    private static final long SerialVersionUID=777L;

    public playlist() {
    }

    public playlist(int sumatiempo) {
        this.sumatiempo = sumatiempo;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    public void addVideo(Video video){
        this.videos.add(video);
    }
    //este hay que modificarlo de que vaya sumando el tiempo de los videos
    public int getSumatiempo() {
        return sumatiempo;
    }

    public void setSumatiempo(int sumatiempo) {
        this.sumatiempo = sumatiempo;
    }

    @Override
    public String toString() {
        return "playlist{" + "videos=" + videos + ", sumatiempo=" + sumatiempo + '}';
    }
    
    
    
}
