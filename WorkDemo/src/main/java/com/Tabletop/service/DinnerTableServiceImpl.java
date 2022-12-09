package com.Tabletop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tabletop.entities.DinnerTable;
import com.Tabletop.exceptions.ResourceNotFoundException;
import com.Tabletop.repos.DinnerTableRepo;

@Service
public class DinnerTableServiceImpl implements DinnerTableService
{
	private DinnerTableRepo dinnerTableRepo;
	
	@Autowired
	public DinnerTableServiceImpl(DinnerTableRepo dinnerTableRepo) 
	{
		this.dinnerTableRepo = dinnerTableRepo;
	}


	@Override
	public DinnerTable saveDinnerTable(DinnerTable dinnerTable) 
	{
		return dinnerTableRepo.save(dinnerTable);
	}


	@Override
	public DinnerTable getDinnerTable(Integer id) 
	{
		return dinnerTableRepo.findById(id).orElseThrow(()-> 
				new ResourceNotFoundException("Dinner Table", "id", id));
	}

	
	@Override
	public DinnerTable updateDinnerTable(DinnerTable dinnerTable, int id)
	{
		// check if dinner table Id exists in db
		DinnerTable existingDinnerTable = dinnerTableRepo.findById(id).orElseThrow(
							()-> new ResourceNotFoundException("Dinner table", "Id", id));
		
		existingDinnerTable.setMeal(dinnerTable.getMeal());
		dinnerTableRepo.save(existingDinnerTable);
		
		return existingDinnerTable;
	}
	

	@Override
	public void deleteDinnerTable(int id)
	{
		// check if dinner table Id exists in db
		dinnerTableRepo.findById(id).orElseThrow(
							()-> new ResourceNotFoundException("Dinner table", "Id", id));
		
		dinnerTableRepo.deleteById(id);
	}
	
	
//	@Override
//	public List<DinnerTable> getAllDinnerTables() 
//	{
//		return dinnerTableRepo.findAll();
//	}
	
	

}
