package edu.icet.repository.impl;

import edu.icet.model.dto.Order;
import edu.icet.repository.OrderRepo;

import java.util.List;

public class OrderRepoImpl implements OrderRepo {
    @Override
    public Boolean addOrder(Order order) {
        return null;
    }

    @Override
    public Boolean updateOrder(Order order) {
        return null;
    }

    @Override
    public Boolean deleteOrder(Integer id) {
        return null;
    }

    @Override
    public Order searchById(Integer id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return List.of();
    }
}
