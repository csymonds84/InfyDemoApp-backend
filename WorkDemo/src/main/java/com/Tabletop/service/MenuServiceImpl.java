package com.Tabletop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tabletop.entities.MenuItems;
import com.Tabletop.repos.MenuRepo;

@Service
public class MenuServiceImpl implements MenuService 
{
	 private MenuRepo menuRepo;
	 
	 @Autowired
	 public MenuServiceImpl(MenuRepo menuRepo)
	 {
		 this.menuRepo = menuRepo;
	 }
	
	
	@Override
	public List<MenuItems> getMenu()
	{
		return menuRepo.findAll();
	}
}
