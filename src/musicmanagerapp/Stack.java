/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

import java.util.ArrayList;

/**
 *
 * @author Vitor Colley
 */
public class Stack implements StackInterface{
    
    private ArrayList<Song> likedSongs;

    public Stack() {
       
        likedSongs = new ArrayList<>();
        
    }
    
    @Override
    public boolean isEmpty(){
        return likedSongs.isEmpty();
    }
    
    @Override
    public void push(Object newSong){
        likedSongs.add(0, (Song) newSong);
    }
    @Override
    public Song pop(){
        if(!(likedSongs.isEmpty())){
            return likedSongs.remove(0);
        }else{
            return null;
        }
    }
    @Override
    public int size(){
        return likedSongs.size();
    }

    
    
    
    
    
}
