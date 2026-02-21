package edu.icet.controller;

import edu.icet.model.dto.Item;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
@CrossOrigin
public class ItemController  {

    private  final ItemService itemService;

    @PostMapping("/additem")
    public Boolean additem(@RequestBody Item item) {
        return itemService.additem(item);
    }


    public Boolean updateItem(Item item) {
        return null;
    }


    public Boolean deleteItem(Integer id) {
        return null;
    }


    public Item searchById(Integer id) {
        return null;
    }

    @GetMapping("/getall")
    public List<Item> getAll() {
        return itemService.getAll();
    }
}
