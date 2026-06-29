package com.rail.railwayticketmanagement;


import jakarta.persistence.*;
@Entity
@Table(name="driver")


public class driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String drivername;
    private int drivernumber;
    public driver(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDrivername(){
        return drivername;
    }
    public void setDrivername(String drivername){
        this.drivername = drivername;
    }
    public int getDrivernumber(){
        return drivernumber;
    }
    public void setDrivernumber(int drivernumber){
        this.drivernumber = drivernumber;
    }
    
}

