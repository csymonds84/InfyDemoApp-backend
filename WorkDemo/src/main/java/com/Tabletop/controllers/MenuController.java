package com.Tabletop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tabletop.entities.MenuItems;
import com.Tabletop.service.MenuService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/menu")
public class MenuController 
{
	private MenuService menuService;
	
	@Autowired
	public MenuController(MenuService menuService)
	{
		this.menuService = menuService; 
	}
	
	
	// http://localhost:8080/menu
	@GetMapping
	public List<MenuItems> getMenu()
	{
		return menuService.getMenu();
	}
	
	
}
