package com.Tabletop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tabletop.entities.DinnerTable;
import com.Tabletop.service.DinnerTableService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/dinnerTables")
public class DinnerTableController {
	
	private DinnerTableService dinnerTableService;
	
	@Autowired
	public DinnerTableController(DinnerTableService dinnerTableService) 
	{
		this.dinnerTableService = dinnerTableService;
	}

	// build create table REST API
	@PostMapping
	public ResponseEntity<DinnerTable> saveDinnerTable(@RequestBody DinnerTable dinnerTable) 
	{
		System.out.println("In controller save method");
		return new ResponseEntity<DinnerTable>(dinnerTableService.saveDinnerTable(dinnerTable), HttpStatus.CREATED);
	}
	
	
	// build get dinner table by Id REST API
	// http://localhost:8080/dinnerTables/1 *(or chosen Id)
	@GetMapping("{id}")
	public ResponseEntity<DinnerTable> getDinnerTableById(@PathVariable("id")Integer id)
	{
		return new ResponseEntity<DinnerTable>(dinnerTableService.getDinnerTable(id), HttpStatus.OK);
	}
	
	
	// build update dinner table REST API
	// http://localhost:8080/dinnerTables/1 *(or chosen Id)
	@PutMapping("{id}")
	public ResponseEntity<DinnerTable> updateDinnerTable(@PathVariable("id") int id, 
														@RequestBody DinnerTable dinnerTable)
	{
		return new ResponseEntity<DinnerTable>(dinnerTableService.updateDinnerTable(dinnerTable, id), HttpStatus.OK);
	}
	
	
	// build delete dinner table REST API
	// http://localhost:8080/dinnerTables/1 *(or chosen Id)
	@DeleteMapping("{id}")
	 public ResponseEntity<String> deleteDinnerTable(@PathVariable("id") int id)
	 {
		 dinnerTableService.deleteDinnerTable(id);
		 
		 return new ResponseEntity<String>("Dinner table deleted successfully", HttpStatus.OK);
	 }
	
	
	
	
	
//	@GetMapping
//	public List<DinnerTable> getAllDinnerTables()
//	{
//		return dinnerTableService.getAllDinnerTables();
//	}
	
	
}
