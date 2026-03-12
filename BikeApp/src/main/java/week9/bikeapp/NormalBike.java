/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class NormalBike extends Bike{
    public NormalBike(int bikeNo, String stationName){
       super(bikeNo,stationName,2.0);
   }
   @Override
   public String getBikeType(){
       return "Normal Bike";
   }
}