package com.ichromanrd.app.springbootsqlite.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Mount {
	@Id
	private int id;
	private String name;
	private int elevation;
}
