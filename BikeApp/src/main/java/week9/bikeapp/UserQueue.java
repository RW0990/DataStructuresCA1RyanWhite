/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;
import java.util.*;
/**
 *
 * @author ryanwhite
 */
public class UserQueue implements UserQueueInterface {
    private ArrayList <String> userQueue;
    
    public UserQueue(){
        userQueue = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
            return userQueue.isEmpty();
    }
    public int size(){
        return userQueue.size();
    }
    public Object firstElement(){
        if(userQueue.size()>0){
            return userQueue.get(0);
        }else{
            return null;
        }
    }
    public void enqueue(Object element){
        userQueue.add((String)element);
    }
    public Object dequeue(){
        if(userQueue.size()>0){
            return userQueue.remove(0);
        }else{
            return null;
        }
    }
        
}
