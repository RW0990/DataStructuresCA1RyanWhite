/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class Station extends StationSLL{
    private int stationNo;
    private String stationName;
    private String location;
    private int bikeAmnt;
    
    public Station(){
        stationNo=stationNo;
        stationName=stationName;
        location=location;
        bikeAmnt=bikeAmnt;
    }

    public String getStationName() {
        return stationName;
    }

    public int getStationNo() {
        return stationNo;
    }

    public String getLocation() {
        return location;
    }

    public int getBikeAmnt() {
        return bikeAmnt;
    }

    public void setStationNo(int stationNo) {
        this.stationNo = stationNo;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBikeAmnt(int bikeAmnt) {
        this.bikeAmnt = bikeAmnt;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    
    public void addBike(){
        
    }
    public void removeBike(){
    }
    
    public String getStationInfo(){
        return "";
    }
    public String toString(){
        return getStationInfo();
    }
    
    
    
}
