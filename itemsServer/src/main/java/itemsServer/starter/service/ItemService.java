package itemsServer.starter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import itemsServer.starter.beans.ItemBean;

@Service
public class ItemService {

	private List<ItemBean> itemsList = Arrays.asList(
			new ItemBean("1", "Petrol", "used to run bikes"),
			new ItemBean("2", "Diesel", "used to run cars"),
			new ItemBean("3", "Kerosene", "used to ignite stoves"),
			new ItemBean("4", "Oil", "used to light lamps")
			);
	
	public List<ItemBean> showItems(){
		return itemsList;
	}
}
