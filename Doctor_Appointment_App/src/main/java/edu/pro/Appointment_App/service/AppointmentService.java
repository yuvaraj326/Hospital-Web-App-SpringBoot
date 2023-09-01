//package edu.pro.Appointment_App.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//
//import edu.pro.Appointment_App.dao.AppointmentDao;
//import edu.pro.Appointment_App.dto.Appointment_App;
//import edu.pro.Appointment_App.repository.AppointmentRepo;
//import edu.pro.Appointment_App.util.ResponseStructure;
//
//@Service
//public class AppointmentService {
//
//	@Autowired
//	AppointmentDao dao;
//	
//	@Autowired
//	AppointmentRepo  repo;
//
//	//save
//	public ResponseStructure<Appointment_App> saveAppointment_App(Appointment_App appointment_App) {
//		
//		ResponseStructure<Appointment_App> rs=new ResponseStructure<>();
//		
//		rs.setStatus(HttpStatus.OK.value());
//		rs.setMessage("Appointmet was saved");
//		rs.setData(dao.saveAppointment(appointment_App));
//		
//		return rs;
//	}
//	
//	//getbyid
//	public ResponseStructure<Appointment_App> getByIdAppointment(int id) {
//		
//		ResponseStructure<Appointment_App> rs=new ResponseStructure<>();
//		
//		rs.setStatus(HttpStatus.OK.value());
//		rs.setMessage("Details of Appointment no "+id);
//		rs.setData(dao.getByIdAppointment(id));
//		
//		return rs;
//		
//	}
//	//getAll
//	public ResponseStructure<List<Appointment_App>> getAllAppointment(Appointment_App appointment_App) {
//		
//		ResponseStructure<List<Appointment_App>> rs=new ResponseStructure<>();
//		
//		rs.setStatus(HttpStatus.OK.value());
//		rs.setMessage("All the Appointment Details");
//		rs.setData(dao.getAllAppointment(appointment_App));
//		
//		return rs;
//		
//	}
//	
//	//update
//	public ResponseStructure<Appointment_App> updateAppoinment(int id, Appointment_App appointment_App) {
//		
//		Appointment_App a=repo.findById(id).get();
//		
//		if (a!=null) {
//			
//			appointment_App.setId(id);
//			
//			ResponseStructure<Appointment_App> rs=new ResponseStructure<>();
//			rs.setStatus(HttpStatus.OK.value());
//			rs.setMessage("updated!!!");
//			rs.setData(dao.updateAppointment( id,appointment_App));
//			return rs;
//			
//		} else {
//			
//			return null;
//			
//		}
//	}
//	
//	
//	//delete
//	public ResponseStructure<Appointment_App> deleteByIdAppointment(Appointment_App appointment_App,int id) {
//		
//		ResponseStructure<Appointment_App> rs =new ResponseStructure<>();
//		
//		rs.setStatus(HttpStatus.OK.value());
//		rs.setMessage("deteted!!!");
//		rs.setData(dao.deleteByIdAppointment(id, appointment_App));
//		
//		return rs;
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
