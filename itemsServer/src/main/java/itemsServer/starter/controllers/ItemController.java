package itemsServer.starter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import itemsServer.starter.beans.ItemBean;
import itemsServer.starter.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(path="/items", method=RequestMethod.GET)
	public List<ItemBean> showItems(){
		return itemService.showItems();
	}
}
