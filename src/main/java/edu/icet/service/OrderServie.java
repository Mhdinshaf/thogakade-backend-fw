package edu.icet.service;

import edu.icet.model.dto.Item;
import edu.icet.model.dto.Order;

import java.util.List;

public interface OrderServie {
    Boolean addOrder(Order order);
    Boolean updateOrder(Order order);
    Boolean deleteOrder(Integer id);
    Order searchById(Integer id);
    List<Order> getAll();
}
