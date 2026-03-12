/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class ElectricBike extends Bike{
   public ElectricBike(int bikeNo, String stationName){
       super(bikeNo,stationName,2.5);
   }
   @Override
   public String getBikeType(){
       return "Electric Bike";
   }
}
