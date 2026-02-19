package edu.icet.repository.impl;

import edu.icet.model.dto.Item;
import edu.icet.repository.ItemRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepoImpl implements ItemRepo {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Boolean addItem(Item item) {
        String sql = "INSERT INTO item VALUES (?, ?, ?, ?, ?)";
        int result = jdbcTemplate.update(sql,
                item.getItemCode(),
                item.getDescription(),
                item.getPackSize(),
                item.getUnitPrice(),
                item.getQtyOnHand()
        );
        return result > 0;
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

        String sql = "SELECT * FROM item";
        List<Item> itemList = jdbcTemplate.query(sql, (rs, rowNum) -> {
            Item item = new Item();
            item.setItemCode(rs.getString(1));
            item.setDescription(rs.getString(2));
            item.setPackSize(rs.getString(3));
            item.setUnitPrice(rs.getDouble(4));
            item.setQtyOnHand(rs.getInt(5));
            return item;
        });
        return itemList;
    }
}
