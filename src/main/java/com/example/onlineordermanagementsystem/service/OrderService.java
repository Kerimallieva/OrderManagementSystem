package com.example.onlineordermanagementsystem.service;

import com.example.onlineordermanagementsystem.model.Order;
import org.springframework.stereotype.Service;
import com.example.onlineordermanagementsystem.repository.*;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrder(int id, String product, double price){
        Order order = new Order(id, product, price);
        orderRepository.save(order);
    }

    public Order getOrderById(int id) {
        return orderRepository.findById(id);
    }
}


