package com.example.onlineordermanagementsystem.repository;

import com.example.onlineordermanagementsystem.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public void save(Order order){
        orders.add(order);
        System.out.println("Заказ сохранен: " + order);
    }

    public Order findById(int id){
        return orders.stream()
                .filter(order -> order.getId()==id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Заказ не найден"));
    }
}
