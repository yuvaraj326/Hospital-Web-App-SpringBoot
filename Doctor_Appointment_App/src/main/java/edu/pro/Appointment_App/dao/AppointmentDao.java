package edu.pro.Appointment_App.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pro.Appointment_App.dto.Appointment_App;
import edu.pro.Appointment_App.repository.AppointmentRepo;

@Repository
public class AppointmentDao {

	@Autowired
	AppointmentRepo repo;
	
	//save
	public Appointment_App saveAppointment(Appointment_App appointment_App) {
		return repo.save(appointment_App);
	}
	
	//getbyid
	public Appointment_App getByIdAppointment(int id) {
		return repo.findById(id).get(); 
	}
	
	//getall
	public List<Appointment_App> getAllAppointment(Appointment_App appointment_App) {
		return repo.findAll();
	}
	
	//update
	public Appointment_App updateAppointment(Appointment_App appointment_App,int id) {
		Appointment_App a=repo.findById(id).get();
		if (a!=null) {
			
			appointment_App.setId(id);
			return repo.save(appointment_App);
		}else {
			return null;
		}
		
	} 
	
	//delete
	public Appointment_App deleteByIdAppointment(int id,Appointment_App appointment_App) {
		repo.deleteById(id); 
		return appointment_App;
	}
	
}













