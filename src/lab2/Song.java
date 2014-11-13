package lab2;

import java.util.Objects;

public class Song {
    private String id;
    private String songName;
    private String authName;
    private String genre;
    
    public String getSongInfo(int id, String songName, String authName, String genre){
        return id + " Name: " + songName + " Author: " + authName + " Genre: " + genre;
    }
    
    public Song(String id, String songName, String authName, String genre){
        this.id = id;
        this.songName = songName;
        this.authName = authName;
        this.genre = genre;
    }
    
    private String generateId(String id){
        return id;
    }
    
    private String retrieveSongName(String songName){
        return songName;
    }
    
    private String retrieveAuthorName(String authName){
        return authName;
    }
    
    private String genre(String genre){
        return genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;    
    }
    
    @Override
    public String toString() {
        return "ID: " + id + " Song Name: " + songName + " Author Name: " + authName + " Genre: " + genre ;
    }
    
}
