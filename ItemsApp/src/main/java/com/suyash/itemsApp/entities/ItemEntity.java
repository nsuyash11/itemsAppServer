package com.suyash.itemsApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class ItemEntity {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String name;
	private String description;
	
	
	public ItemEntity() {
		super();
	}
	public ItemEntity(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "ItemEntity [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
