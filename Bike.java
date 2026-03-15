/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class Bike{
    private int bikeNo;
    private boolean isAvailable;
    private String stationName;
    private double pricePerKm;
    
    public Bike(){
        bikeNo=bikeNo;
        isAvailable=true;
        stationName=stationName;
        pricePerKm=pricePerKm;
    }

    public int getBikeNo() {
        return bikeNo;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public String getStationName() {
        return stationName;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setBikeNo(int bikeNo) {
        this.bikeNo = bikeNo;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }
    
    public void startJourney(){
        isAvailable=false;
    }
    public void endJourney(){
        isAvailable=true;
    }
    public double calCost(double distance){
        return distance * pricePerKm;
    }
    
    public String getDetails(){
        return "Bike No: "+bikeNo+"\n"+"Available: "+isAvailable+"\n"+"At station: "+stationName+"\n"+pricePerKm+" per KM.";
    }
    @Override
    public String toString(){
        return getDetails();
    }
}
