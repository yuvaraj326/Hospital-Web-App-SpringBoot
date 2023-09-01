package edu.pro.Appointment_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pro.Appointment_App.dto.Appointment_App;

public interface AppointmentRepo extends JpaRepository<Appointment_App, Integer> {

}
