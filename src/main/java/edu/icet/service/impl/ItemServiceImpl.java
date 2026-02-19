package edu.icet.service.impl;

import edu.icet.model.dto.Item;
import edu.icet.repository.ItemRepo;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepo itemRepo;

    @Override
    public Boolean additem(Item item) {
        return itemRepo.addItem(item);
    }

    @Override
    public Boolean updateItem(Item item) {
        return null;
    }

    @Override
    public Boolean deleteItem(Integer id) {
        return null;
    }

    @Override
    public Item searchById(Integer id) {
        return null;
    }

    @Override
    public List<Item> getAll() {
        return itemRepo.getAll();
    }
}
