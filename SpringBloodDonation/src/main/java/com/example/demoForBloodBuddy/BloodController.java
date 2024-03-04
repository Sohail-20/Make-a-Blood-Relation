package com.example.demoForBloodBuddy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
@CrossOrigin

public class BloodController {
	@Autowired
	bloodRepo  bloodRepo;
	@PostMapping("/api/blood")
	public ResponseEntity<Blood> saveDonar(@RequestBody Blood blood){
		return new ResponseEntity<>(bloodRepo.save(blood),HttpStatus.CREATED);
	}
	@GetMapping("/api/blood")
	public ResponseEntity<List<Blood>> getStudents() {
		return new ResponseEntity<>(bloodRepo.findAll(),HttpStatus.OK);
		}
	@GetMapping("/api/blood/{id}")
	public ResponseEntity<Blood> getStudent(@PathVariable long id) {
		java.util.Optional<Blood>blood= bloodRepo.findById(id);
		if(blood.isPresent()) {
			return new ResponseEntity<>(blood.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
	@PutMapping("/api/blood/{id}")
	public ResponseEntity<Blood> updateStudent(@PathVariable long id, @RequestBody Blood blud) {
		java.util.Optional<Blood>blood= bloodRepo.findById(id);
		if(blood.isPresent()) {
			blood.get().setName(blud.getName());
			blood.get().setEmail(blud.getEmail());
			blood.get().setAddress(blud.getAddress());
			blood.get().setAge(blud.getAge());
			blood.get().setBloodGroup(blud.getBloodGroup());
			blood.get().setNumber(blud.getNumber());
			
			
			
			return new ResponseEntity<>(bloodRepo.save(blood.get()),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
	@DeleteMapping("/api/blood/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
		java.util.Optional<Blood>blood= bloodRepo.findById(id);
		if(blood.isPresent()) {
			bloodRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
	}


