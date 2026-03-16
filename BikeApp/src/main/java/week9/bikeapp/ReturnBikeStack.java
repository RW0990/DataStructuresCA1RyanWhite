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
public class ReturnBikeStack implements RentBikeStackInterface {
    private ArrayList <String> bikeStack;
    
    public ReturnBikeStack(){
        bikeStack = new ArrayList<String>();
    }
    public int size(){
        return bikeStack.size();
    }
    public boolean isEmpty(){
        return bikeStack.isEmpty();
    }
    public boolean isFull(){
        return false;
    }
    public Object pop(){
        if(!(bikeStack.isEmpty())){
            return bikeStack.remove(0);
        }else{
            return null;
        }
    }
    public void push(Object newBike){
        bikeStack.add(0,(String) newBike);
    }
    public void emptyStack(){
        while(!bikeStack.isEmpty()){
            pop();
        }
    }
    
    public String displayStack(){
        int i;
        String word= "";
        if(bikeStack.isEmpty()){
            word=word.concat("No Bikes available");
        }else{
            for(i=0; i<bikeStack.size(); i++){
                word=word.concat(bikeStack.get(i));
                word=word.concat(";");
            }
        }
        return word;
    }
}
