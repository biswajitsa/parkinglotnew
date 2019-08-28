package com.skillenza.parkinglotjava;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.skillenza.parkinglotjava.ParkingLot;


@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long>{
	ParkingLot findByLot(int lot);
}
