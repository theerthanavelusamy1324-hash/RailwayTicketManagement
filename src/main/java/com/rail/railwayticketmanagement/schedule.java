package com.rail.railwayticketmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="schedule")

public class schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String source;
    private String destination;
     private String train;
      private String driver;
       private String depaturetime;
       private String arrivaltime;
       private String stations;
       public schedule(){}
       public int getId(){
        return id;
       }
       public void setId(int id){
        this.id = id;
       }
       public String getSource(){
        return source;
       }
       public void setSource(String source){
        this.source = source;
       }
       public String getDestination(){
        return destination;
       }
       public void setDestination(String destination){
        this.destination = destination;
       }
       public String getTrain(){
        return train;
       }
       public void setTrain(String train){
        this.train = train;
       }
       public String getDriver(){
        return driver;
       }
       public void setDriver(String driver){
        this.driver = driver;
       }
       public String getDepaturetime(){
        return depaturetime;
       }
       public void setDepaturetime(String depaturetime){
        this.depaturetime = depaturetime;
       }
       public String getArrivaltime(){
        return arrivaltime;
       }
       public void setArrivaltime(String arrivaltime){
        this.arrivaltime = arrivaltime;
       }
        public String getStations(){
        return stations;
       }
       public void setStations(String stations){
        this.stations = stations;
       }
    
}
