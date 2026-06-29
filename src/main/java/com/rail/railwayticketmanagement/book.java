package com.rail.railwayticketmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="book")

public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String schedulename;
    private String boarding;
    private String passengername;
    private int passengerage;
   
    public book(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getSchedulename(){
        return schedulename;
    }
    public void setSchedulename(String schedulename){
        this.schedulename = schedulename;
    }
    public String getBoarding(){
        return boarding;
    }
    public void setBoarding(String boarding){
        this.boarding = boarding;
    }
    public String getPassengername(){
        return passengername;
    }
    public void setPassengername(String passengername){
        this.passengername = passengername;
    }
    public int getPassengerage(){
        return passengerage;
    }
    public void setPassengerage(int passengerage){
        this.passengerage = passengerage;
    }
    
}
