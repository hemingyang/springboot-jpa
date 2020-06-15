package com.example.demojpa.web;


import com.example.demojpa.entity.Item;
import com.example.demojpa.repository.ItemRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@Api(value = "/api/item", tags = "/api/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Item> findTems(){

        return  itemRepository.findAll();

    }

    @RequestMapping(value = "/add",method = RequestMethod.POST ,produces = "application/json; charset=utf-8")
    public Item addItem(@RequestBody Item item) {
        item.setId(null);
        item.setChecked("33");
        item.setDescription("wo");
        return itemRepository.saveAndFlush(item);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id) {
        updatedItem.setId(id);
        return itemRepository.saveAndFlush(updatedItem);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Integer id) {
        itemRepository.deleteById(id);
    }




}
