package com.suyash.itemsApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suyash.itemsApp.beans.ItemBean;
import com.suyash.itemsApp.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping(path="/")
	public String welcome() {
		return "Welcome to Items DB Server API";
	}

	
	@RequestMapping(path="/items", method=RequestMethod.GET)
	public List<ItemBean> getAllItems(){
		
		List<ItemBean> itemsList = new ArrayList<>();
		itemsList = itemService.getAllItems();
		return itemsList;
	}
	
	
	@RequestMapping(path="/items/{id}", method=RequestMethod.GET)
	public ItemBean getItemById(@PathVariable(value="id") String id) {	
		return itemService.getItemById(id);
	}
	
	
	@RequestMapping(path="/items", method=RequestMethod.POST)
	public String saveItem(@RequestBody ItemBean bean) throws Exception {
		return itemService.saveItem(bean);
	}
}
