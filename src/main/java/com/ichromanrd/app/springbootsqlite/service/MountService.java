package com.ichromanrd.app.springbootsqlite.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ichromanrd.app.springbootsqlite.model.Mount;
import com.ichromanrd.app.springbootsqlite.model.MountRepository;

@Service
public class MountService {
	
	@Autowired
	private MountRepository repository;
	
	public List<Mount> list() {
		List<Mount> result = new ArrayList<Mount>();
		repository.findAll().forEach(result::add);
		return result;
	}
	
	public void addOrUpdate(Mount mount) {
		repository.save(mount);
	}
}
