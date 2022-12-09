package com.Tabletop.service;

import com.Tabletop.entities.DinnerTable;


public interface DinnerTableService {

	DinnerTable saveDinnerTable(DinnerTable dinnerTable);
	
	DinnerTable getDinnerTable(Integer id);
	
	DinnerTable updateDinnerTable(DinnerTable dinnerTable, int id);
	
	void deleteDinnerTable(int id);
	
//	List<DinnerTable> getAllDinnerTables();
	
}
