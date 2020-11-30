package com.ichromanrd.app.springbootsqlite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ichromanrd.app.springbootsqlite.model.Mount;
import com.ichromanrd.app.springbootsqlite.service.MountService;

@RestController
@RequestMapping("/mount")
public class MountController {
	
	@Autowired
	private MountService service;
	
	@GetMapping
	public List<Mount> list() {
		return service.list();
	}
	
	@PostMapping
	public void addOrUpdate(@RequestBody Mount req) {
		service.addOrUpdate(req);
	}

}
