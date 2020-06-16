package com.example.demojpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demojpa.entity.Item;
import com.example.demojpa.repository.ItemRepository;

@Service
public class ItemService {
	
	private Logger LOG = LoggerFactory.getLogger(ItemRepository.class);

    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
	
    
    public Item getItemtone(Integer id) {
        LOG.info("Getting the Item with given id:" + id);
        return itemRepository.getOne(id);
    }
    
    public List<Item> findAll(){
    	
    	return itemRepository.findAll();
    }
    
    
    public void deleteItem(Integer id) {
    	try {
    		itemRepository.deleteById(id);
        } catch (Exception e) {
            LOG.error("An error occurred during deleting of Item:" + e.getMessage());
        }
    }
    
    public Item updateItem(Item updatedItem, Integer id) {
    	Item item2 = itemRepository.getOne(id);
        try {
        	item2.setChecked(updatedItem.getChecked());
        	item2.setDescription(updatedItem.getDescription());
            return itemRepository.save(item2);
        } catch (Exception e) {
            LOG.error("An error pccurred during update of product" + e.getMessage());
        }
        return item2;
    }
    
    public Item saveItem(Item item) {
    	Item item2;
        try {
            LOG.info("Saving product...");
            item2 = itemRepository.save(item);
            return item2;
        } catch (Exception e) {
            LOG.error("An error occurred during product saving:" + e.getMessage());
        }
        return new Item();
    }
}
