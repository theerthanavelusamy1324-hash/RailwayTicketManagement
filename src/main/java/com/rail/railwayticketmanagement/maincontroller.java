package com.rail.railwayticketmanagement;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin("*")

public class maincontroller {
   
    @Autowired
    UserRepository repo;
    @PostMapping("/signup")
    public String signup(@RequestParam String name, @RequestParam String email,@RequestParam String phone, @RequestParam String password) {
        user existing = repo.findByEmail(email);
        if(existing != null){
            return "Mail Already exist";
        }
        user u = new user();
        u.setName(name);
        u.setEmail(email);
        u.setPhone(phone);
        u.setPassword(password);
        repo.save(u);
        return "Signup success";
    }
   
    
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
       user user = repo.findByEmail(email);
       if(user == null){
        return "User not found";
       }
       if(user.getPassword().equals(password)){
        return "success";
       }
       return "Invalid password";
       
    }
    @Autowired
    TrainRepository trainrepo;
    @GetMapping("/addtrain")
    public train addtrain(@RequestParam String trainname, @RequestParam int trainnumber) {
        train t = new train();
        t.setTrainname(trainname);
        t.setTrainnumber(trainnumber);
        return trainrepo.save(t);
        
    }
    @GetMapping("/traindetails")
    public List getTrain() {
        return trainrepo.findAll();
    }
    @GetMapping("/traincount")
    public long traincount() {
        return trainrepo.count();
    }
    @GetMapping("/trains")
    public List getTrains() {
        return trainrepo.findAll();
    }
    
    @Autowired
    DriverRepository driverrepo;
    @GetMapping("/adddriver")
    public driver adddriver(@RequestParam String drivername, @RequestParam int drivernumber) {
       driver d = new driver();
       d.setDrivername(drivername);
       d.setDrivernumber(drivernumber);
       return driverrepo.save(d);
    }
    @GetMapping("/driverdetails")
    public List getDriver() {
        return driverrepo.findAll();
    }
    @GetMapping("/drivercount")
    public long drivercount() {
        return driverrepo.count();
    }
    @GetMapping("/drivers")
    public List getDrivers() {
        return driverrepo.findAll();
    }
    
    @Autowired
    ScheduleRepository schedulerepo;
    @GetMapping("/scheduletrain")
    public schedule scheduletrain(@RequestParam String source, @RequestParam String destination, @RequestParam String train, @RequestParam String driver,@RequestParam String depaturetime, @RequestParam String arrivaltime, @RequestParam String stations) {
      schedule s = new schedule();
      s.setSource(source);
      s.setDestination(destination);
      s.setTrain(train);
      s.setDriver(driver);
      s.setDepaturetime(depaturetime);
      s.setArrivaltime(arrivaltime);
      s.setStations(stations);
      return schedulerepo.save(s);
    }
    @GetMapping("/scheduledetails")
    public List getSchedule() {
        return schedulerepo.findAll();
    }
    @GetMapping("/schedulecount")
    public long schedulecount() {
        return schedulerepo.count();

    }
    @GetMapping("/schedules")
    public List getSchedules() {
        return schedulerepo.findAll();
    }
   
    
    
    @Autowired
    BookRepository bookrepo;
    @GetMapping("/bookticket")
    public book bookticket(@RequestParam String schedulename, @RequestParam String boarding, @RequestParam String passengername, @RequestParam int passengerage) {
       
        book b = new book();
        b.setSchedulename(schedulename);
        b.setBoarding(boarding);
        b.setPassengername(passengername);
        b.setPassengerage(passengerage);
       
        
        return bookrepo.save(b);
    }
    @GetMapping("/bookdetails")
    public List getBook() {
        return bookrepo.findAll();
    }
    @GetMapping("/bookcount")
    public long bookcount() {
        return bookrepo.count();
    }
    @GetMapping("/recentbookings")
    public List<book> recentbookings(){
        return bookrepo.findAll();

    }

    
    
}
