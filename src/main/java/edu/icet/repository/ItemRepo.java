package edu.icet.repository;

import edu.icet.model.dto.Customer;
import edu.icet.model.dto.Item;

import java.util.List;

public interface ItemRepo {
    Boolean addItem(Item item);
    Boolean updateItem(Item item);
    Boolean deleteItem(Integer id);
    Item searchById(Integer id);
    List<Item> getAll();
}
