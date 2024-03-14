/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author Vitor Colley
 */
interface StackInterface {
    
    public void push(Song newSong);
    
    public Song pop();
    
    public int size();
    
    public boolean isEmpty();
}
