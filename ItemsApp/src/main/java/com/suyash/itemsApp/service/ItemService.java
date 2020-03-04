package com.suyash.itemsApp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suyash.itemsApp.beans.ItemBean;
import com.suyash.itemsApp.dao.ItemDaoWrapper;
import com.suyash.itemsApp.entities.ItemEntity;

@Service
public class ItemService {
	
	@Autowired
	private ItemDaoWrapper itemDaoWrapper;
	
	
	public List<ItemBean> getAllItems() {
		List<ItemBean> itemsList = new ArrayList<>();
		
		Iterable<ItemEntity> entities = itemDaoWrapper.findAll();
		
		for(ItemEntity entity : entities) {
			ItemBean bean = new ItemBean();
			BeanUtils.copyProperties(entity, bean);
			itemsList.add(bean);
			System.out.println("From service layer returning beanList - " + itemsList);
		}
		
		return itemsList;
	}
	
	
	public ItemBean getItemById(String id) {
		ItemEntity retEntity = new ItemEntity();
		retEntity =	itemDaoWrapper.findById(id).orElse(null);
		
		if(retEntity != null) {
			ItemBean retBean = new ItemBean();
			BeanUtils.copyProperties(retEntity, retBean);
			
			return retBean;	
		}
		else {
			return null;
		}
		
	}
	
	public String saveItem(ItemBean bean) throws Exception {
		
		ItemEntity retEntity = new ItemEntity();
		
		ItemEntity entity = new ItemEntity();
		BeanUtils.copyProperties(bean, entity);
		
		try {
			retEntity = itemDaoWrapper.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Some error while saving item...!");
		}
		
		if(retEntity != null) {
			return "Entity Saved successfully";
		}
		else {
			return "Entity was not saved";
		}
	}
}
