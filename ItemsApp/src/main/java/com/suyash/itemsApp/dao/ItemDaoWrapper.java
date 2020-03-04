package com.suyash.itemsApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suyash.itemsApp.entities.ItemEntity;


public interface ItemDaoWrapper extends JpaRepository<ItemEntity, String> {

	
}
