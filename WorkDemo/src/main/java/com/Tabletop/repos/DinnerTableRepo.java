package com.Tabletop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tabletop.entities.DinnerTable;

@Repository
public interface DinnerTableRepo extends JpaRepository<DinnerTable, Integer> {

}
