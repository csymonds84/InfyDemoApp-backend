package com.Tabletop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tabletop.entities.MenuItems;

@Repository
public interface MenuRepo extends JpaRepository<MenuItems, Integer>
{

}
