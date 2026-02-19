package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.Item;

import java.util.List;

public interface ItemService {
    Boolean additem(Item item);
    Boolean updateItem(Item item);
    Boolean deleteItem(Integer id);
    Item searchById(Integer id);
    List<Item> getAll();
}

