package edu.pro.Appointment_App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.pro.Appointment_App.dao.AppointmentDao;
import edu.pro.Appointment_App.dto.Appointment_App;
//import edu.pro.Appointment_App.service.AppointmentService;
//import edu.pro.Appointment_App.util.ResponseStructure;

@RestController
@CrossOrigin
public class AppointmentController {

	
	@Autowired
	AppointmentDao dao;
	
//	@Autowired
//	AppointmentService service;
	
	@PostMapping("save")
	public Appointment_App saveAppointment(@RequestBody Appointment_App appointment_App) {
		return dao.saveAppointment(appointment_App);
	}
	
	
	@GetMapping("getbyid/{id}")
	public Appointment_App getByIdAppointment(@PathVariable int id) {
		return dao.getByIdAppointment(id);
	}
	
	@GetMapping("getall")
	public List<Appointment_App> getAllAppoinment(Appointment_App appointment_App){
		return dao.getAllAppointment(appointment_App);
	}
	
	@PutMapping("update/{id}")
	public Appointment_App updateAppoinment(@RequestBody Appointment_App appointment_App, @PathVariable int id) {
		return dao.updateAppointment(appointment_App,id );
	}
	
	@DeleteMapping("delete/{id}")
	public Appointment_App deleteByIdAppoinment(@PathVariable int id,Appointment_App appointment_App) {
		return dao.deleteByIdAppointment(id, appointment_App);
	}
	
	
}







