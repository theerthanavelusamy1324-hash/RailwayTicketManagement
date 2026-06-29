package com.rail.railwayticketmanagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

public interface BookRepository extends JpaRepository<book,Integer>{
    @Query(value = "SELECT b.schedulename, s.source, s.destination, b.passengername, b.boarding FROM book b JOIN schedule s ON b.schedulename = s.train",nativeQuery = true)
    List<Object[]> getBookingDetails();

    
}
