package edu.icet.repository;

import edu.icet.model.dto.Item;
import edu.icet.model.dto.Order;

import java.util.List;

public interface OrderRepo {
    Boolean addOrder(Order order);
    Boolean updateOrder(Order order);
    Boolean deleteOrder(Integer id);
    Order searchById(Integer id);
    List<Order> getAll();
}
