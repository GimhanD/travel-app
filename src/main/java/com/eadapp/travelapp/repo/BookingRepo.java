package com.eadapp.travelapp.repo;

import com.eadapp.travelapp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking, Integer> {
}
