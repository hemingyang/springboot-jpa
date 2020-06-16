package com.example.demojpa.web;


import com.example.demojpa.entity.Item;
import com.example.demojpa.service.ItemService;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@Api(value = "/api/item", tags = "/api/item")
public class ItemController {

    @Autowired
    private ItemService itemRepository;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Item> findTems(){

        return  itemRepository.findAll();

    }
    
    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public Item findone(Integer id){

        return  itemRepository.getItemtone(id);

    }

	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public Item addItem(@RequestBody Item item) {
       
        return itemRepository.saveItem(item);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id) {
        return itemRepository.updateItem(updatedItem,id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Integer id) {
        itemRepository.deleteItem(id);
    }




}
