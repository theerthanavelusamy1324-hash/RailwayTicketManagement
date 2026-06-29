package com.rail.railwayticketmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="train")


public class train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String trainname;
    private int trainnumber;
    public train(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTrainname(){
        return trainname;
    }
    public void setTrainname(String trainname){
        this.trainname = trainname;
    }
    public int getTrainnumber(){
        return trainnumber;
    }
    public void setTrainnumber(int trainnumber){
        this.trainnumber = trainnumber;
    }
    
}
